package ru.itpark.businesscards.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.businesscards.dto.RegistrationRequestDto;
import ru.itpark.businesscards.entity.UserEntity;
import ru.itpark.businesscards.exeptions.UsernameAlreadyExistsException;
import ru.itpark.businesscards.repository.UserRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RegistrationService {

    private final UserRepository userRepository;
    private final PersonService personService;
    private final PasswordEncoder passwordEncoder;

    public void register(RegistrationRequestDto dto) {
        var userOptional = userRepository.findByUsername(dto.getUsername());
        if (userOptional.isEmpty()) {
            var user = new UserEntity(
                    0L,
//                    dto.getName(),
                    dto.getUsername(),
                    passwordEncoder.encode(dto.getPassword()),
                    List.of(new SimpleGrantedAuthority("ROLE_USER")),
                    true,
                    true,
                    true,
                    true
            );
            userRepository.save(user);
            personService.create(dto.getPersonalInfo(), user);
        } else if (userOptional.get().isEnabled()) {
            throw new UsernameAlreadyExistsException(dto.getUsername());

        }
    }

}
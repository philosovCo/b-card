package ru.itpark.businesscards.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.businesscards.constant.Url;
import ru.itpark.businesscards.dto.AuthenticationTokenRequestDto;
import ru.itpark.businesscards.dto.AuthenticationTokenResponseDto;
import ru.itpark.businesscards.dto.RegistrationRequestDto;
import ru.itpark.businesscards.service.AuthenticationService;
import ru.itpark.businesscards.service.RegistrationService;

@RestController
@RequestMapping(Url.Registration.FULL)
@RequiredArgsConstructor
public class RegistrationRestController {

    private final RegistrationService registrationService;
    private final AuthenticationService authenticationService;

    @PostMapping
    public AuthenticationTokenResponseDto register(@RequestBody RegistrationRequestDto dto) {
        registrationService.register(dto);
        return authenticationService.authenticate(new AuthenticationTokenRequestDto(dto.getPassword(),
                                                                                    dto.getUsername()));
    }

}

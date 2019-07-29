package ru.itpark.businesscards.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.businesscards.dto.Card;
import ru.itpark.businesscards.exeptions.CardNotFoundException;
import ru.itpark.businesscards.mapper.CardMapper;
import ru.itpark.businesscards.repository.CardRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class CardService {
    private final CardRepository repository;

    public Card findById(long id) {
        return repository.findById(id)
                .map(CardMapper::toModel)
                .orElseThrow(CardNotFoundException::new);

    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}

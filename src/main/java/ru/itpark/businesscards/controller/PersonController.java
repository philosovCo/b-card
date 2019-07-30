package ru.itpark.businesscards.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.businesscards.constant.Url;
import ru.itpark.businesscards.dto.Person;
import ru.itpark.businesscards.entity.UserEntity;
import ru.itpark.businesscards.service.PersonService;

@RestController
@RequiredArgsConstructor
@RequestMapping(Url.Person.FULL)
public class PersonController {

    private final PersonService service;

    @GetMapping(Url.Id.PART)
    public Person findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Person create(@RequestBody Person card, @AuthenticationPrincipal UserEntity user) {
        return service.create(card, user);
    }

    @PutMapping()
    public Person update(@RequestBody Person card, @AuthenticationPrincipal UserEntity user) {
        return service.update(card, user);
    }

    @DeleteMapping(Url.Id.PART)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}

package ru.itpark.businesscards.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.itpark.businesscards.constant.Url;
import ru.itpark.businesscards.dto.Person;
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
    public Person create(@RequestBody Person card) {
        return service.create(card);
    }

    @PutMapping(Url.Id.PART)
    public Person update(@PathVariable Long id, @RequestBody Person card) {
        card.setId(id);
        return service.update(card);
    }

    @DeleteMapping(Url.Id.PART)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}

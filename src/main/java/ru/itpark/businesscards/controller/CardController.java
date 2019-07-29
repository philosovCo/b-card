package ru.itpark.businesscards.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.itpark.businesscards.constant.Url;
import ru.itpark.businesscards.dto.Card;
import ru.itpark.businesscards.service.CardService;

@RestController
@RequiredArgsConstructor
@RequestMapping(Url.Cutaway.FULL)
public class CardController {
    private final CardService service;

    @GetMapping(Url.Id.PART)
    public Card findById(@PathVariable long id){
        return service.findById(id);
    }

    @PostMapping()
    public void create(@RequestBody Card card){

    }

    @PutMapping(Url.Id.PART)
    public void update(@PathVariable Long id, @RequestBody Card card){

    }

    @DeleteMapping(Url.Id.PART)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        service.delete(id);
    }

}

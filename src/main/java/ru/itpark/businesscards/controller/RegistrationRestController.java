package ru.itpark.businesscards.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.businesscards.constant.Url;
import ru.itpark.businesscards.dto.RegistrationRequestDto;
import ru.itpark.businesscards.service.RegistrationService;

@RestController
@RequestMapping(Url.Registration.FULL)
@RequiredArgsConstructor
public class RegistrationRestController {
  private final RegistrationService service;

  @PostMapping
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void register(@RequestBody RegistrationRequestDto dto) {
    service.register(dto);
  }
}

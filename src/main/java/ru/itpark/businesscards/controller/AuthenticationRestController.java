package ru.itpark.businesscards.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.businesscards.constant.Url;
import ru.itpark.businesscards.dto.AuthenticationTokenRequestDto;
import ru.itpark.businesscards.dto.AuthenticationTokenResponseDto;
import ru.itpark.businesscards.service.AuthenticationService;

@RestController
@RequestMapping(Url.Authentication.FULL)
@RequiredArgsConstructor
public class AuthenticationRestController {
  private final AuthenticationService service;

  @PostMapping
  public AuthenticationTokenResponseDto authenticate(@RequestBody AuthenticationTokenRequestDto dto) {
    return service.authenticate(dto);
  }
}

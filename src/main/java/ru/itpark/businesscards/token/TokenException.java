package ru.itpark.businesscards.token;


import org.springframework.security.core.AuthenticationException;

public class TokenException extends AuthenticationException {
  public TokenException(String msg, Throwable t) {
    super(msg, t);
  }

  public TokenException(String msg) {
    super(msg);
  }

  public TokenException() {
    super("Token invalid");
  }

}

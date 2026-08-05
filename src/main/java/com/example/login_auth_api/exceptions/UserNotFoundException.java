package com.example.login_auth_api.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException() { super("Usuário não foi encontrado!"); }
    public UserNotFoundException(String message) { super(message); }
}

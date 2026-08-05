package com.example.login_auth_api.exceptions;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(){ super("Erro ao autenticar usuário!"); }
    public AuthenticationException(String message) {
        super(message);
    }
}

package br.com.example.vzan.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}


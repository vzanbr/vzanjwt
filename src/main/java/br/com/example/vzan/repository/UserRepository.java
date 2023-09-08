package br.com.example.vzan.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<SecurityProperties.User, String> {
    UserDetails findByLogin(String login);
}

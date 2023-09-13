package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void create(User user);

    User read(Long id);

    List<User> readAll();

    void updateUser(User user);

    void delete(Long id);
}

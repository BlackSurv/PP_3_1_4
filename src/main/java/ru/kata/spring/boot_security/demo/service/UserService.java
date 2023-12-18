package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService extends UserDetailsService {

    void add(User user);

    void deleteById(Long id);

    void update(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String username);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}

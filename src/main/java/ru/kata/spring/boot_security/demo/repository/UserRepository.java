package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u from User u JOIN FETCH u.roles WHERE u.username = ?1")
    Optional<User> findByUsername(String username);

    @Query("SELECT u from User u JOIN FETCH u.roles WHERE u.email = ?1")
    Optional<User> findByEmail(String username);

    @Override
    @Query("SELECT DISTINCT u from User u JOIN FETCH u.roles")
    List<User> findAll();

    @Override
    @Query("SELECT DISTINCT u from User u JOIN FETCH u.roles WHERE u.id = ?1")
    User getById(Long id);
}

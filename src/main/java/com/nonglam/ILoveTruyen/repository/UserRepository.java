package com.nonglam.ILoveTruyen.repository;

import com.nonglam.ILoveTruyen.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailEqualsAndPasswordEquals(String email, String password);

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}

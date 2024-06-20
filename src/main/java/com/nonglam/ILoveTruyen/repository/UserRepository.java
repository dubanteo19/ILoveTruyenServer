package com.nonglam.ILoveTruyen.repository;

import com.nonglam.ILoveTruyen.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmailEqualsAndPasswordEquals(String email, String password);
    boolean existsByEmail(String email);
}

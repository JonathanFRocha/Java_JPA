package com.jonathanferreira.testingJpa.service;

import com.jonathanferreira.testingJpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

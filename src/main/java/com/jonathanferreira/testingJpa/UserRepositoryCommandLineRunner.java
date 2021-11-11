package com.jonathanferreira.testingJpa;

import com.jonathanferreira.testingJpa.entity.User;
import com.jonathanferreira.testingJpa.service.UserDAO;
import com.jonathanferreira.testingJpa.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jonathan Ferreira Interface", "Admin");

        var insertedUser = userRepository.save(user);
        log.info("new user was created: " + insertedUser );

        var optionalUser = userRepository.findById(2L);
        log.info("user was retrieved: " + optionalUser );

        var users = userRepository.findAll();
        log.info("users retrieved: " + users );

    }
}

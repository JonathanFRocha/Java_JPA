package com.jonathanferreira.testingJpa;

import com.jonathanferreira.testingJpa.entity.User;
import com.jonathanferreira.testingJpa.service.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoCommandLineRunner.class);

    @Autowired
    private UserDAO userDao;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jonathan", "Admin");
        long insertedUserID = userDao.insert(user);
        log.info("new user was created: " + user );
    }
}

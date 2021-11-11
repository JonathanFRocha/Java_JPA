package com.jonathanferreira.testingJpa.service;

import com.jonathanferreira.testingJpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert (User user) {

        entityManager.persist(user);
        return user.getId();
    }
}

package com.dao;

import com.models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO {

    EntityManager entityManager = Persistence.createEntityManagerFactory("NewPersistenceUnit").createEntityManager();

    public void addUser(UserEntity userEntity){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(userEntity);
        transaction.commit();
    }

    public List<UserEntity> getAllUserList(){
        return entityManager.createQuery("SELECT user_alias FROM UserEntity user_alias").getResultList();
    }
}

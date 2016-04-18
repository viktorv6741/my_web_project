package com.service;

import com.dao.UserDAO;
import com.models.UserEntity;

import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        synchronized (UserService.class) {
            if (userDAO == null) {
                userDAO = new UserDAO();
            }
        }
        return userDAO;
    }

    public void addUser(UserEntity userEntity) {
        getUserDAO().addUser(userEntity);
    }

    public List<UserEntity> getUsers() {
        return getUserDAO().getAllUserList();
    }
}

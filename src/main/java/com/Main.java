package com;

import com.models.UserEntity;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("userName");
        String email = req.getParameter("userEmail");

        UserService userService = new UserService();
        List<UserEntity> userList = userService.getUsers();

        userService.addUser(new UserEntity(name, email));

        req.setAttribute("users", userList);
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }
}


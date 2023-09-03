/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.controllers;

import com.hotelAlura.DAO.UserDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.User;


/**
 *
 * @author jaime
 */
public class UserController {
    private static final ConnectionFactory connection = new ConnectionFactory();
    
    public static boolean authenticate(String userName, String userPassword){
            if(!userName.isEmpty()  || !userPassword.isEmpty()){
                UserDAO userDAO = new UserDAO(connection.doConnection());
                User user = new User( userName, userPassword);
                return userDAO.authenticate(user);
            }else{
                return false;
            }
    }
}

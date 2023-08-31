/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.Controllers;

import com.hotelAlura.DAO.UserDAO;
import com.hotelAlura.Factory.ConnectionFactory;
import com.hotelAlura.Models.User;


/**
 *
 * @author jaime
 */
public class UserController {
    private static ConnectionFactory connection = new ConnectionFactory();
    
    public static boolean save(String userName, String userPassword){
            if(!userName.isEmpty()  || !userPassword.isEmpty()){
                UserDAO userDAO = new UserDAO(connection.doConnection());
                User user = new User( userName, userPassword);
                
                var result = userDAO.validate(user);
                return result;
            }else{
                return false;
            }
    }
}

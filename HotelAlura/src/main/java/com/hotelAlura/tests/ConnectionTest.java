/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.tests;

import com.hotelAlura.DAO.UserDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.User;

/**
 *
 * @author jaime
 */
public class ConnectionTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        UserDAO userDao;
        ConnectionFactory connection = new ConnectionFactory();
        userDao = new UserDAO(connection.doConnection());
        
        var list = userDao.read();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("ID de Usuario: %d%nNombre de usuario: %s%n", list.get(i).getId(),
                    list.get(i).getUsername());
        }

    }

}

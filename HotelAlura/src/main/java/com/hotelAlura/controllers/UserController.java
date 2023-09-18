package com.hotelAlura.controllers;

import com.hotelAlura.DAO.UserDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.User;

/**
 * Esta clase sirve como puente entre los paneles y las clases de tipo DAO que
 * interactuan con la base de datos aqui es donde se declara y realiza la
 * coneccion a la base de datos que es mandada a la clase DAO
 *
 * @author jaime
 */
public class UserController {

    private static final ConnectionFactory connection = new ConnectionFactory();

    /**
     *
     * @param userName
     * @param userPassword realiza la combrobacion de los parametros userName y
     * userPassword antes de realizar la autenticacion a la base de datos
     * @return devuelve true o false en caso de ser autenticado o no con exito
     */
    public static boolean authenticate(String userName, String userPassword) {
        if (!userName.isEmpty() || !userPassword.isEmpty()) {
            UserDAO userDAO = new UserDAO(connection.doConnection());
            User user = new User(userName, userPassword);
            return userDAO.authenticate(user);
        } else {
            return false;
        }
    }
}

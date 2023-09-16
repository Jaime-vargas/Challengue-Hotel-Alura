/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.controllers;

import com.hotelAlura.DAO.ReservationDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.Guest;
import com.hotelAlura.models.Reservation;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class ReservationController {
    
    private static final ConnectionFactory connection = new ConnectionFactory();
    private static final ReservationDAO reservationDAO = new ReservationDAO(connection.doConnection());
    
    public static boolean save(Reservation reservation){
        try {
            return reservationDAO.save(reservation);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error was ocurred", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }    
}

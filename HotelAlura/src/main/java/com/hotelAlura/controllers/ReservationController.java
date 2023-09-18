package com.hotelAlura.controllers;

import com.hotelAlura.DAO.ReservationDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.Reservation;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Esta clase sirve como puente entre los paneles y las clases de tipo DAO que interactuan con la base de datos
 * aqui es donde se declara y realiza la coneccion a la base de datos que es mandada a la clase DAO
 * @author jaime
 */
public class ReservationController {
    
    private static final ConnectionFactory connection = new ConnectionFactory();
    private static final ReservationDAO reservationDAO = new ReservationDAO(connection.doConnection());
    /**
     * 
     * @param reservation
     * se manda como parametro un objeto del tipo reservacion para ser almacenado
     * @return 
     * devuelve true o false depende si tuvo exito o no y en caso de un error avisa al usuario mediante un joptionpane
     */
    public static boolean save(Reservation reservation){
        try {
            return reservationDAO.save(reservation);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error was ocurred", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    /**
     * pide a la clase DAO buscar en la base de datos todas las reservaciones 
     * @return 
     * devuelve una lista con todos los registros encontrados
     */
    public static List<Reservation> getReservationList() {
        return reservationDAO.read();
    }
}

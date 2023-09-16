/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.controllers;

import com.hotelAlura.DAO.GuestDAO;
import com.hotelAlura.DAO.UserDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.Guest;
import com.hotelAlura.models.User;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author jaime
 */
public class GuestController {

    
    private static final ConnectionFactory connection = new ConnectionFactory();
    private static final GuestDAO guestDAO = new GuestDAO(connection.doConnection());
    
    public static List<Guest> getGuestsList() {
        return guestDAO.read();
    }
    public static Guest readByID (Integer guestId){
        return guestDAO.readByID(guestId);
    }
    public static boolean update(Guest guest){
        return guestDAO.update(guest);
    }
    
    public static boolean delete(Guest guest){
        return guestDAO.delete(guest);
    }
    
    public static boolean validateGuestData(Guest guest){
        //metodo para validar datos
        return false;
    }
    public static boolean save(Guest guest){
        try {
            return guestDAO.save(guest);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Guest already exists in database", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }    
    /**
     * Este metodo sirve para verificar que datos como nombre y apellido
     * contengan solo letras ademas tambien verifica que no existan espacios
     * dobles ni espacios al final de las cadenas por ultimo convierte todas las
     * letras a minuscula
     * @param text 
     * es el texto mandado para poder ser verificado 
     * @return 
     * devuelve true en caso de que el texto sea valido
     */
    public static boolean validateField(String text) {
        if (text != null && !text.trim().isEmpty()) {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$"); // patron regex para verificar que solo existan letras 
            Matcher matcher = pattern.matcher(text);
            return matcher.find();
        }
        return false;
    }
    
    public static  String processText(String text){
        String treatedText;
        treatedText = text.replaceAll("^\\s+", ""); //espacios en el inicio
        treatedText = treatedText.replaceAll("\\s+", " "); //espacios en el centro 
        treatedText = treatedText.replaceAll("\\s+$", ""); //quita espacio final
        treatedText = treatedText.toLowerCase();
        return treatedText;
    }

    public static boolean validateDate(LocalDate dateOfBirth) {
        LocalDate todayDate = LocalDate.now();
        LocalDate minimumAge = todayDate.minusYears(18);
        return dateOfBirth.isBefore(minimumAge) || dateOfBirth.isEqual(minimumAge);
    }
}

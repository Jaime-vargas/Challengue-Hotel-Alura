package com.hotelAlura.controllers;

import com.hotelAlura.DAO.GuestDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.Guest;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * Esta clase sirve como puente entre los paneles y las clases de tipo DAO que interactuan con la base de datos
 * aqui es donde se declara y realiza la coneccion a la base de datos que es mandada a la clase DAO
 * @author jaime
 */
public class GuestController {

    private static final ConnectionFactory connection = new ConnectionFactory();
    private static final GuestDAO guestDAO = new GuestDAO(connection.doConnection());
/**
 * Llama al metodo leer de la clase DAO
 * @return recibe una lista con los registros encontrados del tipo Guest
 */    
    public static List<Guest> getGuestsList() {
        return guestDAO.read();
    }
/**
 * 
 * @param guestId recibe un objeto tipo Integer para realizar la busqueda de un Huesped en la base de datos
 * @return devuelve un objeto del tipo Guest con los datos encontrados 
 */
    public static Guest readByID (Integer guestId){
        return guestDAO.readByID(guestId);
    }
    /**
     * recibe como parametro un objeto del tipo Guest para extraer y actualizar datos 
     * @param guest
     * @return devuelve true o false para saber si se tuvo exito o no
     */
    public static boolean update(Guest guest) {
        return guestDAO.update(guest);
    }
/**
 * Se manda un objeto tipo Guest el cual debe contener un id de un registro gusrdado y este lo elimina de la base de datos 
 * @param guest
 * @return devuelve true o false para saber si se tuvo exito o no
 */
    public static boolean delete(Guest guest){
        return guestDAO.delete(guest);
    }
    /**
     * Este metodo manda un objeto de tipo Guest para almacenarse en la base de datos
     * @param guest
     * @return
     * en caso de error manda false y un aviso al usuario como Joptionpane
     */
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
    /**
     * 
     * @param text
     * se recibe como parametro un string al cual se le da tratamiento quitando los espacios delante y al final de la cadena 
     * asi como los espacios dobles o mas reduciendo solo a un espacio.
     * @return 
     * devuelve la misma cadena de texto pero ya "tratada con este proceso"
     */
    public static  String processText(String text){
        String treatedText;
        treatedText = text.replaceAll("^\\s+", ""); //espacios en el inicio
        treatedText = treatedText.replaceAll("\\s+", " "); //espacios en el centro 
        treatedText = treatedText.replaceAll("\\s+$", ""); //quita espacio final
        treatedText = treatedText.toLowerCase();
        return treatedText;
    }
/**
 * Se valida si una fecha es 18 años atras, esto como parte de la logica de negocio ya que no permite el registro de personas menores de edad (18 años)
 * @param dateOfBirth
 * se manda como parametro la fecha a ser verificada
 * @return 
 * devuelve true o false en caso de ser mayor de edad o no-
 */
    public static boolean validateDate(LocalDate dateOfBirth) {
        LocalDate todayDate = LocalDate.now();
        LocalDate minimumAge = todayDate.minusYears(18);
        return dateOfBirth.isBefore(minimumAge) || dateOfBirth.isEqual(minimumAge);
    }
}

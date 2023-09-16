/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.tests;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jaime
 */
public class ValidacionTest {

    public static void main(String[] args) {
            LocalDate date = LocalDate.of(2023, 12, 5);
 
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
    public static boolean fieldValidation(String text) {
        if (text != null && !text.trim().isEmpty()) {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$"); // patron regex para verificar que solo existan letras 
            Matcher matcher = pattern.matcher(text);
            return matcher.find();
        }
        return false;
    }
    
    public static  String treatedText(String text){
        String treatedText;
        treatedText = text.replaceAll("^\\s", ""); //espacios en el inicio
        treatedText = treatedText.replaceAll("\\s+", " "); //espacios en el centro 
        treatedText = treatedText.replaceAll("\\s+$", ""); //quita espacio final
        treatedText = treatedText.toLowerCase();
        return treatedText;
    }


    
    
}



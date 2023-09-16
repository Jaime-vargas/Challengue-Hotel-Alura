package com.hotelAlura.tests;

import com.hotelAlura.DAO.GuestDAO;
import com.hotelAlura.factory.ConnectionFactory;
import com.hotelAlura.models.Guest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gpt {

    private static final ConnectionFactory connection = new ConnectionFactory();
    private static final GuestDAO guestDAO = new GuestDAO(connection.doConnection());

    public static void main(String[] args) {

        var list = getUsers();
        
        for(Guest l: list){
            System.out.println(l.toString());
        }
        
    }
        public static java.util.List<Guest> getUsers() {
            return guestDAO.read();
    }
}

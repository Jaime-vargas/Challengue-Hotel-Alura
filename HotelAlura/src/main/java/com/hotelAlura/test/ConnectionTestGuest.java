package com.hotelAlura.test;

import java.time.LocalDate;

import com.hotelAlura.DAO.GuestDAO;
import com.hotelAlura.Factory.ConnectionFactory;
import com.hotelAlura.models.Guest;

public class ConnectionTestGuest {
    public static void main(String[] args) {

        GuestDAO guestDAO;
        ConnectionFactory connection = new ConnectionFactory();
        guestDAO = new GuestDAO(connection.doConnection());
        Guest guest = new Guest(9,"Federico", "Lopez", LocalDate.of(1993, 12, 20), "Canadian", "523315383333");

        var list = guestDAO.read();
        
        for(int i = 0; i < list.size(); i ++ ){
            System.out.println(list.get(i).toString());
        }

        System.out.println(guestDAO.update(guest));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.tests;

import com.hotelAlura.controllers.GuestController;
import com.hotelAlura.models.Guest;
import com.hotelAlura.models.Reservation;
import java.time.LocalDate;

/**
 *
 * @author jaime
 */
public class TestGuestById {
    public static void main(String[] args) {
        LocalDate checkin = LocalDate.now();
        LocalDate checkouot = LocalDate.now().plusDays(2);
        Reservation reservation = new Reservation(5, checkin, checkouot, 250.2, "Cash",
            20);
//        Guest guest = new Guest();
//        guest = GuestController.readByID(20);
        System.out.println(reservation.toString());
        
    }
}

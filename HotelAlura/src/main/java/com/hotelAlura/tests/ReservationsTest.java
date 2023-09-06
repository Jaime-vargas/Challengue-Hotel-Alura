/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.tests;

import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.views.MainMenu;
import com.hotelAlura.views.Reservation;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jaime
 */

public class ReservationsTest {
    public static void main(String[] args) {
       InterfaceUtil interfaceUtil = new InterfaceUtil();
        
        var frame = new JFrame();
        frame.setSize(1280, 720);
        
        var reservations = new Reservation(interfaceUtil);
        
        frame.add(reservations);
        
        frame.setVisible(true);
    }
    
}

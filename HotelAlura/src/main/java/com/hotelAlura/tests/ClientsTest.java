/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.tests;

import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.views.EditGuests;
import com.hotelAlura.views.MainMenu;
import com.hotelAlura.views.RegisteredGuests;
import com.hotelAlura.views.ReservationPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jaime
 */

public class ClientsTest {
    public static void main(String[] args) {
       InterfaceUtil interfaceUtil = new InterfaceUtil();
        
        var frame = new RegisteredGuests(interfaceUtil);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}

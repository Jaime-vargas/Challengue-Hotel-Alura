/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.Util;

import com.hotelAlura.views.*;
import javax.swing.JPanel;


/**
 *
 * @author jaime
 */
public class InterfaceUtil {
    
    
    private JPanel contents;
    private LoginPanel loginPanel;
    private MainMenu mainMenu;
    private LogoutQuestion logoutQuestion;
    private Reservation reservation;
    
    public void setContentsPanel(JPanel contents){
        
        this.contents = contents; 
        //loginPanel = new LoginPanel(this);
    }
    
    public void showLoginPanel(){

        contents.removeAll();
        contents.setLayout(null);
        loginPanel = new LoginPanel(this);
        loginPanel.setSize(1280,720);
        contents.add(loginPanel);
        contents.revalidate();
        contents.repaint(); 
    }
    
    public void showMenuPanel(){

        contents.removeAll();
        contents.setLayout(null);
        mainMenu = new MainMenu(this);
        mainMenu.setSize(1280,720);
        contents.add(mainMenu);
        contents.revalidate();
        contents.repaint(); 
    }
    
    public void showLogoutQuestion(){
       logoutQuestion = new LogoutQuestion(this);
       logoutQuestion.setVisible(true);
    }
    
    public void showReservationPAnel(){
        contents.removeAll();
        contents.setLayout(null);
        reservation = new Reservation(this);
        reservation.setSize(1280,720);
        contents.add(reservation);
        contents.revalidate();
        contents.repaint(); 
    }   
    
}

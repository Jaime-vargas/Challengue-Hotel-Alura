/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.Util;

import com.hotelAlura.controllers.GuestController;
import com.hotelAlura.models.Guest;
import com.hotelAlura.views.*;
import java.io.File;
import java.util.List;
import javax.swing.JPanel;


/**
 *
 * @author jaime
 */
public class InterfaceUtil {
    
    //Panels and Frames 
    private JPanel contents;
    private LoginPanel loginPanel;
    private MainMenu mainMenu;
    private LogoutQuestion logoutQuestion;
    private ReservationPanel reservation;
    private RegisteredGuests registeredGuests;
    private EditGuests editGuest;
    private NewGuests newGuest;
    
    //Variables
    private List<Guest> guests;
    private Guest selectedGuest;
    
    //Load Images
    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"hotelAlura"+File.separator+"images"+File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;
    
    public void setContentsPanel(JPanel contents){
        
        this.contents = contents; 
        //loginPanel = new LoginPanel(this);
    }
    
    public String getImagesPath(){
        return this.PATCH;
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
        reservation = new ReservationPanel(this);
        reservation.setSize(1280,720);
        contents.add(reservation);
        contents.revalidate();
        contents.repaint(); 
    }   
    
    public void showGuestSelector(){
        this.registeredGuests = new RegisteredGuests(this);
        this.registeredGuests.setVisible(true);
    }
    
    public void showEditGuest(){
        this.editGuest = new EditGuests(this);
        this.editGuest.setVisible(true);
        
    }
    public void showNewGuest(){
        this.newGuest = new NewGuests(this);
        this.newGuest.setVisible(true);
        
    }
    
    public Guest getSelectedGuest() {
        return selectedGuest;
    }

    public void setSelectedGuest(Guest selectedGuest) {
        this.selectedGuest = selectedGuest;
    }

    public List<Guest> getGuestsList() {
        return guests;
    }

    public void setGuestsList(List<Guest> guests) {
        this.guests = guests;
    }
    
    public void reloadRegisteredGuests(){
        registeredGuests.cleanSearch();
        registeredGuests.updateList();
        registeredGuests.fillTable();
    }
    
    public void setLabelClient(){
        try{
            reservation.setLabelClient();
        }catch(NullPointerException e){
            
        }
        
    }
}

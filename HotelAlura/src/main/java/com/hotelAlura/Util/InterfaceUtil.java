/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.Util;

import com.hotelAlura.controllers.UserController;
import com.hotelAlura.views.LoginPanel;
import com.hotelAlura.views.LogoutQuestion;
import com.hotelAlura.views.MainMenu;
import java.awt.BorderLayout;
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
    
    public void setContents(JPanel contents){
        
        this.contents = contents; 
        //loginPanel = new LoginPanel(this);
        mainMenu = new MainMenu(this);
        logoutQuestion = new LogoutQuestion(this);
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
        mainMenu.setSize(1280,720);
        contents.add(mainMenu);
        contents.revalidate();
        contents.repaint(); 
    }
    
    public void showLogoutQuestion(){
        logoutQuestion.setVisible(true);
    }
    
}

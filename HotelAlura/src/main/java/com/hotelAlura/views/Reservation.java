/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.hotelAlura.views;

import com.hotelAlura.Util.InterfaceUtil;
import java.io.File;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.ImageIcon;


/**
 *
 * @author jaime
 */
public class Reservation extends javax.swing.JPanel {
    private InterfaceUtil interfaceUtil;
    
    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"hotelAlura"+File.separator+"images"+File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;
    
    private final ImageIcon background = new ImageIcon(PATCH + "bgRegister.png");
    private final ImageIcon alura = new ImageIcon(PATCH + "aH-150px.png");
    /**
     * Creates new form Reservation
     * @param interfaceUtil
     */
    public Reservation(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        initComponents();
        labelBg.setIcon(background);
        labelLogo.setIcon(alura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelCheckInDate = new javax.swing.JLabel();
        dateCheckInDate = new com.toedter.calendar.JDateChooser();
        labelCheckOutDate = new javax.swing.JLabel();
        dateCheckOutDate = new com.toedter.calendar.JDateChooser();
        labelRoom = new javax.swing.JLabel();
        comboBoxRooms = new javax.swing.JComboBox<>();
        labelCurrency = new javax.swing.JLabel();
        comboBoxPaymentMethod = new javax.swing.JComboBox<>();
        labelClient = new javax.swing.JLabel();
        buttonRegisteredClient = new javax.swing.JButton();
        buttonNewClient = new javax.swing.JButton();
        buttonNewClient1 = new javax.swing.JButton();
        labelBg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon("D:\\jaime\\Desktop\\Challengue-Hotel-Alura\\HotelAlura\\src\\main\\java\\com\\hotelAlura\\images\\aH-150px.png")); // NOI18N
        add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 45, -1, -1));

        labelCheckInDate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelCheckInDate.setForeground(new java.awt.Color(51, 51, 51));
        labelCheckInDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCheckInDate.setText("Check in date");
        labelCheckInDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelCheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 200, 300, 25));

        dateCheckInDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(dateCheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 235, 256, 50));

        labelCheckOutDate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelCheckOutDate.setForeground(new java.awt.Color(51, 51, 51));
        labelCheckOutDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCheckOutDate.setText("Check out date");
        labelCheckOutDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelCheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 295, 300, -1));

        dateCheckOutDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(dateCheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 335, 256, 50));

        labelRoom.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelRoom.setForeground(new java.awt.Color(51, 51, 51));
        labelRoom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelRoom.setText("Room type");
        labelRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 395, 300, 25));

        comboBoxRooms.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        comboBoxRooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single...........................$89", "Double........................$159" }));
        comboBoxRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRoomsActionPerformed(evt);
            }
        });
        add(comboBoxRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 430, 256, 50));

        labelCurrency.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelCurrency.setForeground(new java.awt.Color(51, 51, 51));
        labelCurrency.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCurrency.setText("Payment method");
        labelCurrency.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 490, 300, 25));

        comboBoxPaymentMethod.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        comboBoxPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card" }));
        add(comboBoxPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 525, 256, 50));

        labelClient.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelClient.setForeground(new java.awt.Color(51, 51, 51));
        labelClient.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelClient.setText("Client");
        labelClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 585, 300, 25));

        buttonRegisteredClient.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        buttonRegisteredClient.setText("Registered client");
        buttonRegisteredClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisteredClientActionPerformed(evt);
            }
        });
        add(buttonRegisteredClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 620, 125, 30));

        buttonNewClient.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        buttonNewClient.setText("New client");
        add(buttonNewClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 620, 125, 30));

        buttonNewClient1.setBackground(new java.awt.Color(204, 0, 51));
        buttonNewClient1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        buttonNewClient1.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewClient1.setText("Continue");
        buttonNewClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewClient1ActionPerformed(evt);
            }
        });
        add(buttonNewClient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 660, 125, 30));

        labelBg.setIcon(new javax.swing.ImageIcon("D:\\jaime\\Desktop\\Challengue-Hotel-Alura\\HotelAlura\\src\\main\\java\\com\\hotelAlura\\images\\bgRegister.png")); // NOI18N
        add(labelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRoomsActionPerformed
         

    }//GEN-LAST:event_comboBoxRoomsActionPerformed

    private void buttonRegisteredClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisteredClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegisteredClientActionPerformed

    private void buttonNewClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewClient1ActionPerformed
        
        LocalDate checkInDate = getDate(dateCheckInDate.getCalendar());
        LocalDate checkOutDate = getDate(dateCheckOutDate.getCalendar());
         
        int days = (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        
        System.out.println("Days " + days);
        
        int cost = comboBoxRooms.getSelectedIndex();
        
        if(cost == 0){
            cost = 89;
        }
        if(cost == 1){
            cost = 159;
        }
        
        int totalcost = cost * days;
        
        System.out.println("Noches :" + days + " total: $" + totalcost + " "  +   checkDates());
        
       
       

    }//GEN-LAST:event_buttonNewClient1ActionPerformed

    private LocalDate getDate(Calendar calendar){
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Nota: Los meses en Calendar van de 0 a 11, por lo que sumamos 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return LocalDate.of(year, month,day);
    }
    
    private boolean checkDates(){
        try{
            LocalDate checkInDate = getDate(dateCheckInDate.getCalendar());
            LocalDate checkOutDate = getDate(dateCheckOutDate.getCalendar());
            int compare = checkOutDate.compareTo(checkInDate);
            
            return compare > 0;
              
        }catch(Exception e){
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonNewClient;
    private javax.swing.JButton buttonNewClient1;
    private javax.swing.JButton buttonRegisteredClient;
    private javax.swing.JComboBox<String> comboBoxPaymentMethod;
    private javax.swing.JComboBox<String> comboBoxRooms;
    private com.toedter.calendar.JDateChooser dateCheckInDate;
    private com.toedter.calendar.JDateChooser dateCheckOutDate;
    private javax.swing.JLabel labelBg;
    private javax.swing.JLabel labelCheckInDate;
    private javax.swing.JLabel labelCheckOutDate;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelCurrency;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelRoom;
    // End of variables declaration//GEN-END:variables
}

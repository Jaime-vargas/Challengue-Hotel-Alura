package com.hotelAlura.views;

import com.formdev.flatlaf.FlatLightLaf;
import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.controllers.ReservationController;
import com.hotelAlura.models.Guest;
import com.hotelAlura.models.Reservation;
import java.io.File;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Crea panel para realizar el registro de nuevas reservas
 *
 * @author jaime
 */
public class ReservationPanel extends javax.swing.JPanel {

    private InterfaceUtil interfaceUtil;
    private Reservation reservation;
    private LocalDate todayDate = LocalDate.now();
    private Guest selectedGuest;
    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "hotelAlura" + File.separator + "images" + File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;
    private final ImageIcon background = new ImageIcon(PATCH + "bgRegister.png");
    private final ImageIcon alura = new ImageIcon(PATCH + "aH-150px.png");

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public ReservationPanel(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        FlatLightLaf.setup();
        initComponents();
        labelBg.setIcon(background);
        labelLogo.setIcon(alura);
    }

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
        buttonSaveReservation = new javax.swing.JButton();
        labelBg = new javax.swing.JLabel();
        labelSetClient = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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
        comboBoxRooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(comboBoxRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 430, 256, 50));

        labelCurrency.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelCurrency.setForeground(new java.awt.Color(51, 51, 51));
        labelCurrency.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCurrency.setText("Payment method");
        labelCurrency.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 490, 300, 25));

        comboBoxPaymentMethod.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        comboBoxPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card" }));
        comboBoxPaymentMethod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(comboBoxPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 525, 256, 50));

        labelClient.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelClient.setForeground(new java.awt.Color(51, 51, 51));
        labelClient.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelClient.setText("Client:");
        labelClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(labelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 585, 60, 25));

        buttonRegisteredClient.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        buttonRegisteredClient.setText("Registered client");
        buttonRegisteredClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegisteredClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisteredClientActionPerformed(evt);
            }
        });
        add(buttonRegisteredClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 620, 125, 30));

        buttonNewClient.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        buttonNewClient.setText("New client");
        buttonNewClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewClientActionPerformed(evt);
            }
        });
        add(buttonNewClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 620, 125, 30));

        buttonSaveReservation.setBackground(new java.awt.Color(204, 0, 51));
        buttonSaveReservation.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        buttonSaveReservation.setForeground(new java.awt.Color(255, 255, 255));
        buttonSaveReservation.setText("Continue");
        buttonSaveReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSaveReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveReservationActionPerformed(evt);
            }
        });
        add(buttonSaveReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 660, 125, 30));
        add(labelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelSetClient.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(labelSetClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 585, 190, 25));

        labelBack.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        labelBack.setForeground(new java.awt.Color(102, 102, 102));
        labelBack.setText("<Go back");
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });
        add(labelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegisteredClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisteredClientActionPerformed
        interfaceUtil.showRegisteredGuestPanel();
    }//GEN-LAST:event_buttonRegisteredClientActionPerformed

    private void buttonSaveReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveReservationActionPerformed
        try {
            LocalDate checkInDate = getDate(dateCheckInDate.getCalendar());
            LocalDate checkOutDate = getDate(dateCheckOutDate.getCalendar());
            validateJDate();
            validateGuest();
            float days = getDays();
            String roomType = "";
            float cost = 0;
            String paymentMethod = "";
            switch (comboBoxRooms.getSelectedIndex()) {
                case 0 -> {
                    roomType = "Single";
                    cost = 89;
                }
                case 1 -> {
                    roomType = "Double";
                    cost = 159;
                }
            }
            switch (comboBoxPaymentMethod.getSelectedIndex()) {
                case 0 -> {
                    paymentMethod = "Cash";
                }
                case 1 -> {
                    paymentMethod = "Credit";
                }
            }
            float totalcost = days * cost;
            int respuesta = JOptionPane.showConfirmDialog(null, "Reservation details: \n"
                    + "CHECK IN DATE: " + getDate(dateCheckInDate.getCalendar()) + "\n"
                    + "CHECK OUT DATE: " + getDate(dateCheckOutDate.getCalendar()) + "\n"
                    + "GUEST NAME: " + selectedGuest.getGuestName() + " " + selectedGuest.getGuestLastName() + "\n"
                    + "NUMBER OF DAYS: " + days + "\n"
                    + "TYPE OF ROOM: " + roomType + "\n"
                    + "PAYMENT METHOD: " + paymentMethod + "\n"
                    + "TOTAL COST TO PAY: $" + totalcost, "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                reservation = new Reservation(checkInDate, checkOutDate, totalcost, paymentMethod, selectedGuest);
                if (ReservationController.save(reservation)) {
                    JOptionPane.showMessageDialog(null, "Reservation saved Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                    interfaceUtil.showMenuPanel();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, """
                                                Oops can't continue!
                                                Check in date must be greater than today
                                                Check out date at least the day after check in
                                                There must also be a selected client
                                                """, "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonSaveReservationActionPerformed

    private void validateJDate() throws Exception {
        LocalDate checkInDate = getDate(dateCheckInDate.getCalendar());
        LocalDate checkOutDate = getDate(dateCheckOutDate.getCalendar());
        if (!checkInDate.isAfter(todayDate) || !checkOutDate.isAfter(checkInDate)) {
            throw new Exception();
        }
    }

    private void validateGuest() throws Exception {
        selectedGuest = interfaceUtil.getSelectedGuest();
        if (selectedGuest == null) {
            throw new Exception();
        }
    }

    private int getDays() {
        LocalDate checkInDate = getDate(dateCheckInDate.getCalendar());
        LocalDate checkOutDate = getDate(dateCheckOutDate.getCalendar());
        return (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }

    private void buttonNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewClientActionPerformed
        interfaceUtil.showNewGuest();
    }//GEN-LAST:event_buttonNewClientActionPerformed

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        interfaceUtil.showMenuPanel();
    }//GEN-LAST:event_labelBackMouseClicked

    private LocalDate getDate(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Nota: Los meses en Calendar van de 0 a 11, por lo que sumamos 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return LocalDate.of(year, month, day);
    }

    public void setLabelClient() {
        String guestFullName = interfaceUtil.getSelectedGuest().getGuestName() + " " + interfaceUtil.getSelectedGuest().getGuestLastName();
        labelSetClient.setText(guestFullName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonNewClient;
    private javax.swing.JButton buttonRegisteredClient;
    private javax.swing.JButton buttonSaveReservation;
    private javax.swing.JComboBox<String> comboBoxPaymentMethod;
    private javax.swing.JComboBox<String> comboBoxRooms;
    private com.toedter.calendar.JDateChooser dateCheckInDate;
    private com.toedter.calendar.JDateChooser dateCheckOutDate;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelBg;
    private javax.swing.JLabel labelCheckInDate;
    private javax.swing.JLabel labelCheckOutDate;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelCurrency;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelRoom;
    private javax.swing.JLabel labelSetClient;
    // End of variables declaration//GEN-END:variables
}

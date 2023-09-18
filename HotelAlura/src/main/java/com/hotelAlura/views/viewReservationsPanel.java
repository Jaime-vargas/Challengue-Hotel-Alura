package com.hotelAlura.views;

import com.formdev.flatlaf.FlatLightLaf;
import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.controllers.ReservationController;
import com.hotelAlura.models.Reservation;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * Crea un Panel con una tabla donde se muestran las reservaciones registradas
 * en la base de datos
 *
 * @author jaime
 */
public class viewReservationsPanel extends javax.swing.JPanel {

    private InterfaceUtil interfaceUtil;
    private DefaultTableModel model;
    private List<Reservation> reservations;
    private Reservation reservation;
    private ImageIcon closeIcon;
    private ImageIcon logo;

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public viewReservationsPanel(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        FlatLightLaf.setup();
        initComponents();
        loadImages();
        updateList();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelReservations = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservations = new javax.swing.JTable();
        panelBg = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReservations.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        labelReservations.setForeground(new java.awt.Color(51, 51, 51));
        labelReservations.setText("Reservations");
        add(labelReservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        labelLogo.setIcon(new javax.swing.ImageIcon("D:\\jaime\\Desktop\\Challengue-Hotel-Alura\\HotelAlura\\src\\main\\java\\com\\hotelAlura\\images\\aH-150px.png")); // NOI18N
        add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 150, 150));

        labelBack.setIcon(new javax.swing.ImageIcon("D:\\jaime\\Desktop\\Challengue-Hotel-Alura\\HotelAlura\\src\\main\\java\\com\\hotelAlura\\images\\arrow-25px.png")); // NOI18N
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });
        add(labelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 25, 25));

        tableReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation id", "Check in date", "Check out date", "Payment method", "Total cost", "Guest name"
            }
        ));
        tableReservations.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableReservations);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1260, 520));

        panelBg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        add(panelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        interfaceUtil.showSearchPanel();
    }//GEN-LAST:event_labelBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelReservations;
    private javax.swing.JPanel panelBg;
    private javax.swing.JTable tableReservations;
    // End of variables declaration//GEN-END:variables

    private void loadImages() {
        this.closeIcon = new ImageIcon(interfaceUtil.getImagesPath() + "arrow-25px.png");
        this.logo = new ImageIcon(interfaceUtil.getImagesPath() + "aH-150px.png");
        labelBack.setIcon(closeIcon);
        labelLogo.setIcon(logo);
    }

    public void updateList() {
        this.reservations = ReservationController.getReservationList();
    }

    private void fillTable() {
        model = (DefaultTableModel) tableReservations.getModel();
        model.setRowCount(0);
        this.reservations.forEach(reservation -> {
            model.addRow(new Object[]{reservation.getId(), reservation.getCheckInDate(), reservation.getCheckOutDate(), reservation.getPaymentMethod(), reservation.getTotalCost(), reservation.getGuest().getGuestName()});
        });
    }
}

package com.hotelAlura.views;

import com.hotelAlura.Util.InterfaceUtil;
import java.io.File;
import javax.swing.ImageIcon;

/**
 * CRea panel con menu para buscar reservas y huespedes en la base de datos
 *
 * @author jaime
 */
public class SearchMenu extends javax.swing.JPanel {

    private final InterfaceUtil interfaceUtil;

    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "hotelAlura" + File.separator + "images" + File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;

    private final ImageIcon background = new ImageIcon(PATCH + "bgMenu.png");
    private final ImageIcon backIcon = new ImageIcon(PATCH + "arrow-25px.png");
    private final ImageIcon alura = new ImageIcon(PATCH + "aH-150px.png");

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public SearchMenu(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        initComponents();
        labelBG.setIcon(background);
        labelLogo.setIcon(alura);
        labelClose.setIcon(backIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        buttonViewReservations = new javax.swing.JButton();
        buttonViewGuests = new javax.swing.JButton();
        labelBG = new javax.swing.JLabel();
        labelClose = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 252, 252));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 45, -1, -1));

        buttonViewReservations.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonViewReservations.setText("View reservations");
        buttonViewReservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonViewReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewReservationsActionPerformed(evt);
            }
        });
        add(buttonViewReservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 290, 150, 60));

        buttonViewGuests.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        buttonViewGuests.setText("View guests");
        buttonViewGuests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonViewGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewGuestsActionPerformed(evt);
            }
        });
        add(buttonViewGuests, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 380, 150, 60));

        labelBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(labelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseMouseClicked(evt);
            }
        });
        add(labelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1245, 10, 25, 25));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViewReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewReservationsActionPerformed
        interfaceUtil.showViewReservationsPAnel();
    }//GEN-LAST:event_buttonViewReservationsActionPerformed

    private void labelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseMouseClicked
        interfaceUtil.showMenuPanel();
    }//GEN-LAST:event_labelCloseMouseClicked

    private void buttonViewGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewGuestsActionPerformed
        interfaceUtil.showRegisteredGuestPanel2();
    }//GEN-LAST:event_buttonViewGuestsActionPerformed

    public void singOut() {
        interfaceUtil.showLogoutQuestion();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonViewGuests;
    private javax.swing.JButton buttonViewReservations;
    private javax.swing.JLabel labelBG;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}

package com.hotelAlura.views;

import com.hotelAlura.Util.InterfaceUtil;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Crea un panel nuevo con el menu proncipal
 *
 * @author jaime
 */
public class MainMenu extends javax.swing.JPanel {

    private final InterfaceUtil interfaceUtil;
    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "hotelAlura" + File.separator + "images" + File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;
    private final ImageIcon background = new ImageIcon(PATCH + "bgMenu.png");
    private final ImageIcon alura = new ImageIcon(PATCH + "aH-150px.png");

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public MainMenu(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        initComponents();
        labelBG.setIcon(background);
        labelLogo.setIcon(alura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        buttonReservations = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        labelSingOut = new javax.swing.JLabel();
        labelBG = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 252, 252));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 45, -1, -1));

        buttonReservations.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        buttonReservations.setText("New reservation");
        buttonReservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReservationsActionPerformed(evt);
            }
        });
        add(buttonReservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 290, 150, 60));

        buttonSearch.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        buttonSearch.setText("Search");
        buttonSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 380, 150, 60));

        labelSingOut.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelSingOut.setForeground(new java.awt.Color(102, 102, 102));
        labelSingOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSingOut.setText("Sing out");
        labelSingOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSingOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSingOutMouseClicked(evt);
            }
        });
        add(labelSingOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 650, 150, -1));

        labelBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(labelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void labelSingOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSingOutMouseClicked
        singOut();
    }//GEN-LAST:event_labelSingOutMouseClicked

    private void buttonReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReservationsActionPerformed
        interfaceUtil.showReservationPAnel();
    }//GEN-LAST:event_buttonReservationsActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        interfaceUtil.showSearchPanel();
    }//GEN-LAST:event_buttonSearchActionPerformed

    public void singOut() {
        interfaceUtil.showLogoutQuestion();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonReservations;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel labelBG;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSingOut;
    // End of variables declaration//GEN-END:variables
}

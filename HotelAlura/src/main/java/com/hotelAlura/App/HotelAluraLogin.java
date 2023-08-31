/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hotelAlura.App;

import com.formdev.flatlaf.FlatLightLaf;
import com.hotelAlura.Controllers.UserController;
import com.hotelAlura.Factory.ConnectionFactory;

/**
 *
 * @author jaime
 */
public class HotelAluraLogin extends javax.swing.JFrame {

    /**
     * Creates new form HotelAluraLogin
     */
    public HotelAluraLogin() {
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        fieldUserName = new javax.swing.JTextField();
        fieldUserPassword = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        testLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Alura Login");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        loginPanel.setBackground(new java.awt.Color(250, 250, 250));
        loginPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldUserName.setText("user");
        fieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUserNameActionPerformed(evt);
            }
        });
        loginPanel.add(fieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        fieldUserPassword.setText("password");
        fieldUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUserPasswordActionPerformed(evt);
            }
        });
        loginPanel.add(fieldUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        loginPanel.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        testLabel.setText("Response");
        loginPanel.add(testLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserNameActionPerformed

    private void fieldUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUserPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserPasswordActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        var user = fieldUserName.getText();
        var password = fieldUserPassword.getText();
        String label;
        
        if(UserController.save(user, password)){
            label = "true";
        }else{label = "false";}
        
            testLabel.setText(label);
    }//GEN-LAST:event_buttonLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HotelAluraLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JTextField fieldUserPassword;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel testLabel;
    // End of variables declaration//GEN-END:variables
}

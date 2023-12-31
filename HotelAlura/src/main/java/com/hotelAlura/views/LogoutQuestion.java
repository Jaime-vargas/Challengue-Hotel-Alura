/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hotelAlura.views;

import com.hotelAlura.Util.InterfaceUtil;

/**
 * Crea un Jform con la pregunta se deseas cerrar la sesion
 *
 * @author jaime
 */
public class LogoutQuestion extends javax.swing.JFrame {

    private InterfaceUtil interfaceUtil;

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public LogoutQuestion(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelClose = new javax.swing.JLabel();
        labelQuestion = new javax.swing.JLabel();
        buttonClose = new javax.swing.JToggleButton();
        buttonCancel = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelClose.setIcon(new javax.swing.ImageIcon("D:\\jaime\\Desktop\\Challengue-Hotel-Alura\\HotelAlura\\src\\main\\java\\com\\hotelAlura\\images\\cross-25px.png")); // NOI18N
        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(labelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 20, 25, 25));

        labelQuestion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQuestion.setText("Are you sure you want to close your sesion?");
        jPanel1.add(labelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 550, 30));

        buttonClose.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        buttonClose.setText("YES");
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 110, 200, 30));

        buttonCancel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        buttonCancel.setText("NO");
        buttonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 110, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        singOut();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void labelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseMouseClicked
        dispose();
    }//GEN-LAST:event_labelCloseMouseClicked

    public void singOut() {
        dispose();
        interfaceUtil.showLoginPanel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonCancel;
    private javax.swing.JToggleButton buttonClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelQuestion;
    // End of variables declaration//GEN-END:variables
}

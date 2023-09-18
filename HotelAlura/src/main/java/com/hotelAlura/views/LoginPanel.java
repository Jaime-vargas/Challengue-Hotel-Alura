package com.hotelAlura.views;

import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.controllers.UserController;
import java.io.File;
import javax.swing.ImageIcon;

/**
 * Crea un nuevo Panel que muestra la ventana de login
 *
 * @author jaime
 */
public class LoginPanel extends javax.swing.JPanel {

    private final InterfaceUtil interfaceUtil;
    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "hotelAlura" + File.separator + "images" + File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;
    private final ImageIcon background = new ImageIcon(PATCH + "mainbg.jpg");
    private final ImageIcon alura = new ImageIcon(PATCH + "aH-150px.png");

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public LoginPanel(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        initComponents();
        labelBackground.setIcon(background);
        aluraLogo.setIcon(alura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        aluraLogo = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        fieldUserName = new javax.swing.JTextField();
        labelUserPassword = new javax.swing.JLabel();
        fieldUserPassword = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        labelBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        MainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setBackground(new java.awt.Color(250, 250, 250));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LoginPanel.add(aluraLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 10, -1, -1));

        labelLogin.setBackground(new java.awt.Color(250, 250, 250));
        labelLogin.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(51, 51, 51));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Login");
        labelLogin.setPreferredSize(new java.awt.Dimension(127, 60));
        LoginPanel.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 60));

        labelUserName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(51, 51, 51));
        labelUserName.setText("Username");
        LoginPanel.add(labelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 300, 20));

        fieldUserName.setBackground(new java.awt.Color(250, 250, 250));
        fieldUserName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        LoginPanel.add(fieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 300, 30));

        labelUserPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelUserPassword.setForeground(new java.awt.Color(51, 51, 51));
        labelUserPassword.setText("Password");
        LoginPanel.add(labelUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 20));

        fieldUserPassword.setBackground(new java.awt.Color(250, 250, 250));
        LoginPanel.add(fieldUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 300, 30));

        buttonLogin.setBackground(new java.awt.Color(0, 102, 153));
        buttonLogin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        LoginPanel.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 300, 30));

        errorLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginPanel.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 300, 30));

        MainPanel.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 400, 500));
        MainPanel.add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        login(fieldUserName.getText(), fieldUserPassword.getText());
    }//GEN-LAST:event_buttonLoginActionPerformed

    public void login(String user, String password) {
        boolean authenticated = UserController.authenticate(user, password);
        String errorMessage = "Wrong user or password";
        if (authenticated) {
            interfaceUtil.showMenuPanel();
        } else {
            errorLabel.setText(errorMessage);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel aluraLogo;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JPasswordField fieldUserPassword;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel labelUserPassword;
    // End of variables declaration//GEN-END:variables
}

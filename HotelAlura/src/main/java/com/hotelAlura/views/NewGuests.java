package com.hotelAlura.views;

import com.formdev.flatlaf.FlatLightLaf;
import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.controllers.GuestController;
import com.hotelAlura.models.Guest;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *Crea un jFrame para dar de alta Huespedes nuevos
 * @author jaime
 */
public class NewGuests extends javax.swing.JFrame {

    private InterfaceUtil interfaceUtil;
    private Guest newGuest;
    private List<Guest> guests;
    private ImageIcon closeIcon;

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public NewGuests(InterfaceUtil interfaceUtil) {
        this.interfaceUtil = interfaceUtil;
        FlatLightLaf.setup();
        initComponents();
        loadImages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelClose = new javax.swing.JLabel();
        labelGuestData = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        textFieldLastName = new javax.swing.JTextField();
        labelDateOfBirth = new javax.swing.JLabel();
        jDateDateOfBirth = new com.toedter.calendar.JDateChooser();
        labelNationality = new javax.swing.JLabel();
        textFieldNationality = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        textFieldPhone = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelSatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelClose.setIcon(new javax.swing.ImageIcon("D:\\jaime\\Desktop\\Challengue-Hotel-Alura\\HotelAlura\\src\\main\\java\\com\\hotelAlura\\images\\cross-25px.png")); // NOI18N
        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(labelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 25, 25));

        labelGuestData.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelGuestData.setText("Guest data");
        jPanel1.add(labelGuestData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelName.setText("Name");
        jPanel1.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(textFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        labelLastName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelLastName.setText("Last name");
        jPanel1.add(labelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));
        jPanel1.add(textFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 220, -1));

        labelDateOfBirth.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelDateOfBirth.setText("Date of birth");
        jPanel1.add(labelDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel1.add(jDateDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, -1));

        labelNationality.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNationality.setText("Nationality");
        jPanel1.add(labelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        jPanel1.add(textFieldNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 220, -1));

        labelPhone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPhone.setText("Phone number");
        jPanel1.add(labelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel1.add(textFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, -1));

        buttonSave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        buttonCancel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        labelSatus.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelSatus.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(labelSatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadImages() {
        this.closeIcon = new ImageIcon(interfaceUtil.getImagesPath() + "cross-25px.png");
        labelClose.setIcon(closeIcon);
    }
    
    private void labelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseMouseClicked
        dispose();
    }//GEN-LAST:event_labelCloseMouseClicked

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Are you sure you want to save changues ?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            if (validateTextFields() && validateJDate()) {
                getDataToSave();
            } else {
                JOptionPane.showMessageDialog(null, """
                                                    some fields are incorrect
                                                    Names should not include numbers or special characters.
                                                    The minimum age is 18 years.""", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            labelSatus.setText("not changues applied");
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void getDataToSave() {
        String name = textFieldName.getText();
        String lastname = textFieldLastName.getText();
        LocalDate date = getDate(jDateDateOfBirth.getCalendar());
        String nationality = textFieldNationality.getText();
        String phone = textFieldPhone.getText();
        newGuest = new Guest(name, lastname, date, nationality, phone);
        if (GuestController.save(newGuest)) {
            interfaceUtil.setGuestsList(GuestController.getGuestsList());
            JOptionPane.showMessageDialog(null, "Guest saved succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.guests = interfaceUtil.getGuestsList();
            for (Guest guest : guests) {
                if (guest.getGuestName().toLowerCase().contains(newGuest.getGuestName())
                        && guest.getGuestLastName().toLowerCase().contains(newGuest.getGuestLastName())
                        && guest.getGuestBirthday().equals(newGuest.getGuestBirthday())) {
                    newGuest = guest;
                }
            }
            interfaceUtil.setSelectedGuest(newGuest);
            interfaceUtil.setLabelClient();
            if (interfaceUtil.statusGuestPanel()) {
                interfaceUtil.reloadRegisteredGuests();
            } else {
                interfaceUtil.reloadRegisteredGuests2();
            }
            dispose();
        }
    }

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit without save?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private com.toedter.calendar.JDateChooser jDateDateOfBirth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelDateOfBirth;
    private javax.swing.JLabel labelGuestData;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNationality;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelSatus;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldNationality;
    private javax.swing.JTextField textFieldPhone;
    // End of variables declaration//GEN-END:variables

    private LocalDate getDate(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Nota: Los meses en Calendar van de 0 a 11, por lo que sumamos 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return LocalDate.of(year, month, day);
    }

    private boolean validateTextFields() {
        boolean result = true;
        if (GuestController.validateField(textFieldName.getText())) {
            textFieldName.setText(GuestController.processText(textFieldName.getText()));
        } else {
            result = false;
        }
        if (GuestController.validateField(textFieldLastName.getText())) {
            textFieldLastName.setText(GuestController.processText(textFieldLastName.getText()));
        } else {
            result = false;
        }
        if (GuestController.validateField(textFieldNationality.getText())) {
            textFieldNationality.setText(GuestController.processText(textFieldNationality.getText()));
        } else {
            result = false;
        }
        return result;
    }

    private boolean validateJDate() {
        try {
            LocalDate dateOfBirth = getDate(jDateDateOfBirth.getCalendar());
            return GuestController.validateDate(dateOfBirth);
        } catch (Exception e) {
            return false;
        }
    }
}

package com.hotelAlura.views;

import com.formdev.flatlaf.FlatLightLaf;
import com.hotelAlura.Util.InterfaceUtil;
import com.hotelAlura.controllers.GuestController;
import com.hotelAlura.models.Guest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Crea un panel para mostrar los huespedes registrados dentro del panel de
 * registro de reserva
 *
 * @author jaime
 */
public class RegisteredGuestsPanel extends javax.swing.JPanel {

    private InterfaceUtil interfaceUtil;
    private DefaultTableModel model;
    private List<Guest> guests;
    private ImageIcon closeIcon;
    private ImageIcon background;

    /**
     * @param interfaceUtil se recibe como parametro la clase Interface Util
     * Para interactuar entre paneles y Frames
     */
    public RegisteredGuestsPanel(InterfaceUtil interfaceUtil) {
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

        panelRegisteredGuests = new javax.swing.JPanel();
        panelData = new javax.swing.JPanel();
        labelRegisteredClients = new javax.swing.JLabel();
        labelSearchByName = new javax.swing.JLabel();
        textFieldSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGuests = new javax.swing.JTable();
        buttonShowDetails = new javax.swing.JButton();
        buttonContinue = new javax.swing.JButton();
        labelClose = new javax.swing.JLabel();
        labelBg = new javax.swing.JLabel();

        panelRegisteredGuests.setBackground(new java.awt.Color(255, 255, 255));
        panelRegisteredGuests.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelData.setBackground(new java.awt.Color(255, 255, 255));
        panelData.setMinimumSize(new java.awt.Dimension(500, 600));
        panelData.setPreferredSize(new java.awt.Dimension(500, 720));
        panelData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRegisteredClients.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelRegisteredClients.setText("Registered guests");
        panelData.add(labelRegisteredClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        labelSearchByName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelSearchByName.setText("Search by name");
        panelData.add(labelSearchByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        textFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSearchKeyReleased(evt);
            }
        });
        panelData.add(textFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 321, -1));

        tableGuests.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tableGuests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Last name", "Date of birth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGuests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableGuests.setEditingColumn(0);
        tableGuests.setEditingRow(0);
        tableGuests.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableGuests.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableGuests);

        panelData.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 490));

        buttonShowDetails.setText("Show details");
        buttonShowDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowDetailsActionPerformed(evt);
            }
        });
        panelData.add(buttonShowDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 203, 40));

        buttonContinue.setText("Continue");
        buttonContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContinueActionPerformed(evt);
            }
        });
        panelData.add(buttonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, 203, 40));

        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseMouseClicked(evt);
            }
        });
        panelData.add(labelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 25, 25));

        panelRegisteredGuests.add(panelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelRegisteredGuests.add(labelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegisteredGuests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegisteredGuests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchKeyReleased
        updateList();
        searchInList(this.guests, textFieldSearch.getText());
        fillTable();
    }//GEN-LAST:event_textFieldSearchKeyReleased

    private void buttonShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowDetailsActionPerformed
        try {
            int selectedGuest = tableGuests.getSelectedRow();
            interfaceUtil.setSelectedGuest(this.guests.get(selectedGuest));
            interfaceUtil.showEditGuest();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Any guest was selected.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonShowDetailsActionPerformed

    private void buttonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContinueActionPerformed
        try {
            int selectedGuest = tableGuests.getSelectedRow();
            interfaceUtil.setSelectedGuest(this.guests.get(selectedGuest));
            interfaceUtil.setLabelClient();
            interfaceUtil.showPrevReservationPAnel();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Any guest was selected.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonContinueActionPerformed

    private void labelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseMouseClicked
        interfaceUtil.showPrevReservationPAnel();
    }//GEN-LAST:event_labelCloseMouseClicked
    private void loadImages() {
        this.closeIcon = new ImageIcon(interfaceUtil.getImagesPath() + "arrow-25px.png");
        this.background = new ImageIcon(interfaceUtil.getImagesPath() + "bgRegister.png");
        labelClose.setIcon(closeIcon);
        labelBg.setIcon(background);
    }

    public void updateList() {
        interfaceUtil.setGuestsList(GuestController.getGuestsList());
        this.guests = interfaceUtil.getGuestsList();
    }

    public void cleanSearch() {
        textFieldSearch.setText("");
    }

    public void fillTable() {

        model = (DefaultTableModel) tableGuests.getModel();
        model.setRowCount(0);
        this.guests.forEach(guest -> {
            model.addRow(new Object[]{guest.getGuestName(), guest.getGuestLastName(), guest.getGuestBirthday()});
        });
    }

    private void searchInList(List<Guest> guests, String text) {
        List<Guest> result = new ArrayList<>();
        for (Guest guest : guests) {
            if (guest.getGuestName().toLowerCase().contains(text.toLowerCase())) {
                result.add(guest);
            }
        }
        if (text.isEmpty()) {
            updateList();
            fillTable();
        }
        this.guests = result;
        fillTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonContinue;
    private javax.swing.JButton buttonShowDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBg;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelRegisteredClients;
    private javax.swing.JLabel labelSearchByName;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelRegisteredGuests;
    private javax.swing.JTable tableGuests;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables
}

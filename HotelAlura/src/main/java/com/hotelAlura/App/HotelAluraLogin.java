package com.hotelAlura.App;
import com.formdev.flatlaf.FlatLightLaf;
import com.hotelAlura.Util.InterfaceUtil;
/**
 *
 * @author jaime vargas
 */
public class HotelAluraLogin extends javax.swing.JFrame {

    InterfaceUtil interfaceUtil = new InterfaceUtil();
 /**
  * Clase principal del proyecto en esta clase se inicia un Frame principal el cual contiene un panel llamado Contents
  * Contents: este parametro con ayuda de la Clase interfaceUtil ayuda a estar editando y eliminando contenido dentro del frame
  * InterfaceUtil: la clase interface util es la que servira de puente para gestionar ventanas y datos entro todas las ventanas del programa 
  */
    public HotelAluraLogin() {
        initComponents();
        interfaceUtil.setContentsPanel(Contents);
        interfaceUtil.showLoginPanel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contents = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Alura Login");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        Contents.setBackground(new java.awt.Color(250, 250, 250));
        Contents.setPreferredSize(new java.awt.Dimension(1280, 720));
        Contents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Aqui inicia el programa, antes de establecer el frame principal visible se implementa la libreria FlatLaf para mejorar la estetica del programa
 * @param args 
 */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new HotelAluraLogin().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contents;
    // End of variables declaration//GEN-END:variables
}

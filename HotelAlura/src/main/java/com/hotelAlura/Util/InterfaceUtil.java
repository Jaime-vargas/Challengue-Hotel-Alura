package com.hotelAlura.Util;

import com.hotelAlura.controllers.GuestController;
import com.hotelAlura.models.Guest;
import com.hotelAlura.views.*;
import java.io.File;
import java.util.List;
import javax.swing.JPanel;


/**
 *
 * @author jaime
 * Este paquete contiene todos los metodos que ayudan a la creacion y eliminacion de paneles para poder navegar dentro del programa
 * También aqui se almacenan algunos datos que funcionan entre paneles y frames
 */
public class InterfaceUtil {
    
    //Panels and Frames 
    private JPanel contents;
    private LoginPanel loginPanel;
    private MainMenu mainMenu;
    private LogoutQuestion logoutQuestion;
    private ReservationPanel reservation;
    private RegisteredGuestsPanel registeredGuestsPanel;
    private RegisteredGuestsPanel2 registeredGuestsPanel2;
    private viewReservationsPanel viewReservationsPanel;
    private EditGuests editGuest;
    private NewGuests newGuest;
    private SearchMenu searchMenu;
    
    //Variables
    private List<Guest> guests;
    private Guest selectedGuest;
    
    //Images
    private final String USERDIR = System.getProperty("user.dir");
    private final String IMGFOLDER = File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"hotelAlura"+File.separator+"images"+File.separator;
    private final String PATCH = USERDIR + IMGFOLDER;
    
    /**
     * Se inicializa la clase al iniciar el programa con el frame principal
     * @param contents  Este parametro se trata del panel en el cual se iran mostrando eliminando las pantallas con las que interactua el usuario
     */
    public void setContentsPanel(JPanel contents){
        this.contents = contents; 
    }
    /**
     * Establece la ruta en la cual se encuantran las imagenes del programa para poder ser cargadas sin problemas
     * @return Retorna una cadena String con la ruta actual del programa y carpeta de imagenes
     */
    public String getImagesPath(){
        return this.PATCH;
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel Login
 * 
 */
    public void showLoginPanel(){
        contents.removeAll();
        contents.setLayout(null);
        loginPanel = new LoginPanel(this);
        loginPanel.setSize(1280,720);
        contents.add(loginPanel);
        contents.revalidate();
        contents.repaint(); 
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel menu principal
 * 
 */    
    public void showMenuPanel(){
        contents.removeAll();
        contents.setLayout(null);
        mainMenu = new MainMenu(this);
        mainMenu.setSize(1280,720);
        contents.add(mainMenu);
        contents.revalidate();
        contents.repaint(); 
    }
/**
 * Borra contenidos dentro del panel principal y muestra un frame el cual pregunta si deseas cerrar la sesion 
 * esta accion te llevara de vuelta al panel login
 * 
 */     
    public void showLogoutQuestion(){
       logoutQuestion = new LogoutQuestion(this);
       logoutQuestion.setVisible(true);
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel para realizar una reservacion
 * 
 */       
    public void showReservationPAnel(){
        contents.removeAll();
        contents.setLayout(null);
        reservation = new ReservationPanel(this);
        reservation.setSize(1280,720);
        contents.add(reservation);
        contents.revalidate();
        contents.repaint(); 
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel realizar una reservacion
 * este metodo no genera un nuevo panel si no que regresa al previamente mostrado 
 * 
 */   
    public void showPrevReservationPAnel(){
        contents.removeAll();
        contents.setLayout(null);
        contents.add(reservation);
        contents.revalidate();
        contents.repaint(); 
    } 
/**
 * Borra contenidos dentro del panel principal y muestra panel para ver reservaciones registradas
 * 
 */ 
    public void showViewReservationsPAnel(){
        contents.removeAll();
        contents.setLayout(null);
        viewReservationsPanel = new viewReservationsPanel(this);
        viewReservationsPanel.setSize(1280,720);
        contents.add(viewReservationsPanel);
        contents.revalidate();
        contents.repaint(); 
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel para ver huespedes registrados
 * 
 */ 
    public void showRegisteredGuestPanel(){
        contents.removeAll();
        contents.setLayout(null);
        registeredGuestsPanel = new RegisteredGuestsPanel(this);
        registeredGuestsPanel.setSize(1280,720);
        contents.add(registeredGuestsPanel);
        contents.revalidate();
        contents.repaint();
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel para ver huespedes registrados
 * el contenido de los botones cambia respecto al anterior
 * 
 */ 
    public void showRegisteredGuestPanel2(){
        contents.removeAll();
        contents.setLayout(null);
        registeredGuestsPanel2 = new RegisteredGuestsPanel2(this);
        registeredGuestsPanel2.setSize(1280,720);
        contents.add(registeredGuestsPanel2);
        contents.revalidate();
        contents.repaint();
    }
/**
 * Borra contenidos dentro del panel principal y muestra panel menu de busqueda
 * 
 */ 
    public void showSearchPanel(){
        contents.removeAll();
        contents.setLayout(null);
        searchMenu = new SearchMenu(this);
        searchMenu.setSize(1280,720);
        contents.add(searchMenu);
        contents.revalidate();
        contents.repaint();
    }
/**
 * Muestra un nuevo jFrame con el contenido de un huesped seleccionado
 * 
 */ 
    public void showEditGuest(){
        this.editGuest = new EditGuests(this);
        this.editGuest.setVisible(true);  
    }
/**
 * Muestra un nuevo jFrame3 para realizar el registro de un huesped nuevo
 * 
 */ 
    public void showNewGuest(){
        this.newGuest = new NewGuests(this);
        this.newGuest.setVisible(true);  
    }
/**
 * Se obtiene de manera "global" un huesped previamente seleccionado
 * 
 * @return se obtiene todo un objeto de tipo huesped al llamar este metodo 
 */ 
    public Guest getSelectedGuest() {
        return selectedGuest;
    }
/**
 * Se almacena de manera "global" un huesped seleccionado
 * se almacena todo un objeto de tipo huesped al llamar este metodo 
 */ 
    public void setSelectedGuest(Guest selectedGuest) {
        this.selectedGuest = selectedGuest;
    }
/**
 * Se obtiene de manera "global" una lista de huespedes previamente sacada de la base de datos
 * @return devuelve una lista con los registros encontrados 
 */
    public List<Guest> getGuestsList() {
        return guests;
    }
/**
* Se almacena de manera "global" una lista de huespedes obtenida de la base de datos
* @param guests recibe como argumento la lista que sera almacenada
*/ 
    public void setGuestsList(List<Guest> guests) {
        this.guests = guests;
    }
/**
* Obtiene con un valor tipo boolean la respuesta para saber si un panel existe en el contexto del programa 
* retornando true: en caso de que exista o falseen caso q¡de que no exista 
*/
    public boolean statusGuestPanel(){
        return this.registeredGuestsPanel != null;
    }
/**
* Se realizan una serie de pasos desde metodos implementados en la clase registeredGuestsPanel
* esto con el fin de manipular su contenido desde otro jFrame
*/
    public void reloadRegisteredGuests(){
        registeredGuestsPanel.cleanSearch();
        registeredGuestsPanel.updateList();
        registeredGuestsPanel.fillTable();
    }
/**
* Se realizan una serie de pasos desde metodos implementados en la clase registeredGuestsPanel
* esto con el fin de manipular su contenido desde otro jFrame
*/
    public void reloadRegisteredGuests2(){
        registeredGuestsPanel2.cleanSearch();
        registeredGuestsPanel2.updateList();
        registeredGuestsPanel2.fillTable();
    }
/**
* Se asigna un valor a un label contenido en un panel de la clase reservation
* esto con el fin de manipular su valor desde otro jFrame
*/   
    public void setLabelClient() {
        try {
            reservation.setLabelClient();
        } catch (NullPointerException e) {
            //TODO 
        }
    }
}

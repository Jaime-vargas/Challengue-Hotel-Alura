package com.hotelAlura.models;

import java.time.LocalDate;

/**
 * 
 * @author jaime
 * Modelo del tipo Guest contiene propiedades con los mismos campos contenidos en la base de datos
 * incluye getters y setters de todos los atrubutos 
 */
public class Guest {

    private Integer id;
    private String guestName;
    private String guestLastName;
    private LocalDate guestBirthday;
    private String guestNationality;
    private String guestPhone;

    public Guest(){
        
    }
    /**
     * Constructor utilizado para el registro de Huespedes
     * @param guestNAme
     * @param guestLastNAme
     * @param guestBirthday
     * @param guestNationality
     * @param guestPhone 
     */
    public Guest(String guestNAme, String guestLastNAme, LocalDate guestBirthday, String guestNationality,
            String guestPhone) {
        this.guestName = guestNAme;
        this.guestLastName = guestLastNAme;
        this.guestBirthday = guestBirthday;
        this.guestNationality = guestNationality;
        this.guestPhone = guestPhone;
    }
    /**
     * Constructor utilizado al leer huespedes existentes
     * @param id
     * @param guestName
     * @param guestLastName
     * @param guestBirthday
     * @param guestNationality
     * @param guestPhone 
     */
     public Guest(Integer id, String guestName, String guestLastName, LocalDate guestBirthday, String guestNationality,
            String guestPhone) {
        this.id = id;
        this.guestName = guestName;
        this.guestLastName = guestLastName;
        this.guestBirthday = guestBirthday;
        this.guestNationality = guestNationality;
        this.guestPhone = guestPhone;
    }
    
    public Integer getId() {
        return id;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public LocalDate getGuestBirthday() {
        return guestBirthday;
    }

    public String getGuestNationality() {
        return guestNationality;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public void setGuestBirthday(LocalDate guestBirthday) {
        this.guestBirthday = guestBirthday;
    }

    public void setGuestNationality(String guestNationality) {
        this.guestNationality = guestNationality;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    @Override
    public String toString(){
        return String.format(
            "{id: %d,"
            +"guestName: %s,"
            +"guestLastName: %s,"
            +"guestBirthday: %s,"
            +"guestNationality: %s,"
            +"guestPhone: %s}",
            this.id,this.guestName,this.guestLastName,
            this.guestBirthday,this.guestNationality,this.guestPhone);    
    }
}

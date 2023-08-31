/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.Models;

import java.time.LocalDate;

/**
 *
 * @author jaime
 */
public class Guest {

    private Integer id;
    private String guestName;
    private String guestLastName;
    private LocalDate guestBirthday;
    private String guestNationality;
    private String guestPhone;

    public Guest(String guestNAme, String guestLastNAme, LocalDate guestBirthday, String guestNationality,
            String guestPhone) {
        this.guestName = guestNAme;
        this.guestLastName = guestLastNAme;
        this.guestBirthday = guestBirthday;
        this.guestNationality = guestNationality;
        this.guestPhone = guestPhone;
    }
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

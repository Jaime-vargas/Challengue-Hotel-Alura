/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.models;

import com.hotelAlura.controllers.GuestController;
import java.time.LocalDate;

/**
 *
 * @author jaime
 */
public class Reservation {

    private Integer id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Double totalCost;
    private String paymentMethod;
    private Integer guestId;
    private Guest guest;


    public Reservation(LocalDate checkInDate, LocalDate chackOuDate, double totalCost, String paymentMethod,
            Guest guest) {
        this.checkInDate = checkInDate;
        this.checkOutDate = chackOuDate;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
        this.guest = guest;
    }

    // Constructor only for testing
    public Reservation(Integer id, LocalDate checkInDate, LocalDate chackOuDate, double totalCost, String paymentMethod,
            Integer guestId) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = chackOuDate;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
        this.guestId = guestId;
        this.guest = GuestController.readByID(guestId);
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Guest getGuest() {
        return guest;
    }

    @Override
    public String toString() {
        return String.format(
                "{id: %d,"
                        + "checkInDate: %s,"
                        + "checkOutDate: %s,"
                        + "totalCost: %.2f,"
                        + "paymenMethod: %s,"
                        + "guestName: %s,"
                        + "guestLastName: %s}",
                this.id, this.checkInDate, this.checkOutDate, this.totalCost,
                this.paymentMethod, this.guest.getGuestName(), this.guest.getGuestLastName());

    }

}

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
public class Reservation {

    private Integer id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Double totalCost;
    private String paymentMethod;
    private Integer guestId;
    private String guestName;
    private String guestLastName;

    public Reservation(LocalDate checkInDate, LocalDate chackOuDate, double totalCost, String paymentMethod,
            Integer guestId) {
        this.checkInDate = checkInDate;
        this.checkOutDate = chackOuDate;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
        this.guestId = guestId;
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
    }

    public Reservation(Integer id, LocalDate checkInDate, LocalDate chackOuDate, double totalCost, String paymentMethod,
            String guestName, String guestLastName) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = chackOuDate;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
        this.guestName = guestName;
        this.guestLastName = guestLastName;
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

    public Integer getGuestId() {
        return guestId;
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
                this.paymentMethod, this.guestName, this.guestLastName);

    }

}

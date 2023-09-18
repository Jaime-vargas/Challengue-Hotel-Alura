package com.hotelAlura.models;

import com.hotelAlura.controllers.GuestController;
import java.time.LocalDate;

/**
 * 
 * @author jaime
 * Modelo del tipo Reservation contiene propiedades con los mismos campos contenidos en la base de datos
 * incluye getters y setters de todos los atrubutos 
 */
public class Reservation {

    private Integer id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Double totalCost;
    private String paymentMethod;
    private Integer guestId;
    private Guest guest;
/**
 * Constructor utilizado para el registro de Reservaciones
 * @param checkInDate
 * @param chackOuDate
 * @param totalCost
 * @param paymentMethod
 * @param guest 
 */
    public Reservation(LocalDate checkInDate, LocalDate chackOuDate, double totalCost, String paymentMethod,
            Guest guest) {
        this.checkInDate = checkInDate;
        this.checkOutDate = chackOuDate;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
        this.guest = guest;
    }

/**
 * Constructor utilizado al leer reservaciones existentes
 * @param id
 * @param checkInDate
 * @param chackOuDate
 * @param totalCost
 * @param paymentMethod
 * @param guestId 
 */
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

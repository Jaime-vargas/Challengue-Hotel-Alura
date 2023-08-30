package com.hotelAlura.test;

import java.time.LocalDate;

import com.hotelAlura.DAO.ReservationDAO;
import com.hotelAlura.Factory.ConnectionFactory;
import com.hotelAlura.models.Reservation;

public class ConnectionTestReservation {
    public static void main(String[] args) {

        ReservationDAO reservationDAO;
        ConnectionFactory connection = new ConnectionFactory();
        reservationDAO = new ReservationDAO(connection.doConnection());
        Reservation reservation = new Reservation(9, LocalDate.of(2023, 10, 20), LocalDate.of(2023, 9, 15), 766.99,
                "Credit", 4);
        System.out.println(reservation.getCheckInDate());

        System.out.println(reservationDAO.update(reservation));

        // var reservations = reservationDAO.read();

        // for (int i = 0; i < reservations.size(); i++) {

        // System.out.println("name: " + reservations.get(i).toString());
        /// }
    }
}

package com.hotelAlura.DAO;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hotelAlura.models.Reservation;

public class ReservationDAO {

    private Connection connection;

    public ReservationDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean save(Reservation reservation) {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO reservations (checkInDate, checkOutDate, totalCost, paymentMethod, guestId)"
                        + "VALUES (?,?,?,?,?)")) {
            Date checkInDate = Date.valueOf(reservation.getCheckInDate());
            Date checkOutDate = Date.valueOf(reservation.getCheckOutDate());
            statement.setDate(1, checkInDate);
            statement.setDate(2, checkOutDate);
            statement.setBigDecimal(3, BigDecimal.valueOf(reservation.getTotalCost()));
            statement.setString(4, reservation.getPaymentMethod());
            statement.setInt(5, reservation.getGuestId());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }

    }

    public List<Reservation> read() {
        List<Reservation> reservations = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT reservations.id, reservations.checkInDate , reservations.checkOutDate, reservations.totalcost, reservations.paymentMethod, guests.guestName, guests.guestLastName "
                        + "FROM reservations INNER JOIN guests ON reservations.guestId = guests.id")) {
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                reservations.add(new Reservation(
                        resultset.getInt("id"),
                        resultset.getDate("checkInDate").toLocalDate(),
                        resultset.getDate("checkOutDate").toLocalDate(),
                        resultset.getDouble("totalCost"),
                        resultset.getString("paymentMethod"),
                        resultset.getString("guestName"),
                        resultset.getString("guestLastName")));
            }

            return reservations;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean update(Reservation reservation) {
        try (PreparedStatement statement = connection.prepareStatement(
                "UPDATE reservations SET checkInDate = ?, checkOutDate = ?, totalCost = ?, paymentMethod = ? "
                        + "WHERE id = ?")) {
            Date checkInDate = Date.valueOf(reservation.getCheckInDate());
            Date checkOutDate = Date.valueOf(reservation.getCheckOutDate());
            statement.setDate(1, checkInDate);
            statement.setDate(2, checkOutDate);
            statement.setDouble(3, reservation.getTotalCost());
            statement.setString(4, reservation.getPaymentMethod());
            statement.setInt(5, reservation.getId());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }

}

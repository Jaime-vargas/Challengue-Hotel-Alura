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
/**
 * Clase ReservationDAO
 * @author jaime
 * en esta clase se implementan los metodos para guardar, actualizar y leer los registros de tipo Reservation
 * la variable connection se utiliza como parametro para mandar una coneccion ya establecida a la base de datos de tipo MySQL
 * 
 */
public class ReservationDAO {

    private Connection connection;

    public ReservationDAO(Connection connection) {
        this.connection = connection;
    }
/**
 * Metodo Guardar
 * @param reservation se recibe como parametro un ojeto de tipo Reservation para extraer los datos y realizar el guardado de los datos
 * @return como respuesta manda un booleano (true: en caso de que se guardara exitosamente false: en caso de algun problema)
 * @throws SQLException manda la excepcion para ser tratada en donde se llama al metodo 
 * 
 */
    public boolean save(Reservation reservation) throws SQLException{
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO reservations (checkInDate, checkOutDate, totalCost, paymentMethod, guestId)"
                        + "VALUES (?,?,?,?,?)")) {
            Date checkInDate = Date.valueOf(reservation.getCheckInDate());
            Date checkOutDate = Date.valueOf(reservation.getCheckOutDate());
            statement.setDate(1, checkInDate);
            statement.setDate(2, checkOutDate);
            statement.setBigDecimal(3, BigDecimal.valueOf(reservation.getTotalCost()));
            statement.setString(4, reservation.getPaymentMethod());
            statement.setInt(5, reservation.getGuest().getId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new SQLException();
        }
    }
/**
 * Metodo leer
 * @return List<Reservation> retorna un Arraylist con todos los registros encontrados en la base de datos
 * en caso de no encontrar registros retorna NULL
 */    
    public List<Reservation> read() {
        List<Reservation> reservations = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT reservations.id, reservations.checkInDate , reservations.checkOutDate, reservations.totalcost, reservations.paymentMethod, reservations.guestId "
                        + "FROM reservations")) {
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                reservations.add(new Reservation(
                        resultset.getInt("id"),
                        resultset.getDate("checkInDate").toLocalDate(),
                        resultset.getDate("checkOutDate").toLocalDate(),
                        resultset.getDouble("totalCost"),
                        resultset.getString("paymentMethod"),
                        resultset.getInt("guestId")));
            }
            return reservations;
        } catch (SQLException e) {
            // TODO in case an Exception
            return null;
        }
    }
/**
 * Metodo Actualizar
 * @param reservation recibe un objeto de tipo Reservation el cual debe ya contener un id existente dentro de la base de datos y actualizara el resto de campos con los contenidos dentro del objeto
 * @return como respuesta manda un booleano (true: en caso de que se actualizara exitosamente false: en caso de algun problema)
 */
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

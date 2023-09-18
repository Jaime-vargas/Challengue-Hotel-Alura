package com.hotelAlura.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotelAlura.models.Guest;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * Clase GuestDAO
 * @author jaime
 * en esta clase se implementan los metodos para guardar, actualizar leer y borrar los registros de tipo Guest
 * la variable connection se utiliza como parametro para mandar una coneccion ya establecida a la base de datos de tipo MySQL
 * 
 */
public class GuestDAO {

    private Connection connection;

    public GuestDAO(Connection connection) {
        this.connection = connection;
    }
/**
 * Metodo Guardar
 * @param guest se recibe como parametro un ojeto de tipo Guest para extraer los datos y realizar el guardado de los datos
 * @return como respuesta manda un booleano (true: en caso de que se guardara exitosamente false: en caso de algun problema)
 * @throws SQLException manda la excepcion para ser tratada en donde se llama al metodo 
 * 
 */
    public boolean save(Guest guest) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO guests (guestName, guestLastName, guestBirthday, guestNationality, guestPhone) "
                + "VALUES (?, ?, ?, ?, ?)")) {
            Date guestBirthday = Date.valueOf(guest.getGuestBirthday());
            statement.setString(1, guest.getGuestName());
            statement.setString(2, guest.getGuestLastName());
            statement.setDate(3, guestBirthday);
            statement.setString(4, guest.getGuestNationality());
            statement.setString(5, guest.getGuestPhone());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            throw new SQLException();
        }
    }
/**
 * Metodo leer
 * @return List<Guest> retorna un Arraylist con todos los registros encontrados en la base de datos
 * en caso de no encontrar registros retorna NULL
 */
    public List<Guest> read() {
        List<Guest> guests = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT id, guestName, guestLastName, guestBirthday, guestNationality, guestPhone FROM guests")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                guests.add(new Guest(
                        resultSet.getInt("id"),
                        resultSet.getString("guestName"),
                        resultSet.getString("guestLastName"),
                        resultSet.getDate("guestBirthday").toLocalDate(),
                        resultSet.getString("guestNationality"),
                        resultSet.getString("guestPhone")));
            }
            return guests;
        } catch (SQLException e) {
            return null;
        }
    }
/**
 * Metodo Leer por ID
 * @param guestID recibe como parametro un numero de tipo Integer el cual se utilizara como paratemtro de busqueda para encontrar un registro en la base de datos 
 * @return devuelve un objeto del tipo Guest el cual contendra todos los datos entontrados del registro en caso de encontarlo
 */
    public Guest readByID(Integer guestID) {
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT id, guestName, guestLastName, guestBirthday, guestNationality, guestPhone FROM guests WHERE id = ?")) {
            statement.setInt(1, guestID);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Guest guest = new Guest();
            guest.setId(resultSet.getInt("id"));
            guest.setGuestName(resultSet.getString("guestName"));
            guest.setGuestLastName(resultSet.getString("guestLastName"));
            guest.setGuestBirthday(resultSet.getDate("guestBirthday").toLocalDate());
            guest.setGuestNationality(resultSet.getString("guestNationality"));
            guest.setGuestPhone(resultSet.getString("guestPhone"));
            return guest;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
/**
 * Metodo Actualizar
 * @param guest recibe un objeto de tipo Guest el cual debe ya contener un id existente dentro de la base de datos y actualizara el resto de campos con los contenidos dentro del objeto
 * @return como respuesta manda un booleano (true: en caso de que se actualizara exitosamente false: en caso de algun problema)
 */
    public boolean update(Guest guest) {
        try (PreparedStatement statement = connection.prepareStatement(
                "UPDATE guests SET guestName = ?, guestLastName = ?, guestBirthday = ?, guestNationality = ?, guestPhone = ? "
                + "WHERE id = ?")) {
            Date guestBithday = Date.valueOf(guest.getGuestBirthday());
            statement.setString(1, guest.getGuestName());
            statement.setString(2, guest.getGuestLastName());
            statement.setDate(3, guestBithday);
            statement.setString(4, guest.getGuestNationality());
            statement.setString(5, guest.getGuestPhone());
            statement.setInt(6, guest.getId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }
/**
 * Metodo Borrar
 * @param guest recibe un objeto de tipo Guest el cual debe ya contener un id existente dentro de la base de datos y eliminara el registro el cual contenga ese ID
 * @return como respuesta manda un booleano (true: en caso de que se borrara exitosamente false: en caso de algun problema)
 */
    public boolean delete(Guest guest) {
        try (PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM guests WHERE id = ? ;")) {
            statement.setInt(1, guest.getId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }
}

package com.hotelAlura.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotelAlura.models.Guest;

public class GuestDAO {

    private Connection connection;

    public GuestDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean save(Guest guest) {
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

        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }

    public List<Guest> read(){
        List<Guest> guests = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(
            "SELECT id, guestName, guestLastName, guestBirthday, guestNationality, guestPhone FROM guests")){
                ResultSet resultSet = statement.executeQuery();
                
                while (resultSet.next()){
                    guests.add(new Guest(
                        resultSet.getInt("id"),
                        resultSet.getString("guestName"),
                        resultSet.getString("guestLastName"),
                        resultSet.getDate("guestBirthday").toLocalDate(),
                        resultSet.getString("guestNationality"),
                        resultSet.getString("guestPhone")));
                }
                return guests;
            }catch(SQLException e){
                return null;
            }
    }

    public boolean update(Guest guest){
        try(PreparedStatement statement = connection.prepareStatement(
            "UPDATE guests SET guestName = ?, guestLastName = ?, guestBirthday = ?, guestNationality = ?, guestPhone = ? "
            +"WHERE id = ?")){
            Date guestBithday = Date.valueOf(guest.getGuestBirthday());
            statement.setString(1, guest.getGuestName());
            statement.setString(2,guest.getGuestLastName());
            statement.setDate(3, guestBithday);
            statement.setString(4,guest.getGuestNationality());
            statement.setString(5,guest.getGuestPhone());
            statement.setInt(6,guest.getId());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;

            }catch(SQLException e){
                // TODO error frame with error
            return false;
            }
    }

}

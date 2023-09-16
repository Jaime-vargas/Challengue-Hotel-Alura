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
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GuestDAO {

    private Connection connection;

    public GuestDAO(Connection connection) {
        this.connection = connection;
    }

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
//
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
    
    public Guest readByID(Integer guestID){
         
        try(PreparedStatement statement = connection.prepareStatement(
            "SELECT id, guestName, guestLastName, guestBirthday, guestNationality, guestPhone FROM guests WHERE id = ?")){
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
            }catch(SQLException e){
                e.printStackTrace(); 
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
    
    public boolean delete(Guest guest) {
        try (PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM guests WHERE id = ? ;")){
            statement.setInt(1, guest.getId());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }

}

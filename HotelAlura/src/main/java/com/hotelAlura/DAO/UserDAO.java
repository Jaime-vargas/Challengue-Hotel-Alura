/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelAlura.DAO;

import com.hotelAlura.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaime
 */
public class UserDAO {

    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean save(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO users (username, password) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }

    public List<User> read() {
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT id, username, password FROM users");
            statement.execute();

            try (ResultSet resultSet = statement.getResultSet()) {
                while (resultSet.next()) {
                    users.add(new User(
                            resultSet.getInt("id"),
                            resultSet.getString("username"),
                            resultSet.getString("password")));
                }
            }
            return users;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean update(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE users SET username = ?, password = ? WHERE id = ? ;");
            statement.setInt(3, user.getId());
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }

    public boolean delete(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM users WHERE id = ? ;");
            statement.setInt(1, user.getId());

            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }

    public boolean authenticate(User user) {
        try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * from users WHERE(username = BINARY ? AND password = BINARY ?)")){
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
            
        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }
}

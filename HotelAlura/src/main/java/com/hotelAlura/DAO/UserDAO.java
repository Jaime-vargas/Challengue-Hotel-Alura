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
 * Clase UserDAO
 * @author jaime
 * en esta clase se implementan los metodos para guardar, actualizar leer, borrar los registros de tipo User
 * existe un metodo extra llamado authenticate el cual realiza la comparacion de valores para determinar si un usuario es valido o no 
 * la variable connection se utiliza como parametro para mandar una coneccion ya establecida a la base de datos de tipo MySQL
 * 
 */
public class UserDAO {

    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }
/**
 * Metodo Guardar @
 * @param user se recibe como parametro un ojeto de tipo User para extraer los datos y realizar el guardado de los datos
 * @return como respuesta manda un booleano (true: en caso de que se guardara exitosamente false: en caso de algun problema)
 * 
 */
    public boolean save(User user) {
        try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO users (username, password) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS)){
            
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }
/**
 * Metodo leer
 * @return List<User> retorna un Arraylist con todos los registros encontrados en la base de datos
 * en caso de no encontrar registros retorna NULL
 */
    public List<User> read() {
        List<User> users = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT id, username, password FROM users")){           
            statement.execute();
            ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    users.add(new User(
                            resultSet.getInt("id"),
                            resultSet.getString("username"),
                            resultSet.getString("password")));
                }
            return users;
        } catch (SQLException e) {
            return null;
        }
    }
/**
 * Metodo Actualizar
 * @param user recibe un objeto de tipo User el cual debe ya contener un id existente dentro de la base de datos y actualizara el resto de campos con los contenidos dentro del objeto
 * @return como respuesta manda un booleano (true: en caso de que se actualizara exitosamente false: en caso de algun problema)
 */
    public boolean update(User user) {
        try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE users SET username = ?, password = ? WHERE id = ? ;")){
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
/**
 * Metodo Borrar
 * @param user recibe un objeto de tipo User el cual debe ya contener un id existente dentro de la base de datos y eliminara el registro el cual contenga ese ID
 * @return como respuesta manda un booleano (true: en caso de que se borrara exitosamente false: en caso de algun problema)
 */
    public boolean delete(User user) {
        try (PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM users WHERE id = ? ;")){
            statement.setInt(1, user.getId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            // TODO error frame with error
            return false;
        }
    }
/**
 * Metodo Autenticar
 * @param user recibe un objeto de tipo User dentro del metodo se busca coincidencia con un usuario y una contraseña para verificar si existe o  no un usuario
 * @return como respuesta manda un booleano (true: en caso de encontrar al usuario false: en caso de que no)
 */ 
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

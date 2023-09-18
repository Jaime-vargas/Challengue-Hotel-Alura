package com.hotelAlura.models;

/**
 * 
 * @author jaime
 * Modelo del tipo User contiene propiedades con los mismos campos contenidos en la base de datos
 * incluye getters y setters de todos los atrubutos 
 */
public class User {
    private Integer id;
    private String username;
    private String password;
/**
 * Constructor utilizado para el registro / autenticacion de usuarios
 * @param username
 * @param password 
 */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
/**
 * Constructor utilizado al leer usuarios existentes
 * @param id
 * @param username
 * @param password 
 */
    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format(
                "{id: %d, username: %s}",
                this.id, this.username);
    }
}

package com.hotelAlura.factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 *
 * @author jaime
 * En esta clase se realiza la conexion a la base de datos 
 * el apartado Configs sirve para colocar los datos de conexion a la base de datos MySQL
 */
public class ConnectionFactory {

    //Configs
    private final String DATABASE_URL = "jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC";
    private final String DATABASE_USER = "root";
    private final String DATABASE_PASSWORD = "5x0292X0.";

    private DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(DATABASE_URL);
        comboPooledDataSource.setUser(DATABASE_USER);
        comboPooledDataSource.setPassword(DATABASE_PASSWORD);
        comboPooledDataSource.setMaxPoolSize(10);
        this.dataSource = comboPooledDataSource;
    }

    public Connection doConnection() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package edu.uptc.electiva2.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

    private Connection conection;
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String URL = "jdbc:mysql://localhost:3306/electiva2";
    private String DRIVER = "com.mysql.jdbc.Driver";

    public Conection() {
        conection = null;
    }

    public boolean connectBD() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class.forName(DRIVER).newInstance();
        boolean state = false;

        try {

            conection = DriverManager.getConnection(URL, USER, PASSWORD);
            state = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return state;

    }

    public void close() throws SQLException {
        conection.close();
    }

    public Connection getConection() {
        return conection;
    }

}

package edu.uptc.electiva2.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserConection {

    // Attributes------------------------------------
    private Conection conection;
    private UsersBD sql;

    // Building--------------------------------------
    public UserConection() {
        conection = new Conection();
        sql = new UsersBD();
    }

    public ResultSet selectAllUsers() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        conection.connectBD();
        Statement st = conection.getConection().createStatement();
        ResultSet rs = st.executeQuery(sql.selectAllUsers());
        return rs;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uptc.electiva2.management;

import edu.uptc.electiva2.persistence.User;
import edu.uptc.electiva2.persistence.UserConection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JUANDA-07
 */
public class ManagementUser {

    // Attrbutes--------------------------------------
    private ArrayList<User> arrayUsers;

    private UserConection userCon;

    // Building----------------------------------------
    public ManagementUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        arrayUsers = new ArrayList<>();
        userCon = new UserConection();
        loadUsers();
    }

    // Metodo que carga los usuarios al arreglo
    private void loadUsers() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ResultSet rs = userCon.selectAllUsers();

        while (rs.next()) {
            String idUser = rs.getString(1);
            String password = rs.getString(5);

            arrayUsers.add(new User(idUser, password));
        }
    }

}

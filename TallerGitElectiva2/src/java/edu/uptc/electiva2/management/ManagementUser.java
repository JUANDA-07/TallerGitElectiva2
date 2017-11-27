/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uptc.electiva2.management;

import edu.uptc.electiva2.persistence.Conection;
import edu.uptc.electiva2.persistence.User;
import edu.uptc.electiva2.persistence.UserConection;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author JUANDA-07
 */
public class ManagementUser {

    // Attrbutes--------------------------------------
    private ArrayList<User> arrayUsers;

    private UserConection userCon;
    private Statement stam;
    private PreparedStatement psInsertarUser;

    // Building----------------------------------------
    public ManagementUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        arrayUsers = new ArrayList<>();
        userCon = new UserConection();
        loadUsers();
    }

    // Metodo que carga los usuarios al arreglo
    public void loadUsers() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ResultSet rs = userCon.selectAllUsers();

        while (rs.next()) {
            String idUser = rs.getString(1);
            String password = rs.getString(5);
            arrayUsers.add(new User(idUser, password));
        }
    }

    public User findUser(String id, String pass) throws Exception {
        String passenc = md5(pass);
        System.out.println("Esta es la cont que llega encriptada " + passenc);
        for (User user : arrayUsers) {
            if (user.getIdUser().equals(id) && user.getPassword().equals(passenc)) {
                return user;
            }
        }
        return null;
    }

    public String md5(String clear) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(clear.getBytes());
        int size = b.length;
        StringBuffer h = new StringBuffer(size);
        //algoritmo y arreglo md5
        for (int i = 0; i < size; i++) {
            int u = b[i] & 255;
            if (u < 16) {
                h.append("0" + Integer.toHexString(u));
            } else {
                h.append(Integer.toHexString(u));
            }
        }
        //clave encriptada
        return h.toString();
    }

    // Metodo para registrar usuarios en la BD
    public User registrarUser(User user) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiva2", "root", "");

        stam = conn.createStatement();
        psInsertarUser = conn.prepareStatement("INSERT INTO user(id_user,nombre,apellido,edad,password)" + "VALUES(?,?,?,?,md5(?))");

        psInsertarUser.setString(1, user.getIdUser());
        psInsertarUser.setString(2, user.getNombre());
        psInsertarUser.setString(3, user.getApellido());
        psInsertarUser.setString(4, user.getEdad());
        psInsertarUser.setString(5, user.getPassword());

        psInsertarUser.executeUpdate();
        conn.close();
        return user;
    }

    // Gettes and Setters-----------------------------------
    public ArrayList<User> getArrayUsers() {
        return arrayUsers;
    }

    public void setArrayUsers(ArrayList<User> arrayUsers) {
        this.arrayUsers = arrayUsers;
    }

    public UserConection getUserCon() {
        return userCon;
    }

    public void setUserCon(UserConection userCon) {
        this.userCon = userCon;
    }

}

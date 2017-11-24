package edu.uptc.electiva2.persistence;

public class User {

    // Attributes-----------------------------------
    private String idUser;
    private String password;

    // Building-------------------------------------
    public User(String idUser, String password) {
        this.idUser = idUser;
        this.password = password;
    }

    // Getters and Setters--------------------------
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

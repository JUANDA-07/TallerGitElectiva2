package edu.uptc.electiva2.persistence;

public class User {

    // Attributes-----------------------------------
    private String idUser;
    private String nombre;
    private String apellido;
    private String edad;
    private String password;

    // Building-------------------------------------
    public User(String idUser, String password) {
        this.idUser = idUser;
        this.password = password;
    }

    public User(String idUser, String nombre, String apellido, String edad, String password) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.password = password;
    }

    // Getters and Setters--------------------------
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

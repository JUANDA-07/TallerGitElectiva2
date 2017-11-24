package edu.uptc.electiva2.persistence;

public class UsersBD {

    // Attributes---------------------------------
    // Building-----------------------------------
    public UsersBD() {
        cargarUsers();
    }

    // Methods------------------------------------
    private void cargarUsers() {
        selectAllUsers();
    }

    // metodo que va a realizar la consulta en la base de datos.
    public String selectAllUsers() {
        return "select*from user";
    }

}

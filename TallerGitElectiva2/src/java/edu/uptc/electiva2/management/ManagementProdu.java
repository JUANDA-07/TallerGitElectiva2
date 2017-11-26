/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uptc.electiva2.management;

import edu.uptc.electiva2.persistence.Conection;
import edu.uptc.electiva2.persistence.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavidLenovo
 */
public class ManagementProdu {
    ArrayList<Product> productos;

    public ManagementProdu() {
        this.productos = new ArrayList<>();
        cargarProductos();
    }
    
    public void cargarProductos(){
        try {
            Conection conexion= new Conection();
                if( conexion.connectBD() ){
                    
                    Statement st = conexion.getConection().createStatement();
                    ResultSet rs = st.executeQuery("select * from product");
                    while (rs.next()) {
                        
                        String nombre=rs.getString(1);
                        String costo=rs.getString(2);
                        String url=rs.getString(3);
                        
                        productos.add(new Product(nombre, costo, url));
                                
                     }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManagementProdu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ManagementProdu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ManagementProdu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(ManagementProdu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Product> getProducts(){
        return productos;
    }
    
}

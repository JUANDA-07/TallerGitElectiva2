/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.uptc.electiva2.management.ManagementProdu;
import edu.uptc.electiva2.persistence.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JUANDA-07
 */
public class TestCargaProduct {

    private ManagementProdu mngp;

    public TestCargaProduct() {
        mngp = new ManagementProdu();
    }

    @Test
    public void testSelectAllUsers() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        System.out.println(".........................................");
        System.out.println("USUARIOS EN LA BASE DE DATOS");
        System.out.println(".........................................");

        for (Product p : mngp.getProducts()) {
            System.out.println("--------------------------------------");
            System.out.println(p.getName());
            System.out.println(p.getCosto());
            System.out.println(p.getUrl());
            System.out.println("--------------------------------------");
        }

    }
}

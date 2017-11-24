/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.uptc.electiva2.persistence.Conection;
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
public class TestConexion {

    // Attributes---------------------------------
    private Conection connect;

    // Building-----------------------------------
    public TestConexion() {

    }

    public void setUpEscenarie() {
        connect = new Conection();
    }

    @Test
    public void testConnect() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        setUpEscenarie();
        assertTrue(connect.connectBD());
    }
}

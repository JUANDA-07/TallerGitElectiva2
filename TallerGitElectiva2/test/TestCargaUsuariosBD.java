
import edu.uptc.electiva2.persistence.UserConection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCargaUsuariosBD {

    private UserConection userCon;

    public TestCargaUsuariosBD() {
        userCon = new UserConection();
    }

    @Test
    public void testSelectAllUsers() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        assertNotNull(userCon.selectAllUsers());
        ResultSet rs = userCon.selectAllUsers();

        System.out.println(".........................................");
        System.out.println("USUARIOS EN LA BASE DE DATOS");
        System.out.println(".........................................");
        while (rs.next()) {
            String idUser = rs.getString(1);
            String password = rs.getString(5);

            System.out.printf("%-20s %-20s\n", idUser, password);
        }
    }
}

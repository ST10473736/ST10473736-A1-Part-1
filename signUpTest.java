import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proga1.signupUI;

public class signUpTest {
    
    public signUpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String user = "";
        signupUI instance = new signupUI();
        boolean expResult = false;
        boolean result = instance.isValidUsername(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testUsernameExists() {
        System.out.println("usernameExists");
        String username = "";
        signupUI instance = new signupUI();
        boolean expResult = false;
        boolean result = instance.usernameExists(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String pass = "";
        signupUI instance = new signupUI();
        boolean expResult = false;
        boolean result = instance.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testIsValidPhone() {
        System.out.println("isValidPhone");
        String num = "";
        signupUI instance = new signupUI();
        boolean expResult = false;
        boolean result = instance.isValidPhone(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testWritetoFile() {
        System.out.println("writetoFile");
        String username = "";
        String password = "";
        String phone = "";
        signupUI instance = new signupUI();
        instance.writetoFile(username, password, phone);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testClearFields() {
        System.out.println("clearFields");
        signupUI instance = new signupUI();
        instance.clearFields();
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        signupUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
}

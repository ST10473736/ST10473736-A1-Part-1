import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proga1.loginUI;

public class loginTest {
    
    public loginTest() {
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
    public void testAuthenticate() {
        System.out.println("authenticate");
        String userInput = "root_";
        String passInput = "root1234!";
        loginUI instance = new loginUI();
        int expResult = 1;
        int result = instance.authenticate(userInput, passInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        loginUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

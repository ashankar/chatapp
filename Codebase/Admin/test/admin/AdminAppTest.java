/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;

import java.awt.Window;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anand Shankar
 */
public class AdminAppTest {

    public AdminAppTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of startup method, of class AdminApp.
     */
    @Test
    public void testStartup() {
        System.out.println("startup");
        AdminApp instance = new AdminApp();
        instance.startup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configureWindow method, of class AdminApp.
     */
    @Test
    public void testConfigureWindow() {
        System.out.println("configureWindow");
        Window root = null;
        AdminApp instance = new AdminApp();
        instance.configureWindow(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplication method, of class AdminApp.
     */
    @Test
    public void testGetApplication() {
        System.out.println("getApplication");
        AdminApp expResult = null;
        AdminApp result = AdminApp.getApplication();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AdminApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
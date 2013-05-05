/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.util.Hashtable;
import java.util.Vector;
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
public class ConnectToDBTest {

    public ConnectToDBTest() {
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
     * Test of varifyData method, of class ConnectToDB.
     */
    @Test
    public void testVarifyData() {
        System.out.println("varifyData");
        String id = "";
        String pass = "";
        ConnectToDB instance = new ConnectToDB();
        boolean expResult = false;
        boolean result = instance.varifyData(id, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class ConnectToDB.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Hashtable hs = null;
        ConnectToDB instance = new ConnectToDB();
        boolean expResult = false;
        boolean result = instance.setData(hs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp method, of class ConnectToDB.
     */
    @Test
    public void testSetTemp() {
        System.out.println("setTemp");
        String id = "";
        ConnectToDB instance = new ConnectToDB();
        String expResult = "";
        String result = instance.setTemp(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp method, of class ConnectToDB.
     */
    @Test
    public void testGetTemp() {
        System.out.println("getTemp");
        ConnectToDB instance = new ConnectToDB();
        Vector expResult = null;
        Vector result = instance.getTemp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delTemp method, of class ConnectToDB.
     */
    @Test
    public void testDelTemp() {
        System.out.println("delTemp");
        String id = "";
        ConnectToDB instance = new ConnectToDB();
        instance.delTemp(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;

import org.jdesktop.application.Task;
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
public class AdminViewTest {

    public AdminViewTest() {
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
     * Test of isSaveNeeded method, of class AdminView.
     */
    @Test
    public void testIsSaveNeeded() {
        System.out.println("isSaveNeeded");
        AdminView instance = null;
        boolean expResult = false;
        boolean result = instance.isSaveNeeded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRecordSelected method, of class AdminView.
     */
    @Test
    public void testIsRecordSelected() {
        System.out.println("isRecordSelected");
        AdminView instance = null;
        boolean expResult = false;
        boolean result = instance.isRecordSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newRecord method, of class AdminView.
     */
    @Test
    public void testNewRecord() {
        System.out.println("newRecord");
        AdminView instance = null;
        instance.newRecord();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRecord method, of class AdminView.
     */
    @Test
    public void testDeleteRecord() {
        System.out.println("deleteRecord");
        AdminView instance = null;
        instance.deleteRecord();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class AdminView.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        AdminView instance = null;
        Task expResult = null;
        Task result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refresh method, of class AdminView.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        AdminView instance = null;
        Task expResult = null;
        Task result = instance.refresh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAboutBox method, of class AdminView.
     */
    @Test
    public void testShowAboutBox() {
        System.out.println("showAboutBox");
        AdminView instance = null;
        instance.showAboutBox();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodproject;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joshvasil
 */
public class MainPageTest {
    
    public MainPageTest() {
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

    /**
     * Test of userList method, of class MainPage.
     */
    @Test
    public void testUserList() {
        System.out.println("userList");
        MainPage instance = new MainPage();
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.userList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of show_user method, of class MainPage.
     */
    @Test
    public void testShow_user() {
        System.out.println("show_user");
        MainPage instance = new MainPage();
        instance.show_user();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class MainPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adrills;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jgillham
 */
public class ADrillsTest {
    
    public ADrillsTest() {
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
     * Test of main method, of class ADrills.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ADrills.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void test_getElement101() {
        int[] input = { 1, 6, 13, 8, 20 };
        assertEquals( 1, ADrills.getElement101( input, 0 ) );
        assertEquals( 6, ADrills.getElement101( input, 1 ) );
        assertEquals( 13, ADrills.getElement101( input, 2 ) );
        assertEquals( 20, ADrills.getElement101( input, 4 ) );
    }
}

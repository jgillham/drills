/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adrills;

/**
 *
 * @author jgillham
 */
public class ADrillsTest {
    static public void main( String[] args ) {
        try {
            test_getElement101();
            System.out.println( "test_getElement101 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            test_getElement102();
            System.out.println( "test_getElement102 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            test_getElement103();
            System.out.println( "test_getElement103 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
    }
        
    static public void test_getElement101() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        if( 1 != ADrills.getElement101( input, 0 ) )
            throw new Exception( "Test failed." );
        if( 6 != ADrills.getElement101( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 13 != ADrills.getElement101( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 20 != ADrills.getElement101( input, 4 ) )
            throw new Exception( "Test failed." );
        try {
            ADrills.getElement102( input, -1 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
        try {
            ADrills.getElement102( input, 5 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    static public void test_getElement102() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        if( 1 != ADrills.getElement102( input, -1 ) )
            throw new Exception( "Test failed." );
        if( 6 != ADrills.getElement102( input, 0 ) )
            throw new Exception( "Test failed." );
        if( 13 != ADrills.getElement102( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 8 != ADrills.getElement102( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 20 != ADrills.getElement102( input, 3 ) )
            throw new Exception( "Test failed." );
        try {
            ADrills.getElement102( input, 4 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    static public void test_getElement103() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        
        if( 1 != ADrills.getElement103( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 6 != ADrills.getElement103( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 13 != ADrills.getElement103( input, 3 ) )
            throw new Exception( "Test failed." );
        if( 8 != ADrills.getElement103( input, 4 ) )
            throw new Exception( "Test failed." );
        if( 20 != ADrills.getElement103( input, 5 ) )
            throw new Exception( "Test failed." );
        try {
            ADrills.getElement103( input, -1 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
        try {
            ADrills.getElement103( input, 6 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
}

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
            System.out.println( "Test successful!" );
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
    }
}

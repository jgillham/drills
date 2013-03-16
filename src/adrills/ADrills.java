/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adrills;

/**
 *
 * @author domingo flores
 */
public class ADrills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    /**
     * Question #A.1)
     * The method returns the nth element of the array.
     * 
     * @param array is the array to look through.
     * @param n is the index of the element to grab
     * 
     * @return the value of the nth element.
     */
    public static int getElement101( int[] array, int n) {
        //TODO delete the line below and write your solution.
        throw new UnsupportedOperationException();
    }
    
    /**
     * Question #A.2)
     * The method returns the element after the nth element of the array.
     * 
     * @param array is the array to look through.
     * @param n is the index of the element to grab
     * 
     * @return the value of the element after nth element.
     */
    public static int getElement102( int[] array, int n) {
        //TODO delete the line below and write your solution.
        throw new UnsupportedOperationException();
    }
    
    /**
     * Question #A.3)
     * The method returns the element before the nth element of the array.
     * 
     * @param array is the array to look through.
     * @param n is the index of the element to grab
     * 
     * @return the value of the element before nth element.
     */
    public static int getElement103( int[] array, int n) {
        //TODO delete the line below and write your solution.
        throw new UnsupportedOperationException();
    }
    
    /**
     * Question #B.1)
     * The method returns a new array with the even elements. For example, for
     *  the array { 3, 5, 7 } the return is { 5 } and for { 6, 7, 2, 3 } the 
     *  return is { 7, 3 }.
     * 
     * @param array is the array to look through.
     * 
     * @return the new array with the even elements.
     */
    public static int[] changeArray101( int[] array) {
        int[] result = new int[ array.length / 2 ];
        for( int i = 1; i < array.length; i += 2 ) {
            result[ i / 2 ] = array[ i ];
        }
        return result;
    }
}

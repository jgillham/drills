/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adrills;

/**
 *
 * @author domingo flores
 */
public class ArrayQuestions extends Questions {
    public static class UnansweredQuestionException 
            extends UnsupportedOperationException {}
    
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
        return array[n];
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
        return array[n + 1];
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
        return array[n - 1];
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
    
    /**
     * Question #B.2)
     * The method returns a new array with the odd elements. For example, for
     *  the array { 3, 5, 7 } the return is { 3, 7 } and for { 6, 7, 2, 3 } the 
     *  return is { 6, 3 }.
     * 
     * @param array is the array to look through.
     * 
     * @return the new array with the odd elements.
     */
    public static int[] changeArray102( int[] array) {
        int[] result = new int[ ( array.length + 1 ) / 2 ];
        for( int i = 0; i < array.length; i += 2 ) {
            result[ i / 2 ] = array[ i ];
        }
        return result;
    }
}

import java.util.Arrays;

/**
 *
 * @author jgillham
 */
public class GradeArrayQuestions {
    static public int possiblePoints = 0;
    static public void main( String[] args ) {
        int score = grade();
        System.out.printf( "You got %d out of %d.\n", score, possiblePoints );
    }
    static public int grade() {
        int result = 0;
        possiblePoints = 0;
        try {
            ++possiblePoints;
            test_getElement101();
            ++result;
            System.out.println( "test_getElement101 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_getElement102();
            ++result;
            System.out.println( "test_getElement102 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_getElement103();
            ++result;
            System.out.println( "test_getElement103 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        
        try {
            ++possiblePoints;
            test_changeArray101();
            ++result;
            System.out.println( "test_changeArray101 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_changeArray102();
            ++result;
            System.out.println( "test_changeArray102 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_combineArrays();
            ++result;
            System.out.println( "test_combineArrays successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_incrementArrays();
            ++result;
            System.out.println( "test_combineArrays successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_sumArray();
            ++result;
            System.out.println( "test_sumArray successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_getArrayMax();
            ++result;
            System.out.println( "test_getArrayMax successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            ++possiblePoints;
            test_getArrayMin();
            ++result;
            System.out.println( "test_getArrayMin successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        return result;
    }
        
    static public void test_getElement101() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        if( 1 != CS1.ArrayQuestions.getElement101( input, 0 ) )
            throw new Exception( "Test failed." );
        if( 6 != CS1.ArrayQuestions.getElement101( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 13 != CS1.ArrayQuestions.getElement101( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 20 != CS1.ArrayQuestions.getElement101( input, 4 ) )
            throw new Exception( "Test failed." );
        try {
            CS1.ArrayQuestions.getElement102( input, -1 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
        try {
            CS1.ArrayQuestions.getElement102( input, 5 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    static public void test_getElement102() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        if( 1 != CS1.ArrayQuestions.getElement102( input, -1 ) )
            throw new Exception( "Test failed." );
        if( 6 != CS1.ArrayQuestions.getElement102( input, 0 ) )
            throw new Exception( "Test failed." );
        if( 13 != CS1.ArrayQuestions.getElement102( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 8 != CS1.ArrayQuestions.getElement102( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 20 != CS1.ArrayQuestions.getElement102( input, 3 ) )
            throw new Exception( "Test failed." );
        try {
            CS1.ArrayQuestions.getElement102( input, 4 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    static public void test_getElement103() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        
        if( 1 != CS1.ArrayQuestions.getElement103( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 6 != CS1.ArrayQuestions.getElement103( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 13 != CS1.ArrayQuestions.getElement103( input, 3 ) )
            throw new Exception( "Test failed." );
        if( 8 != CS1.ArrayQuestions.getElement103( input, 4 ) )
            throw new Exception( "Test failed." );
        if( 20 != CS1.ArrayQuestions.getElement103( input, 5 ) )
            throw new Exception( "Test failed." );
        try {
            CS1.ArrayQuestions.getElement103( input, -1 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
        try {
            CS1.ArrayQuestions.getElement103( input, 6 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    
    static public void test_changeArray101() throws Exception {
        {
            int[] input = { 1, 2 };
            int[] expected = { 2 };
            int[] actual = CS1.ArrayQuestions.changeArray101( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
        {
            int[] input = { 1, 6, 13, 8, 20 };
            int[] expected = { 6, 8 };
            int[] actual = CS1.ArrayQuestions.changeArray101( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
    }
    static public void test_changeArray102() throws Exception {
        {
            int[] input = { 1 };
            int[] expected = { 1 };
            int[] actual = CS1.ArrayQuestions.changeArray102( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
        {
            int[] input = { 1, 2 };
            int[] expected = { 1 };
            int[] actual = CS1.ArrayQuestions.changeArray102( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
        {
            int[] input = { 1, 6, 13, 8, 20 };
            int[] expected = { 1, 13, 20 };
            int[] actual = CS1.ArrayQuestions.changeArray102( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }        
    }
    static public void test_combineArrays() throws Exception {
        {
            int[] input1 = { 5, 6, 13 },
                  input2 = { 7, 8, 20 },
                  expected = { 5, 6, 13, 7, 8, 20 },
                  actual = CS1.ArrayQuestions.combineArrays( input1, input2 );
        
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + expected[i] + " but was " + 
                                    actual[i] + "." );
                }
            }
        }
        {
            int[] input1 = { 5 },
                  input2 = { 7, 8, 20 },
                  expected = { 5, 7, 8, 20 },
                  actual = CS1.ArrayQuestions.combineArrays( input1, input2 );
        
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + expected[i] + " but was " + 
                                    actual[i] + "." );
                }
            }
        }
    }
    static public void test_incrementArrays() throws Exception {
        {
            int[] input1 = { 5 },
                  expected = { 10 },
                  actual = input1;
            CS1.ArrayQuestions.incrementArray( input1, 5 );
        
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + expected[i] + " but was " + 
                                    actual[i] + "." );
                }
            }
        }
        {
            int[] input1 = { 5, 6, 13 },
                  expected = { 7, 8, 15 },
                  actual = input1;
            CS1.ArrayQuestions.incrementArray( input1, 2 );
        
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + expected[i] + " but was " + 
                                    actual[i] + "." );
                }
            }
        }
    }
    static public void test_sumArray() throws Exception {
        {
            int[] input1 = { 5 };
            int expected = 5,
                actual = CS1.ArrayQuestions.sumArray( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
        {
            int[] input1 = { 5, 7, 2, 10, 3, 4 };
            int expected = 31,
                actual = CS1.ArrayQuestions.sumArray( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
    }
    static public void test_getArrayMax() throws Exception {
        {
            int[] input1 = { 5 };
            int expected = 5,
                actual = CS1.ArrayQuestions.getArrayMax( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
        {
            int[] input1 = { 5, 7, 3, 10, 2, 1 };
            int expected = 10,
                actual = CS1.ArrayQuestions.getArrayMax( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
        {
            int[] input1 = { Integer.MIN_VALUE };
            int expected = Integer.MIN_VALUE,
                actual = CS1.ArrayQuestions.getArrayMax( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
    }
    static public void test_getArrayMin() throws Exception {
        {
            int[] input1 = { 5 };
            int expected = 5,
                actual = CS1.ArrayQuestions.getArrayMin( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
        {
            int[] input1 = { 5, 7, 2, 10, 3, 4 };
            int expected = 2,
                actual = CS1.ArrayQuestions.getArrayMin( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
        {
            int[] input1 = { Integer.MAX_VALUE };
            int expected = Integer.MAX_VALUE,
                actual = CS1.ArrayQuestions.getArrayMin( input1 );
        
            if ( expected != actual ) {
                throw new Exception( String.format(
                    "Test failed: for the array %s the result should be %d but"
                    +
                    " was %d.", 
                    Arrays.toString( input1 ), expected, actual ) );
            }
        }
    }
}

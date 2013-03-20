
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import framework.Grader;
import framework.Grader.IncorrectAnswer;
import CS2.HeapSortQuestions;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Josh Gillham
 * @version 3-18-13
 */
public class GradeHeapQuestions extends Grader {
    static public void main( String[] args ) {
        int score = grade();
        System.out.printf( "You got %d out of %d.\n", score, possiblePoints );
    }
    static public int grade() {
        int result = 0;
        possiblePoints = 0;
        try {
            ++possiblePoints;
            test_shiftDown();
            ++result;
            System.out.println( "test_shiftDown successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        return result;
    }
        
    static public void test_shiftDown() throws IncorrectAnswer {
        PrintStream sysDefault = System.out;
        try {
            int[][] inputs1 = {
                { 6,  5, 4,  1, 9, 3, 15 }
                ,
                { 6,  7, 4,  1, 9, 3, 15,  11, 12, 13, 14 }
                ,
                { 6,  7 }
                ,
                { 6 }
                ,
                { 6,  7, 4,  1, }
            };
            int[] inputs2 = {
                0, 0, 0, 0, 0
            };
            int[] inputs3 = {
                6, 10, 1, 0, 3
            };
            int[][] expects = {
                { 6,  5, 4,  1, 9, 3, 15 }
                ,
                { 7,  9, 4,  1, 14, 3, 15,  11, 12, 13, 6 }
                ,
                { 7, 6 }
                ,
                { 6 }
                ,
                { 7,  6, 4,  1 }
            };
            if ( inputs1.length != expects.length
             || inputs2.length != expects.length ) {
                throw new UnsupportedOperationException( 
                    "Inputs not the same size as expects." );
            }
            for ( int a = 0; a < inputs1.length; ++a ) {
                int[] input = inputs1[a];
                int[] expected = expects[a];
                if ( input.length !=  expected.length ) {
                    throw new UnsupportedOperationException( 
                        "Input not the same size as expect." );
                }
                int[] actual = Arrays.copyOf( input, input.length );
                int last = actual.length - 1;
                CS2.HeapSortQuestions.shiftDown( 
                    actual, inputs2[a], inputs3[a] );
                for ( int i = 0; i < actual.length; ++i ) {
                    if ( actual[i] != expected[i] ) {
                        throw new IncorrectAnswer( String.format( 
                            "Bad answer: for the array %s, the should be %s but"
                            +
                            " was %s.",
                            Arrays.toString( input ),
                            Arrays.toString( expected ),
                            Arrays.toString( actual ) ) );
                    }
                }
            }
        }
        finally {
            System.setOut( sysDefault );
        }
    }    
}

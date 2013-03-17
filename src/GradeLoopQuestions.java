

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author jgillham
 */
public class GradeLoopQuestions {
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
            test_outputCount101();
            ++result;
            System.out.println( "test_outputCount101 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        return result;
    }
        
    static public void test_outputCount101() throws Exception {
        PrintStream sysDefault = System.out;
        try {
            {
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                System.setOut( new PrintStream( result ) );
                
                CS1.LoopQuestions.outputCount101( 1 );
                String actual = result.toString("UTF8");

                if ( !actual.equals( "1\r\n" ) &&
                        !actual.equals( "1\n" ) ) {
                    throw new Exception( "Bad answer: for n = 1 yours was \"" + 
                        actual + "\"" );
                }
            }
            {
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                System.setOut( new PrintStream( result ) );
                
                CS1.LoopQuestions.outputCount101( 5 );
                String actual = result.toString("UTF8");

                if ( !actual.equals( "1\r\n2\r\n3\r\n4\r\n5\r\n" ) &&
                        !actual.equals( "1\n2\n3\n4\n5\n" ) ) {
                    throw new Exception( "Bad answer: for n = 5 yours was \"" + 
                        actual + "\"" );
                }
            }
            {
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                System.setOut( new PrintStream( result ) );
                
                CS1.LoopQuestions.outputCount101( 7 );
                String actual = result.toString("UTF8");

                if ( !actual.equals( "1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n" ) &&
                        !actual.equals( "1\n2\n3\n4\n5\n6\n7\n" ) ) {
                    throw new Exception( "Bad answer: for n = 7 yours was \"" + 
                        actual + "\"" );
                }
            }
            
        }
        finally {
            System.setOut( sysDefault );
        }
    }    
}

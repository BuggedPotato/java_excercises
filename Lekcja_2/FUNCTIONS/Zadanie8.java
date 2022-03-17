package FUNCTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Zadanie8 {
    public static void main( String[] args )
    {
        ArrayList<Integer> foo = new ArrayList<>(
                Arrays.asList(
                        1, 5, 2, 4, 4, 22, 14, 1, 32, 43, 55, 22, 52, 55
                )
        );
        System.out.println( removeDuplicates( foo ) );
    }

    public static ArrayList<Integer> removeDuplicates( ArrayList<Integer> input )
    {
        Collections.sort( input );
        for( int i = 0; i < input.size()-1; i++ )
        {
            if( input.get( i ) == input.get( i + 1 ) )
            {
                input.remove( i );
                i--;
            }
        }
        return input;
    }
}

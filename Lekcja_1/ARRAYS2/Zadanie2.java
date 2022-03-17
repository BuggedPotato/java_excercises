package ARRAYS2;

import java.util.Arrays;

public class Zadanie2 {
    public static void main( String[] args )
    {
        int[][] t2 = new int[10][10];
        int sum = 0;

        for( int y = 0; y < t2.length; y++ )
        {
            for( int x = 0; x < t2[y].length; x++ )
            {
                if( x == y )
                {
                    t2[y][x] = y;
                    sum += t2[y][x];
                }
                else
                    t2[x][y] = 0;
            }
        }
//        System.out.println( Arrays.deepToString( t2 ) );
        printArrays( t2 );
        System.out.println( sum );

    }

    public static void printArrays( int[][] arr )
    {
        for( int[] row : arr )
        {
            for( int n : row )
            {
                System.out.print( n + " " );
            }
            System.out.println();
        }
    }
}

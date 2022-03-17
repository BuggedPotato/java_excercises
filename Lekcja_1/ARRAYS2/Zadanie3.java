package ARRAYS2;

import java.util.Arrays;

public class Zadanie3 {
    public static void main( String[] args )
    {
        int[][] t3 = new int[10][10];
        int sum = 0;

        for( int y = 0; y < t3.length; y++ )
        {
            for( int x = t3[y].length-1; x >= 0 ; x-- )
            {
                if( x + y == 9 )
                {
                    t3[y][x] = 1;
                    sum += t3[y][x];
                }
                else
                    t3[x][y] = 0;
            }
        }
//        System.out.println( Arrays.deepToString( t2 ) );
        printArrays( t3 );
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

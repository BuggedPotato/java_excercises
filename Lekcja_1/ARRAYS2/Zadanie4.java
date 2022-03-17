package ARRAYS2;

import java.util.Arrays;

public class Zadanie4 {
    public static void main( String[] args )
    {
        int[][] t4 = new int[10][10];
        int sum = 0;

        for( int y = 0; y < t4.length; y++ )
        {
            for( int x = t4[y].length-1; x >= 0 ; x-- )
            {
                if( x + y == 9 )
                {
                    t4[y][x] = y;
                    sum += t4[y][x];
                }
                else
                    t4[x][y] = 0;
            }
        }
//        System.out.println( Arrays.deepToString( t2 ) );
        printArrays( t4 );
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

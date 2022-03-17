package ARRAYS2;

import java.util.Arrays;

public class Zadanie6 {
    public static void main( String[] args )
    {
        int[] foo = new int[10];
        int[][] ta = new int[10][10];
        int[][] tb = new int[10][10];

        Arrays.setAll( foo, i -> i );
        Arrays.fill( ta, foo );

        for( int y = 0; y < ta.length; y++ )
        {
            for( int x = 0; x < ta[y].length; x++ )
            {
                tb[x][y] = ta[y][x];
            }
        }

        printArrays( ta );
        System.out.println();
        printArrays( tb );
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

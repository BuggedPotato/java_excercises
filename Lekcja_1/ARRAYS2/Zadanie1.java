package ARRAYS2;

import java.util.Arrays;

public class Zadanie1 {
    public static void main( String[] args )
    {
        int[][] t1 = new int[10][10];
        int sum = 0;

        for( int y = 0; y < t1.length; y++ )
        {
            for( int x = 0; x < t1[y].length; x++ )
            {
                if( x == y )
                {
                    t1[y][x] = 1;
                    sum += t1[y][x];
                }
                else
                    t1[x][y] = 0;
            }
        }
        System.out.println( Arrays.deepToString( t1 ) );
        System.out.println( sum );
    }
}

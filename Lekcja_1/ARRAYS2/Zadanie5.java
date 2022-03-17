package ARRAYS2;

public class Zadanie5 {
    public static void main( String[] args )
    {
        int[][] t5 = new int[10][10];

        for( int y = 0; y < t5.length; y++ )
        {
            for( int x = 0; x < t5[y].length; x++ )
            {
                if( x < 2 )
                {
                    t5[y][x] = (int)Math.pow( y, x+1 );
                }
                else
                    t5[y][x] = 0;
            }
        }

        int sumOne = 0, sumTwo = 0;
        for( int y = 0; y < t5.length; y++ )
        {
            sumOne += t5[y][0];
        }
        for( int y = 0; y < t5.length; y++ )
        {
            sumTwo += t5[y][1];
        }

        printArrays( t5 );
        System.out.println( sumOne );
        System.out.println( sumTwo );
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

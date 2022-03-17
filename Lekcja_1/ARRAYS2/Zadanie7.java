package ARRAYS2;

public class Zadanie7 {
    public static void main( String[] args )
    {
        int[][] snail = new int[10][10];
        int columnEnd = snail.length;
        int rowEnd = snail[0].length;
        int columnStart = 0, rowStart = 0;
        int n = 0;

        int deltaX = 1;
        int deltaY = 1;
        String direction = "right";

        while( n < snail.length * snail[0].length )
        {
            for( int y = rowStart; y < rowEnd; y += deltaY )
            {
                switch( direction )
                {
                    case "right":
                        deltaX = 1;
                        deltaY = 0;
                        break;
                    case "left":
                        deltaX = -1;
                        deltaY = 0;
                        break;
                }
                for( int x = columnStart; x < columnEnd; x += deltaX )
                {

                }
            }
        }

        printArrays( snail );
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

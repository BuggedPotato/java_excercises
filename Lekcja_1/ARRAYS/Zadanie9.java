package ARRAYS;

public class Zadanie9 {
    public static void main( String[] args )
    {
        int[][] arr = new int[][] {
                { 0, 1, 0, 1 },
                { 0, 1, 0, 2 },
                { 0, 2, 0, 2 },
                { 0, 1, 0, 2 },
                { 0, 1, 0, 1 },
                { 0, 1, 0, 2 },
                { 0, 2, 0, 2 },
                { 0, 1, 0, 2 }
        };

        int twos = 0;
        int notOnes = arr.length;
        for( int[] array : arr )
        {
            boolean containsTwo = false;
            boolean containsOne = false;
            for( int n : array )
            {
                if( n == 2 )
                {
                    containsTwo = true;
                }
                else if( n == 1 )
                {
                    containsOne = true;
                }
            }
            if( containsTwo )
                twos++;
            if( containsOne )
                notOnes--;
        }
        System.out.println( twos );
        System.out.println( notOnes );
    }
}

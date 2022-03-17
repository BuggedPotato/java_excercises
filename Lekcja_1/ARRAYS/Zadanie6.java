package ARRAYS;

public class Zadanie6 {
    public static void main( String[] args )
    {
        String[][] arr = new String[][] {
                { "100", "222" },
                { "3333", "44" },
                { "555", "6" },
                { "7", "888" }
        };
        int sum = 0;

        for( int y = 0; y < arr.length; y++ )
        {
            for( int x = 0; x < arr[y].length; x++ )
            {
                sum += Integer.parseInt( arr[y][x] );
            }
        }
        System.out.println( sum );
    }
}

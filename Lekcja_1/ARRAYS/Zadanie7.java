package ARRAYS;

public class Zadanie7 {
    public static void main( String[] args )
    {
        String[][] arr = new String[][] {
                { "aaa", "bbb", "ccc" },
                { "ccc", "bbb", "aaa" },
                { "aaa", "bbb", "ccc" },
                { "ddd", "aaa", "aaa" },
                { "aaa", "bbb", "aaa" },
                { "ccc", "bbb", "eee" },
                { "eee", "bbb", "aaa" },
                { "ddd", "bbb", "fff" }
        };

        int sum = 0;
        for( String[] array : arr )
        {
            if( array[1] == "aaa" || array[2] == "aaa" )
            {
                sum++;
            }
        }
        System.out.println( sum );
    }
}

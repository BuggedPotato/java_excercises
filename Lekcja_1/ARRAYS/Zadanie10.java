package ARRAYS;

import java.util.Arrays;

public class Zadanie10 {
    public static void main( String[] args )
    {
        final int[] startArray = new int[]{ 1, 5, 3, 2, 2, 1, 6, 45, 34, 22, 22, 6, 2, 45 };
        int[] newArray = startArray;
        Arrays.sort( newArray );

        for( int i = 0; i < newArray.length-1; i++ )
        {
//            System.out.println( i );
//            System.out.println( Arrays.toString( newArray ) );
            if( newArray[i] == newArray[i+1] )
            {
                int[] replaceArr = new int[ newArray.length-1 ];
                for( int j = 0, k = 0; j < newArray.length; j++ )
                {
                    if( j != i )
                        replaceArr[ k++ ] = newArray[j];
                }
                newArray = replaceArr;
                i--;
            }
//            System.out.println( Arrays.toString( newArray ) );
        }
        System.out.println( Arrays.toString( newArray ) );

    }
}

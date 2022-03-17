package FUNCTIONS;

import java.util.ArrayList;

public class Zadanie7 {
    public static void main( String[] args )
    {
        printTriangle( pascalsTriangle( 11 ) );
    }

    public static ArrayList<ArrayList<Integer>> pascalsTriangle( int rows )
    {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        triangle.add( new ArrayList<>(){ {add(1);} } );
        for( int i = 1; i < rows; i++ )
        {
            triangle.add( triangleRow( triangle.get( i - 1 ) ) );
        }
        return triangle;
    }

    public static ArrayList<Integer> triangleRow( ArrayList<Integer> prevRow )
    {
        ArrayList<Integer> row = new ArrayList<>();
        row.add( 1 );
        for( int i = 1; i < prevRow.size(); i++ )
        {
            row.add( prevRow.get( i - 1 ) + prevRow.get( i ) );
        }
        row.add( 1 );

        return row;
    }

    public static void printTriangle( ArrayList<ArrayList<Integer>> triangle )
    {
        for( ArrayList<Integer> row : triangle )
        {
            for( int i = 0; i < triangle.size()-row.size(); i++ )
            {
                System.out.print( "\t" );
            }
            for( int n : row )
            {
                System.out.print( n + "\t\t" );
            }
            System.out.println();
        }
    }
}

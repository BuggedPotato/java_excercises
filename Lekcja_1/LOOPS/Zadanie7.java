package LOOPS;

public class Zadanie7 {
    public static void main( String[] args )
    {
        char a = 'A';
        for( int i = 0; a + i <= 'Z'; i++ )
        {
            System.out.print( (char)( a + i ) + ", " );
        }
        System.out.println();

        char z = 'Z';
        for( int i = 0; z - i >= 'A'; i++ )
        {
            System.out.print( (char)( z - i ) + ", " );
        }
    }
}

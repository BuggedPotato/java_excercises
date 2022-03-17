package LOOPS;

import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] numbers = new int[5];
        int min = 99, max = 0;
        float sum = 0;

        for( int i = 0; i < numbers.length; i++ )
        {
            int number = rand.nextInt( 100 );
            numbers[i] = number;
            if( number < min )
                min = number;
            else if( number > max )
                max = number;
            sum += number;
        }

        float avg = sum / numbers.length;

        System.out.printf( "Wylosowano liczby: %d, %d, %d, %d, %d\n", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4] );
        System.out.println( "Liczba największa to: " + max );
        System.out.println( "Liczba najmniejsza to: " + min );
        System.out.println( "Średnia wynosi: " + avg );
    }
}

package ARRAYS;

public class Zadanie3 {
    public static void main( String[] args )
    {
        String[] arr = {"koty","psy","owoce","grzyby","samochody","kanarki"};
        int kStartingStrings = 0;
        int longerThanFour = 0;

        for( int i = 0; i < arr.length; i++ )
        {
            if( arr[i].charAt( 0 ) == 'k' )
            {
                System.out.println( arr[i] );
                kStartingStrings++;
            }
            if( arr[i].length() > 4 )
                longerThanFour++;

            if( arr[i].length() > 5 )
                System.out.println( arr[i] );
        }

        System.out.println( kStartingStrings );
        System.out.println( longerThanFour );
    }
}

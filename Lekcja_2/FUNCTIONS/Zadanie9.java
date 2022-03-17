package FUNCTIONS;

import java.util.*;

public class Zadanie9 {
    public static void main( String[] args )
    {
        System.out.println( "Wprowadź szukaną literę:" );
        Scanner sc = new Scanner( System.in );
        char ch = sc.nextLine().toLowerCase( Locale.ROOT ).toCharArray()[ 0 ];

        System.out.println( "Wprowadzaj ciągi znaków. Wpisz \"/koniec\" by zakończyć wprowadzanie." );
        ArrayList<String> words = new ArrayList<>();
        String input = sc.nextLine().toLowerCase( Locale.ROOT );
        while( !input.equals( "/koniec" ) )
        {
            if( !input.equals( "" ) )
                words.add( input );
            input = sc.nextLine().toLowerCase( Locale.ROOT );
        }

        printMap( charInWords( ch, words ) );
    }

    public static HashMap<String, Integer> charInWords( char ch, ArrayList<String> words )
    {
        HashMap<String, Integer> values = new HashMap<>();
        for( String word : words )
        {
            values.put( word, charInWord( ch, word ) );
        }

        return values;
    }

    public static int charInWord( char ch, String word )
    {
        int n = 0;
//        int start = 0;
//        while( word.indexOf( ch, start ) != -1 )
//        {
//            n++;
//            start = word.indexOf( ch, start ) + 1;
//        }
        for( char letter : word.toCharArray() )
        {
            if( letter == ch )
                n++;
        }
        return n;
    }

    public static void printMap( HashMap<String, Integer> map )
    {
        List<String> keys = new ArrayList<>( map.keySet() );
        List<Integer> values = new ArrayList<>( map.values() );

        boolean isSorted = false;
        while( !isSorted )
        {

            isSorted = true;
            for( int i = 0; i < values.size()-1; i++ )
            {
                if( values.get( i ) < values.get( i+1 ) )
                {
                    isSorted = false;
                    int tmp = values.get( i );
                    values.set( i, values.get( i+1 ) );
                    values.set( i+1, tmp );

                    String tmpKey = keys.get( i );
                    keys.set( i, keys.get( i+1 ) );
                    keys.set( i+1, tmpKey );
                }
            }
        }

        int currentValue = -1;
        for( int i = 0; i < values.size(); i++ )
        {
            int value = values.get( i );
            if( value != currentValue )
            {
                currentValue = value;
                System.out.println( "=== Ilość wystąpień: " + currentValue + " ===" );
            }
            System.out.println( "\t- " + keys.get( i ) );
        }
    }
}

package FUNCTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*6. Napisz funkcję, która sprawdza brakujące znaki z alfabetu, w podanym stringu.
Funkcja przyjmuje stringa do analizy i zwraca stringa z brakującymi znakami
przyjmujemy, że cały alfabet to: abcdefghijklmnopqrstuvwxyz
użyj dowolnej/ych kolekcji
*/
public class Zadanie6 {
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        String input = sc.nextLine();
        System.out.println( getMissingLetters( input ) );
    }

    public static String getMissingLetters( String str )
    {
        HashSet<Character> letters = getAlphabetSet();
        for( Character ch : str.toCharArray() )
        {
            letters.remove( ch );
        }

        String missing = "";
        for( Object obj : letters.toArray() )
        {
            missing += obj.toString();
        }
        return missing;
    }

    public static HashSet<Character> getAlphabetSet()
    {
        final String foo = "abcdefghijklmnopqrstuvwxyz";
        HashSet<Character> letters = new HashSet<>();
        for( char letter : foo.toCharArray() )
        {
            letters.add( letter );
        }
        return letters;
    }
}

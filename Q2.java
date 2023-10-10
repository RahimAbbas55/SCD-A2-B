import java.util.ArrayList;
import java.util.HashMap;

class FirstNonRepeatingStream 
{
    private ArrayList<Character> stream;
    private HashMap<Character, Integer> fmap;
    public FirstNonRepeatingStream()
    {
        stream = new ArrayList<>();
        fmap = new HashMap<>();
    }
    public void add( char c )
    {
        stream.add(c);
        update(c);
    }
    public void displayStream()
    {
        for ( int i = 0 ; i < stream.size() ; i++ )
        {
            System.out.print( stream.get(i) + " ");
        }
    }
    public char getFirstNonRepeating()
    {
        char variable = returnChar();
        return variable;
    }


    private void update(char c)
    {
        fmap.put(c, fmap.getOrDefault(c, 0) + 1);
    }
    private char returnChar ()
    {
        char required = '-';
        for ( char c : stream)
        {
            if (fmap.get(c) == 1)
            {
                required = c;
                break;
            }
        }
        return required;
    }
}


public class Q2
{
    public static void main( String [] args )
    {
        FirstNonRepeatingStream streamOfCharacters = new FirstNonRepeatingStream();
        streamOfCharacters.add('a');
        streamOfCharacters.add('b');
        streamOfCharacters.add('R');
        streamOfCharacters.add('w');
        streamOfCharacters.add('L');

        char c = streamOfCharacters.getFirstNonRepeating();
        if ( c == '-')
        {
            System.out.println("There is no non-repeating character.\n");
        }
        else
        {
            System.out.println("First non-repeating character is => " + c + " <=\n");
        }
        System.out.println("Stream of characters is: ");
        streamOfCharacters.displayStream();
        System.out.println();
    }

}
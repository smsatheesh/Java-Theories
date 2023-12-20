import java.util.regex.Pattern;

public class Main {

    public static void main (String[] args) {
    
    	System.out.println( Pattern.matches( "[Ss]" , "Subject") );
    	System.out.println( Pattern.matches( "[Subject]", "s" ) );
    	System.out.println( Pattern.matches( "[^Satheesh]" , "z" ) );
    	System.out.println( Pattern.matches( "[a-zA-z]" , "a" ) );
    	System.out.println( Pattern.matches( "[a-z][A-z]" , "aA" ) );
    	System.out.println( Pattern.matches( "[a-dx-z]" , "r" ) );
    	System.out.println( Pattern.matches( "\\d", "ws" ) );
    	System.out.println( Pattern.matches( "\\s" , " " ) );
    	System.out.println( Pattern.matches( "\\w", "a" ) );
    	System.out.println( Pattern.matches( "\\W", "+" ) );
    	System.out.println( Pattern.matches( "[a-z && [^a-d]]" , "t"  ) );
    }
}

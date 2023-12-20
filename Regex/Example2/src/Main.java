import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main (String[] args) {
    
    	Pattern p = Pattern.compile( "[0-9]" );
    	Matcher m = p.matcher( "0123456789" );
    	
    	while( m.find() ) {
    		
        	System.out.println( m.start() + "...." + m.group() );
    	}
    }
}
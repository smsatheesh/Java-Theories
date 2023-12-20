import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main (String[] args) {
    
    	String str = "satheesh";
    	System.out.println( str.replaceAll( "[S|s]atheesh", "Harish" ) );
    	
    	String tvk = "tstvtkt";
    	String strNot = "t(?!v)";
    	Pattern pt = Pattern.compile( strNot );
    	Matcher mt = pt.matcher( tvk );
    	
    	int count = 0;
    	while( mt.find() ) {
    	
    		++count;
    		System.out.println( "Occurances : " + count + " : " + mt.start() + " to " + mt.end() );
    	}
    }
}
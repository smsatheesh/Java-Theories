import java.util.*;

public class Main {

    public static void main (String[] args) {
    
    	String str = "My name is Satheesh";
    	String strPattern = ".*Sat.*";
    	
//    	boolean isMatch = Pattern.matches( strPattern, str );
//    	System.out.println( isMatch );
    	
    	Pattern pt = Pattern.compile( strPattern, Pattern.CASE_INSENSITIVE );
    	Matcher mt = pt.matcher( str );
    	
    	while( mt.find() )
    		System.out.println( mt.start() + " ..... " + mt.group() );
    	boolean isMatch = mt.matches();
    	System.out.println( isMatch );
    }
}
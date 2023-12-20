import java.util.*;

public class Main {
	
    public static void main (String[] args) {
    
    	List obj1 = Arrays.asList( 1, 2, 3 );
    	List obj2 = Arrays.asList( 4, 5, 6 );
    	List obj3 = Arrays.asList( 7, 8, 9 );
    	
    	List allLists = Arrays.asList( obj1, obj2, obj3 );
    	
    	List sInt = (List) allLists.stream()
    						.flatMap( (x) -> ((List) x).stream() )
    							.collect( Collectors.toList() );
    	System.out.println( sInt );
    }
}
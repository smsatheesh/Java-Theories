import java.util.*;

public class Main {
	
	public static void main( String[] args ) {
		
		// Intialization of empty hashMap
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		// Inserting entrySet ( key, value pair ) to the map 
		map.put( 1, 10 );
		map.put( 3, 30 );
		map.put( 4, 40 );
		map.put( 5, 50 );
		map.put( 2, 20 );
		
		// Checking key is present or contains in the map
		System.out.println( "If, key 2 is present in the map? " + map.containsKey( 2 ) );
		
		// Checking value is present or contains in the map
		System.out.println( "If, value 40 is present in the map? " + map.containsValue( 40 ) );
		
		// Getting sepcific value using key
		System.out.println( "Specific value of an key 3 -> " + map.get( 3 ) );
		
		// Hashcode value of an entire map
		System.out.println( "Hash value of the entire map -> " + map.hashCode() );
		
		if( map.remove( 4, 40 ) ) 
			System.out.println( "Removed successfully key 4 and it's value 40 " );
		else
			System.out.println( "Not present in the list, key 4 and it's value 40" );
		
		// getting or return default value
		System.out.println( "Checking key 4 present, if yes value will be 40 or returning default value -> " + map.getOrDefault( 4, 1000 ) );
		
		// Checking the key before insertion
		map.putIfAbsent( 6 , 60 );
		System.out.println( "Checking key 6 presents, if so skipping insertion or else will be inserted with value -> " + map );
		
		// Traversing through Map using for-each loop
		System.out.print( "Prinitng the map : " );
		for( Map.Entry<Integer, Integer> me : map.entrySet() )
			System.out.print( me.getKey() + "=> " + me.getValue() + ", " );
		
		// Printing the map using entrySet()
		System.out.print( "\nEntire map using entrySet() -> " + map.entrySet() );
		
		// Clearing the entire Map
		System.out.print( "\nClearing elements and printing the Map => " );
		map.clear();
		System.out.println( map );
		
		// Checking whether value is empty
		System.out.println( "Check the set if it's empty? " + map.isEmpty() );
	}
}
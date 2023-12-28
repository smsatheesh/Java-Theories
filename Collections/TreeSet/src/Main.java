import java.util.*;

public class Main {
	
	public static void main( String[] args ) {
		
		SortedSet<String> set = new TreeSet<String>();
		
		// Inserting elements in Set
		set.add( "Nature" );
		set.add( "Rainbow" );
		set.add( "Sky" );
		set.add( "Sun" );
		set.add( "Moon" );
		set.add( "Asteroids" ); 
		
		// Printing the set elements
		System.out.print( "Set elements after insertion are : " );
		Iterator itr = set.iterator();
		while( itr.hasNext() )
			System.out.print( itr.next() + ", " );
		
		// Printing the size of the set
		System.out.print( "\nSize of the set is " + set.size() );
		
		// Checking elements present in Set
		System.out.println( "\nIf, set contains an element, Sky? " + set.contains( "Sky" ) );
		
		// get first or lowest element in the Set
		System.out.println( "First (or) lowest element in the set -> " + set.first() );
		
		// get last element in the set
		System.out.println( "Last element in the set -> " + set.last() );
		
		// print hascode of specific element
		System.out.println( "Hash code value of the entire set -> " + set.hashCode() );
		
		// get element lesser than the inputed value
		System.out.println( "Getting elements lesser than 'Nature' are -> " + set.headSet( "Nature" ) );
		
		// get element greater than the inputed value
		System.out.println( "Getting elements greater than 'Nature' are -> " + set.tailSet( "Nature" ) );
		
		// Removing particular element
		System.out.println( "Removing 'Asteroids' from the set elements " + ( set.remove( "Asteroids" )? "and removed successfully": "element not pressent" ) );
		System.out.println( "Remaining set after removal of 'Asteroids' from the set " + set );
		
		String[] array = new String[ set.size() ];
		System.arraycopy( set.toArray(), 0, array, 0, set.size() );
		System.out.println( "Array elements are " + Arrays.toString( array ) );
		
		// Clearing all set elements
		System.out.print( "Clearing all set elements and its remaining is -> " );
		set.clear();
		System.out.print( set + " \n" );
		
		// Checking whether set is an empty state
		System.out.println( "Checking the set whether is it empty? " + set.isEmpty() );
	}
}
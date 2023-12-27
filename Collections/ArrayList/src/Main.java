import java.util.*;

public class Main {

    public static void main (String[] args) {
    	
    	List<Integer> arrList = new ArrayList<Integer>();
    	
    	// Inserting Elements
    	arrList.add( 10 );
    	arrList.add( 20 );
    	arrList.add( 30 );
    	arrList.add( 40 );
    	
    	// Inserting Elements At Specific Index
    	arrList.add( 4, 50 );
    	
    	// Printing Elements Using Iterator
    	System.out.print( "Printing ArrayList Elements :: " );
    	Iterator itr = arrList.iterator();
    	while( itr.hasNext() )
    		System.out.print( itr.next() + " " );
    	
    	// Sorting list DESC
    	Collections.sort( arrList, Collections.reverseOrder() );
    	System.out.println( "\nAfter Sorting in DESC :: " + arrList );
    	
    	// Sorting list ASC
    	Collections.sort( arrList );
    	System.out.println( "After Sorting in ASC  :: " + arrList );
    	
    	// Checks Elements of Object Present and return results in boolean
    	System.out.println( "If, Arraylist contains element 20? " + arrList.contains( 20 ) );
    	
    	// for-Each Printing arrayList elements
    	System.out.print( "Printing Array elements using forEach() " );
    	arrList.forEach( (element) -> System.out.print( element + " " ) );
    	
    	// indexOf() search method
    	System.out.println( "\nArray List indexOf() search method" );
    	System.out.print( "If, 30 present in List? " + ((arrList.indexOf( 30 ) > -1) ? " -> Present at index " + (arrList.indexOf( 30 ) + 1): " Not Present") );
    	
    	System.out.print( "\nLast index of element 30, is " + arrList.lastIndexOf( 30 ) );
    	
    	System.out.print( "\nRemoving element 50, " + arrList.remove( Integer.valueOf( 50 ) ) + " and the remaining list is -> " + arrList );
    	
    	// ArrayList to Array of Wrapper class conversion
    	Integer[] array = new Integer[ arrList.size() ];
    	array = arrList.toArray( array );
    	System.out.println( "\nArray conversion -> " + Arrays.toString( array ) );
    	
    	// Collection binary search
    	System.out.println( "Binary search of element 30 and it's result is -> " + (Collections.binarySearch( arrList, 30 ) + 1) );
    	
    	// clear all arrayList elements
    	System.out.print( "Clearing all list elements and final list is -> " );
    	arrList.clear();
    	System.out.print( arrList );
    	
    	// Checking whether list holds any elements
    	System.out.println( "\nChecking the list, whether is it empty? " + arrList.isEmpty() );
    }
}

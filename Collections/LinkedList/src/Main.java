import java.util.*;

public class Main {

    public static void main (String[] args) {
    	
    	LinkedList<Integer> arrLinkedList = new LinkedList<Integer>();
    	
    	// Inserting Elements
    	arrLinkedList.add( 20 );
    	arrLinkedList.addFirst( 10 );
    	arrLinkedList.addLast( 30 );
    	arrLinkedList.addLast( 40 );
    	
    	// Inserting Elements At Specific Index
    	arrLinkedList.add( 4, 50 );
    	
    	// Printing Elements Using Iterator
    	System.out.print( "Printing ArrayList Elements in Ascending :: " );
    	Iterator itr = arrLinkedList.iterator();
    	while( itr.hasNext() )
    		System.out.print( itr.next() + " " );
    	
    	System.out.print( "\nPrinting ArrayList Elements in Descending :: " );
    	Iterator itrDesc = arrLinkedList.descendingIterator();
    	while( itrDesc.hasNext() )
    		System.out.print( itrDesc.next() + " " );
    	
    	// Get head of the list
    	System.out.print( "\nHead of the list -> " + arrLinkedList.element() );
    	
    	// Get methods for elements in the list
    	System.out.println( "\nGet method head of the list " + arrLinkedList.getFirst() );
    	System.out.print( "Get method tail of the list " + arrLinkedList.getLast() );
    	
    	// Sorting list DESC
    	Collections.sort( arrLinkedList, Collections.reverseOrder() );
    	System.out.println( "\nAfter Sorting in DESC :: " + arrLinkedList );
    	
    	// Sorting list ASC
    	Collections.sort( arrLinkedList );
    	System.out.println( "After Sorting in ASC  :: " + arrLinkedList );
    	
    	// Checks Elements of Object Present and return results in boolean
    	System.out.println( "If, Arraylist contains element 20? " + arrLinkedList.contains( 20 ) );
    	
    	// for-Each Printing arrayList elements
    	System.out.print( "Printing Array elements using forEach() " );
    	arrLinkedList.forEach( (element) -> System.out.print( element + " " ) );
    	
    	// indexOf() search method
    	System.out.println( "\nArray List indexOf() search method" );
    	System.out.print( "If, 30 present in List? " + ((arrLinkedList.indexOf( 30 ) > -1) ? " -> Present at index " + (arrLinkedList.indexOf( 30 ) + 1): " Not Present") );
    	
    	System.out.print( "\nLast index of element 30, is " + arrLinkedList.lastIndexOf( 30 ) );
    	
    	System.out.print( "\nRemoving element 50, " + arrLinkedList.remove( Integer.valueOf( 50 ) ) + " and the remaining list is -> " + arrLinkedList );
    	
    	// ArrayList to Array of Wrapper class conversion
    	Integer[] array = new Integer[ arrLinkedList.size() ];
    	array = arrLinkedList.toArray( array );
    	System.out.println( "\nArray conversion -> " + Arrays.toString( array ) );
    	
    	// Collection binary search
    	System.out.println( "Binary search of element 30 and it's result is -> " + (Collections.binarySearch( arrLinkedList, 30 ) + 1) );
    	
    	// MAX value in collections
    	System.out.println( "Max value in array list : " + Collections.max( arrLinkedList ) );
    	
    	// MIN value in collections
    	System.out.println( "Min value in array list : " + Collections.min( arrLinkedList ) );
    	
    	// Creating sub list of main list
    	List<Integer> sub_List = new ArrayList<Integer>();
    	sub_List = arrLinkedList.subList( 1, arrLinkedList.size() );
    	
    	System.out.println( "Sub-List of main list is -> " + sub_List );
    	
    	// clear all arrayList elements
    	System.out.print( "Clearing all list elements and final list is -> " );
    	arrLinkedList.clear();
    	System.out.print( arrLinkedList );
    	
    	// Checking whether list holds any elements
    	System.out.println( "\nChecking the list, whether is it empty? " + arrLinkedList.isEmpty() );
    }
}
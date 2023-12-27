import java.util.*;

public class Main {

    public static void main (String[] args) {
    	
    	Vector<Integer> arrVector = new Vector<Integer>();
    	
    	// Inserting Elements
    	arrVector.add( 10 );
    	arrVector.addElement( 20 );
    	arrVector.addElement( 30 );
    	arrVector.addElement( 40 );
    	
    	// Inserting Elements At Specific Index
    	arrVector.add( 4, 50 );
    	
    	// Printing the capcity of the vector
    	System.out.print( "Capacity of the current vector is : " + arrVector.capacity() );
    	
    	// Printing Elements Using Iterator
    	System.out.print( "\nPrinting Vector Elements :: " );
    	Iterator itr = arrVector.iterator();
    	while( itr.hasNext() )
    		System.out.print( itr.next() + " " );
    	
    	// Sorting list DESC
    	Collections.sort( arrVector, Collections.reverseOrder() );
    	System.out.println( "\nAfter Sorting in DESC :: " + arrVector );
    	
    	// Sorting list ASC
    	Collections.sort( arrVector );
    	System.out.println( "After Sorting in ASC  :: " + arrVector );
    	
    	// Checks Elements of Object Present and return results in boolean
    	System.out.println( "If, Arraylist contains element 20? " + arrVector.contains( 20 ) );
    	
    	// for-Each Printing arrayList elements
    	System.out.print( "Printing Array elements using forEach() " );
    	arrVector.forEach( (element) -> System.out.print( element + " " ) );
    	
    	// indexOf() search method
    	System.out.println( "\nArray List indexOf() search method" );
    	System.out.print( "If, 30 present in List? " + ((arrVector.indexOf( 30 ) > -1) ? " -> Present at index " + (arrVector.indexOf( 30 ) + 1): " Not Present") );
    	
    	System.out.print( "\nLast index of element 30, is " + arrVector.lastIndexOf( 30 ) );
    	
    	System.out.print( "\nRemoving element 50, " + arrVector.remove( Integer.valueOf( 50 ) ) + " and the remaining list is -> " + arrVector );
    	
    	// Vector to Array of Wrapper class conversion
    	Integer[] array = new Integer[ arrVector.size() ];
    	array = arrVector.toArray( array );
    	System.out.println( "\nArray conversion -> " + Arrays.toString( array ) );
    	
    	// Vector to Array of Wrapper class conversion
    	Integer[] arrayInit = new Integer[ arrVector.size() ];
    	arrVector.copyInto( arrayInit );
    	System.out.println( "Array conversion using in-built method of vector -> " + Arrays.toString( arrayInit ) );
    	
    	// Enum values from vector
    	Enumeration enumUserDefinedVar = arrVector.elements();
    	System.out.print( "Enumeration values are : " );
    	while( enumUserDefinedVar.hasMoreElements() )
    		System.out.print( enumUserDefinedVar.nextElement() + " " );
    	
    	// inserting element at specific index
    	arrVector.insertElementAt( 50, 4 );
    	System.out.print( "After inserting at vector in a position -> " + arrVector );
    	
    	// Collection binary search
    	System.out.println( "\nBinary search of element 30 and it's result is -> " + (Collections.binarySearch( arrVector, 30 ) + 1) );
    	
    	// MAX value in collections
    	System.out.println( "Max value in array list : " + Collections.max( arrVector ) );
    	
    	// MIN value in collections
    	System.out.println( "Min value in array list : " + Collections.min( arrVector ) );
    	
    	// Creating sub list of main list
    	List<Integer> sub_List = new Vector<Integer>();
    	sub_List = arrVector.subList( 1, arrVector.size() );
    	
    	System.out.println( "Sub-List of main list is -> " + sub_List );
    	
    	// clear all arrayList elements
    	System.out.print( "Clearing all list elements and final list is -> " );
    	arrVector.clear();
    	System.out.print( arrVector );
    	
    	// Checking whether list holds any elements
    	System.out.println( "\nChecking the list, whether is it empty? " + arrVector.isEmpty() );
    }
}
public class Main {

	public static void main (String[] args) {
    	
		Vector<Integer> stack = new Stack<Integer>();
    	
    	// Inserting Elements
    	stack.add( 10 );
    	stack.addElement( 20 );
    	stack.addElement( 30 );
    	stack.addElement( 40 );
    	
    	// Inserting Elements At Specific Index
    	stack.add( 4, 50 );
    	
    	// Printing the capcity of the vector
    	System.out.print( "Capacity of the current vector is : " + stack.capacity() );
    	
    	// Printing Elements Using Iterator
    	System.out.print( "\nPrinting Vector Elements :: " );
    	Iterator itr = stack.iterator();
    	while( itr.hasNext() )
    		System.out.print( itr.next() + " " );
    	
    	// Sorting list DESC
    	Collections.sort( stack, Collections.reverseOrder() );
    	System.out.println( "\nAfter Sorting in DESC :: " + stack );
    	
    	// Sorting list ASC
    	Collections.sort( stack );
    	System.out.println( "After Sorting in ASC  :: " + stack );
    	
    	// Checks Elements of Object Present and return results in boolean
    	System.out.println( "If, Arraylist contains element 20? " + stack.contains( 20 ) );
    	
    	// for-Each Printing arrayList elements
    	System.out.print( "Printing Array elements using forEach() " );
    	stack.forEach( (element) -> System.out.print( element + " " ) );
    	
    	// indexOf() search method
    	System.out.println( "\nArray List indexOf() search method" );
    	System.out.print( "If, 30 present in List? " + ((stack.indexOf( 30 ) > -1) ? " -> Present at index " + (stack.indexOf( 30 ) + 1): " Not Present") );
    	
    	System.out.print( "\nLast index of element 30, is " + stack.lastIndexOf( 30 ) );
    	
    	System.out.print( "\nRemoving element 50, " + stack.remove( Integer.valueOf( 50 ) ) + " and the remaining list is -> " + stack );
    	
    	// Vector to Array of Wrapper class conversion
    	Integer[] array = new Integer[ stack.size() ];
    	array = stack.toArray( array );
    	System.out.println( "\nArray conversion -> " + Arrays.toString( array ) );
    	
    	// Vector to Array of Wrapper class conversion
    	Integer[] arrayInit = new Integer[ stack.size() ];
    	stack.copyInto( arrayInit );
    	System.out.println( "Array conversion using in-built method of vector -> " + Arrays.toString( arrayInit ) );
    	
    	// Enum values from vector
    	Enumeration enumUserDefinedVar = stack.elements();
    	System.out.print( "Enumeration values are : " );
    	while( enumUserDefinedVar.hasMoreElements() )
    		System.out.print( enumUserDefinedVar.nextElement() + " " );
    	
    	// inserting element at specific index
    	stack.insertElementAt( 50, 4 );
    	System.out.print( "After inserting at vector in a position -> " + stack );
    	
    	// Collection binary search
    	System.out.println( "\nBinary search of element 30 and it's result is -> " + (Collections.binarySearch( stack, 30 ) + 1) );
    	
    	// MAX value in collections
    	System.out.println( "Max value in array list : " + Collections.max( stack ) );
    	
    	// MIN value in collections
    	System.out.println( "Min value in array list : " + Collections.min( stack ) );
    	
    	// Creating sub list of main list
    	List<Integer> sub_List = new Vector<Integer>();
    	sub_List = stack.subList( 1, stack.size() );
    	
    	System.out.println( "Sub-List of main list is -> " + sub_List );
    	
    	// clear all arrayList elements
    	System.out.print( "Clearing all list elements and final list is -> " );
    	stack.clear();
    	System.out.print( stack );
    	
    	// Checking whether list holds any elements
    	System.out.println( "\nChecking the list, whether is it empty? " + stack.isEmpty() );
    }
}
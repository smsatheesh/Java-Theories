import java.util.*;

public class Main {

	public static void main (String[] args) {
    	
		Deque<Integer> deque = new ArrayDeque<Integer>();
    	
    	// Inserting elements
    	deque.add( 20 );
    	deque.addFirst( 10 );
    	deque.offer( 30 );
    	deque.add( 40 );
    	deque.addLast( 50 );
    	
    	// Printing elements
    	Iterator queueItr = deque.iterator();
    	while( queueItr.hasNext() )
    		System.out.print( queueItr.next() + " " );
    	
    	// Returning size of the deque
    	System.out.println( "\nSize of the deque " + deque.size() );
    	
    	// Accessing elements at first
    	System.out.println( "Element present at peek / first : " + deque.peek() );
    	
    	// Printing elements
    	System.out.println( "Elements after updation -> " + deque );
    	
    	// Checking elements present
    	System.out.println( "Element 90 is present in deque? " + deque.contains( 90 ) );
    	
    	// removing peek element
    	System.out.println( "Peek element is : " + deque.peek() );
    	
    	// Printing after removal of peek element
    	System.out.println( "After removal of peek element " + deque );
    	
    	// remvoing first element
    	System.out.println( "Removing first element in queue -> " + deque.removeFirst() );
    	
    	// removing last element
    	System.out.println( "Removing last element in queue -> " + deque.removeLast() );
    	
    	// print eleement after removal at either end
    	System.out.println( "Queue after removal of either end -> " + deque );
    	
    	// Clearing all elements
    	System.out.println( "Removing all deque elements -> ");
    	deque.clear();
    	
    	// Checking deque is empty
    	System.out.println( "Checking if deque is empty? " + deque.isEmpty() );
    }
}
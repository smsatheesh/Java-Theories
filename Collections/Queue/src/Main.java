import java.util.*;

public class Main {

    public static void main (String[] args) {
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	// Inserting elements
    	queue.add( 10 );
    	queue.offer( 20 );
    	queue.offer( 30 );
    	queue.offer( 40 );
    	queue.offer( 50 );
    	
    	// Printing elements
    	Iterator queueItr = queue.iterator();
    	while( queueItr.hasNext() )
    		System.out.print( queueItr.next() + " " );
    	
    	// Returning size of the queue
    	System.out.println( "\nSize of the queue " + queue.size() );
    	
    	// Accessing elements at first
    	System.out.println( "Element present at peek / first : " + queue.peek() );
    	
    	// Updating elements in queue
    	System.out.println( "Element update at index 2 " + ((LinkedList<Integer>) queue).set( 2, 90 ) );
    	
    	// Printing elements
    	System.out.println( "Elements after updation -> " + queue );
    	
    	// Checking elements present
    	System.out.println( "Element 90 is present in queue? " + queue.contains( 90 ) );
    	
    	// removing peek element
    	System.out.println( "Peek element is : " + queue.peek() );
    	
    	// Printing after removal of peek element
    	System.out.println( "After removal of peek element " + queue );
    	
    	// Clearing all elements
    	System.out.println( "Removing all queue elements -> ");
    	queue.clear();
    	
    	// Checking queue is empty
    	System.out.println( "Checking if queue is empty? " + queue.isEmpty() );
    }
}
public class Main {

    public static void main (String[] args) {
    
    	Add addition = new Add();
    	
    	AddCount thread1 = new AddCount( addition );
    	thread1.setName( "Thread 1" );
    	
    	AddCount thread2 = new AddCount( addition );
    	thread2.setName( "Thread 2" );
    	
    	AddCount thread3 = new AddCount( addition );
    	thread3.setName( "Thread 3" );
    	
    	// Starts the thread
    	thread1.start();
    	thread2.start();
    	thread3.start();
    }
}
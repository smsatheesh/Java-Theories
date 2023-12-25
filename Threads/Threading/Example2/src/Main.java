public class Main {

    public static void main (String[] args) {
    
    	System.out.println( "This is a main thread" );
    	
    	Thread thread1 = new FirstSubThread();
    	thread1.setName( "Sub-Thread -> 1" );
    	thread1.setPriority( 10 );
    	
    	Runnable objForRunnable = new SecondSubThread();
    	Thread thread2 = new Thread( objForRunnable );
    	
    	thread1.start();
       	thread2.start();
    	System.out.println( "New main method" );
    }
}
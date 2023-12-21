public class Main {

    public static void main (String[] args) {
    
    	System.out.println( "This is a main thread" );
    	
    	Runnable objForRunnable = new PrimarySubThread();
    	Thread thread1 = new Thread( objForRunnable );
    	thread1.setName( "Sub-Thread -> 1" );
    	
       	thread1.start();
    	thread1.interrupt();
    	
    	new Thread() {
    		
    		public void run() {
    			
    			try {
    				
    				System.out.println( "New thread " );
    				thread1.join( 5000 );
    			} catch( InterruptedException e ) {
    				
    				System.out.println( "Exception occurs " );
    			} finally {
    				
    				System.out.println( "Anonymous thread completed" );
    			}
    		}
    	}.start();
    	
    	System.out.println( "New main method" );
    }
}
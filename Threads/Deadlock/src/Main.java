public class Main {

	static Object l1 = new Object();
	static Object l2 = new Object();
	
	public static class Thread1 extends Thread {
		
		@Override
		public void run() {
			synchronized( l1 ) {
				
				System.out.println( "Thread 1 has a lock 1...." );
				
				try {
					
					Thread.sleep( 2000 );
					
				} catch( InterruptedException e ) {
					
					System.out.println( "Interruption occurs !!" );
					
				} finally {
					
					System.out.println( "Thread 1 waiting for lock 2" );
				}

				synchronized( l2 ) {
					
					System.out.println( "Thread 1 has lock 1 and lock 2" );
				}
			}
			
			System.out.println( "Thread 1 released lock 1" );
			System.out.println( "Exiting ....." );
		}
	}
	
	public static class Thread2 extends Thread {
		
		@Override
		public void run() {
			synchronized( l1 ) {
				
				System.out.println( "Thread 2 has a lock 1" );
				
				try {
					
					Thread.sleep( 1000 );
				
				} catch ( InterruptedException e ) {
					
					System.out.println( "Interruption occurs .... " );
					
				} finally {
					
					System.out.println( "Thread 2 waiting for lock 2" );
				}
				
				synchronized( l2 ) {
					
					System.out.println( "Thread 2 has lock 1 and lock 2" );
					
				}

				System.out.println( "Thread 2 released lock 1" );
				System.out.println( "Exiting ....." );
			}
		}
	}
	
    public static void main (String[] args) {
    
    	new Thread1().start();
    	new Thread2().start();
    }
}
class FirstSubThread extends Thread {
	
	public void run() {
		
		try {
			System.out.println( "First sub thread " + currentThread().getName() );
			Thread.sleep( 5000 );
		} catch ( Exception e ) {
			
			System.out.println( "IOException occurs ..." );
		}
		
		System.out.println( "5 seconds have passed" );
	}
}
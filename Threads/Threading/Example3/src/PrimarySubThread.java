class PrimarySubThread implements Runnable {
	
	@Override
	public void run() {
		
		try {
			
			System.out.println( "This is the Runnable Interface" );
			Thread.sleep( 1000 );
		} catch( InterruptedException e ) {
			
			System.out.println( "Interruption occurs " + Thread.currentThread().getName() + " ...!! " );
		} finally {
			
			System.out.println( "Waited for 1 seconds and resumed" );
		}
	}
}
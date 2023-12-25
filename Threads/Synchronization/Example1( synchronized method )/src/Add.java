class Add {
	
	int i;
	public synchronized void doCountDown() {
		
		String color;
		
		switch( Thread.currentThread().getName() ) {
		
			case "Thread 1":
				color = ThreadColor.red;
				break;
			case "Thread 2":
				color = ThreadColor.green;
				break;
			default:
				color = ThreadColor.blue;
				break;
		}
		
		int n = 0;
		for( int i = 0; i < 10; i++ ) {
			
			n++;
			System.out.println( color + " " + Thread.currentThread().getName() + " : n = " + n );
		}
	}
}
class AddCount extends Thread {
	
	private Add threadCountDown;
	
	public AddCount( Add ThreadC ) {
		this.threadCountDown = ThreadC;
	}
	
	public void run() {
		this.threadCountDown.doCountDown();
	}
}
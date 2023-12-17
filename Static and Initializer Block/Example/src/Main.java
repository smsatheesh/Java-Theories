public class Main {
	
	static {
	
		// It will displayed during class time loading
		System.out.println( "Static block - 1, Will be displayed only once." );
	}
	
	{
		
		// It will be displayed during object initialization
		System.out.println( "Initializer block - 2" );
	}
	
	{
		
		// It will be displayed during object initialization
		System.out.println( "Initializer block - 3" );
	}
	public static void main(String[] args) {

		Main obj = new Main();
	}
}
public class Main{

	@FunctionalInterface
	interface function1 {
		
		public abstract int operation( int x, int y );
	}

	@FunctionalInterface
	interface function2 {
		
		public abstract void sayMessage( String message );
	}
	
	private int operate( int a, int b, function1 obj ) { 
		
		return obj.operation(a, b);
	}
	
	public static void main( String[] args ) {
		
		function1 add = ( a, b ) -> ( a + b );
		
		function1 multiply = ( a, b ) -> ( a * b );
		
		Main object = new Main();
		System.out.println( "Addition operation : " +  (object).operate( 5, 10, add ) );
		
		System.out.println( "Multiplication operation : "  + (object).operate( 10 , 20, multiply ) );
		
		function2 sayingMessage = ( message ) -> System.out.println( "Message, " + message );
		sayingMessage.sayMessage( "displayed successfully !!" );
		
	}
}

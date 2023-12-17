public class Main {

	public static void main( String[] args ) {
		
		try {
			
			throw new UserDefinedException( "Custom user defined exception" );
		} catch ( Exception exp ) {
			
			System.out.println( exp.getMessage() );
		}
		
		System.out.println( "Rest of the code ..." );
	}
}
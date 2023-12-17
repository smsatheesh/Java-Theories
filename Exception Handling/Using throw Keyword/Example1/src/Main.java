public class Main {
	
	static void validateForEligibility( int age ) {
		
		if( age < 18 )
			throw new ArithmeticException( "Not eligible for license minimum age requirement" );
		else
			System.out.println( "\nWelcome, You are eligibile for License !!" );
	}
	public static void main( String[] args ) {
		
		Scanner getInp = new Scanner( System.in );
		
		System.out.println( "\t\t--- Using 'throw' Keyword ---" );
		
		System.out.print( "\nEnter age to vallidate : " );
		int age = getInp.nextInt();
		
		validateForEligibility( age );
		System.out.println( "Rest of the code ..." );
	}
}
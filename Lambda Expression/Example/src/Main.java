public class Main{

	public static void main( String[] args ) {
		
		System.out.println( "\t\t--- LEAP YEAR IN LAMBDA ---" );
		
		System.out.print( "Enter year :: " );
		int year = (new Scanner( System.in )).nextInt();
		
		leapYear lpYr = ( yr ) -> {
			
			if( (yr % 400 == 0) || ( (yr % 4 == 0 ) && (yr % 100 != 0)) ) {
				return true;
			} else {
				return false;
			}
		};
		
		if( lpYr.flag( year ) )
			System.out.println( "Leap year" );
		else
			System.out.println( "Not a leap year" );
		
	}
}
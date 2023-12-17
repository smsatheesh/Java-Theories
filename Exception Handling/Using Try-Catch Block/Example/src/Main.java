public class Main {

	static int getInt() {
		Scanner __scanner = new Scanner( System.in );
		return __scanner.nextInt();
	}
	
	public static void main( String[] args ) {
		
		System.out.println( "\t\tException Handling" );
		try {
			
			System.out.print( "Enter num1 : " );
			int num1 = getInt();
			
			System.out.print( "Enter num2 : " );
			int num2 = getInt();
			System.out.println( "No exception event occurs. \nFinal output is : " + (num1 / num2) );
		} catch ( Exception exp ) {
			
			exp.printStackTrace();
		}

		System.out.println( "After exception handling block !!" );
	}
}

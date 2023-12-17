public class Main {
	
	public static void main( String[] args ) {
		
		String str = "abcd";
		int num = Integer.parseInt( str );
		System.out.println( "After exception event !!" ); // It will not be printed, since normal flow gets terminated
	}
}
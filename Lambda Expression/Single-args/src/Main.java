public class Main{

	public static void main( String[] args ) {
		
		
		drawable d = ( width ) -> {
			System.out.println( "Drawing width : " + width );
		};
		
		d.draw( 10 );
	}
}
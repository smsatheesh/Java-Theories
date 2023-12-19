public class Main{

	public static void main( String[] args ) {
		
		int width = 20;
		
		drawable d = () -> {
			System.out.println( "Drawing width : " + width );
		};
		
		d.draw();
	}
}
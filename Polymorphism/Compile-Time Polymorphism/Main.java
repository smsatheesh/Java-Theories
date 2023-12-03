public class Main
{

	public static void main( String[] args ) {
	
		Person person = new Person();
		person.setName( "Satheesh" );
		System.out.println( person.getName() );
		
		person.setName( "S", "Satheesh" );
		System.out.println( person.getName() );
		
		person.setName( "S", "m", "Satheesh" );
		System.out.println( person.getName() );
	}
}
import java.util.*;

public class Main {
	
	public static void main( String[] args ) {
		
		List<Student> arrStu = new ArrayList<Student>();
		arrStu.add( new Student( "Mayank", 20 ) );
		arrStu.add( new Student( "Satheesh", 23 ) );
		arrStu.add( new Student( "Harish", 21 ) );
		arrStu.add( new Student( "Hariharan", 21 ) );
		
		System.out.println( "Unsorted" );
		
		for( int i = 0; i < arrStu.size(); i++ )
			System.out.println( arrStu.get( i ).toString() );
		
		
		Collections.sort( arrStu, new SortByAge() );
		
		System.out.println( "\nAfter Sort by Age" );

		for( int i = 0; i < arrStu.size(); i++ )
			System.out.println( arrStu.get( i ).toString() );
		
		Collections.sort( arrStu, new SortByName() );
		System.out.println( "\nAfter Sort by Name" );
		
		for( int i = 0; i < arrStu.size(); i++ )
			System.out.println( arrStu.get( i ).toString() );
		
	}
}
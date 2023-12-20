import java.util.function.Predicate;

public class Main {
	
    public static void main (String[] args) {
    
    	Predicate<Integer> greater_than = (x) -> (x > 10);
    	System.out.println( "Is 9 greater than 10 ? " + greater_than.test( 9 ) );
    	System.out.println( "Is 12 greater than 10 ? " + greater_than.test( 12 ) );
    	
    	Predicate string = Predicate.isEqual( "Defined string" );
    	System.out.println( "\nString predicate check 1 ? " + string.test( "exisiting string" ) );
    	System.out.println( "String predicate check 2 ? " + string.test( "Defined string" ) );
    	
    	Predicate<Integer> greater_than_10 = ( x ) -> ( x > 10 );
    	Predicate<Integer> less_than_20 = ( x ) -> ( x < 20 );
    	System.out.println( "\nIs number 25 greater than 10 and less than 20 ? " + greater_than_10.and( less_than_20).test( 25 ) );
    	System.out.println( "Is number 14 greater than 10 and less than 20 ? " + greater_than_10.and(less_than_20).test( 14 ) );
    	
    	Predicate<Integer> greater_than_50 = ( x ) -> ( x > 50 );
    	System.out.println( "\nIs 100 greater than 50 and display results will be in opposited : " + greater_than_50.negate().test( 100 ) );
    	System.out.println( "Is 20 greater than 50 and display results will be in opposited : " + greater_than_50.negate().test( 20 ) );
    }
}
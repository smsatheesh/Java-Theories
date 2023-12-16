public class Main
{
    
	public static void main( String[] args ) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for( int loop = 1; loop <= 10; loop++ )
			intList.add( Integer.valueOf( loop ) ); // Auto-Boxing
		
		for( int loopVar = 0; loopVar < intList.size(); loopVar++ ) 
			System.out.println( (loopVar + 1) + " is " + intList.get( loopVar ).intValue() ); // Un-boxing
	}
}
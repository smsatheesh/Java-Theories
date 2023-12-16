public class Main
{
    
	public static void main( String[] args ) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for( int loop = 1; loop <= 10; loop++ )
			intList.add( loop ); // Auto-Boxing done, actually we need to enter 'Integer.valueOf( loop )'
		
		for( int loopVar = 0; loopVar < intList.size(); loopVar++ ) 
			System.out.println( (loopVar + 1) + " is " + intList.get( loopVar ) ); // Un-boxing done, actually we need to enter 'intList.get( loopVar ).intValue()'
	}
}
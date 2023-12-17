import java.io.*;

public class Main {

	public static void main( String[] args ) throws IOException {
		
		FileReader fileReader = new FileReader( "..//file.txt" );
		BufferedReader buffReader = new BufferedReader( fileReader );
		
		String line = buffReader.readLine();
		
		boolean flag = false;
		while( line != null ) {
			
			if( flag )
				System.out.print( "\n" + line );
			else {
				
				System.out.print( line );
				flag = true;
			}
			
			String[] lineArr = line.split( " " );
			Integer num = 0;
			
			try {
				
				for( int loop = 0; loop < lineArr.length; loop++ ) {
				
					if(( !Character.isDigit( lineArr[loop].charAt( 0 )) ))
						continue;
					else {
						
						if( Character.isDigit( lineArr[loop].charAt( 0 )) )
							num += Integer.valueOf( lineArr[loop] );
					}
				}
			} catch ( Exception exp ) {
				
				System.out.println( exp.getMessage() );
			}
			
			if( num > 0 )
				System.out.print( " \t \t Sum of the line -> " + num );
			
			line = buffReader.readLine();
		}
		
		buffReader.close();
		fileReader.close();
	}
}
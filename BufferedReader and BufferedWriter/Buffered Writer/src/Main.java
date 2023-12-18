import java.io.*;

public class Main {

	public static void main( String[] args ) throws IOException {
		
		FileWriter fileWriter = new FileWriter( "D://SM_SATHEESH_CSE//Repository//Java-Theories//BufferedReader and BufferedWriter//Buffered Writer//file.txt" );
		BufferedWriter buffWriter = new BufferedWriter( fileWriter );
		
		buffWriter.write( "If content is being written ...?" );
		
		System.out.println( "Content written successfully !!" );
		buffWriter.close();
		fileWriter.close();
	}
}
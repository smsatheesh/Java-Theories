import java.io.*;

class TestThrows {
	
	public void m() throws IOException {
		
		throw new IOException( "device error ....." );
	}
	
	public void n() throws IOException {
		
		m();
	}
	
	public void p() {
		
		try {
			
			n();
		} catch( Exception exp ) {
			
			System.out.println( exp.getMessage() );
		}
	}
}
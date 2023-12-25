public class Main {

    public static void main (String[] args) {
    
    	System.out.println( "This is a main thread" );
    	Thread obj = new FirstSubThread ();
	obj.setName( "SubThread->1" );
    	obj.setPriority( 1 );
    	obj.start();
    	
    	System.out.println( "New main method" );
    }
}
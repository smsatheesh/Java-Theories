public class Main {

    public static void main (String[] args) {
    
    	Test obj1 = new Test( 10, 20 );
    	System.out.println( "Befor Assignment ( OBJECT 1 )       : " + obj1.getValues() );
    	obj1.getValues();
    	
    	Test obj2 = obj1;
    	System.out.println( "After assignment ( OBJECT 2 )       : " + obj2.getValues() );
    	
    	obj2.x = 50;
    	System.out.println( "After value assignment ( OBJECT 2 ) : " + obj2.getValues() );
    	System.out.println( "After value assignment ( OBJECT 1 ) : " + obj1.getValues() );
    }
}
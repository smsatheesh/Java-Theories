public class Main {

    public static void main (String[] args)
    	throws CloneNotSupportedException{
    
    	TestIntermediate obj1 = new TestIntermediate();
    	obj1.a = 10;
    	obj1.b = 20;
    	obj1.c.x = 100;
    	obj1.c.y = 200;
    	
    	System.out.println( "Values After Declaration ( OBJECT 1 ) " + obj1.toString() );
    	
    	TestIntermediate obj2 = new TestIntermediate();
    	obj2 = ( TestIntermediate ) ( obj1.clone() );
    	
    	System.out.println( "Values After Declaration ( OBJECT 2 ) " + obj2.toString() );
    	
    	obj2.a = 50;
    	obj2.c.x = 800;
    	System.out.println( "Values After Change ( OBJECT 2 )      " + obj2.toString() );
    	System.out.println( "Values After Change ( OBJECT 1 )      " + obj1.toString() );
    }
}
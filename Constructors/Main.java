
public class Main {

	public static void main( String[] args ) {
		
		Student stu1 = new Student();
		Student stu2 = new Student( "Raj", "18CSE10" );
		Student stu3 = new Student( "Kumar", "18CSE12", "11th", "B" );
		
		System.out.println( "----- Student 1 -----" );
		stu1.display();
		
		System.out.println( "\n----- Student 2 -----" );
		stu2.display();
		
		System.out.println( "\n----- Student 3 -----" );
		stu3.display();
		
	}	
}
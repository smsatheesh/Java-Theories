import java.util.*;

public class Main {
	
	public static void main( String[] args ) {
		
		ArrayList<Student> list = new ArrayList<Student>();  
		list.add(new Student(101,"Vijay",23));  
		list.add(new Student(106,"Ajay",27));  
		list.add(new Student(105,"Jai",21));  
		  
		Collections.sort( list );
		
		for( Student st: list )  
			System.out.println( st.rollNo + " " + st.name + " " + st.age ); 
	}
}
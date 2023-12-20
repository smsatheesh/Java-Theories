import java.util.*;

public class Main {
	
    public static void main (String[] args) {
    
    	List<Student> student = new ArrayList<Student>();
    	student.add( new Student( 1, 90 ) );
    	student.add( new Student( 2, 80 ) );
    	student.add( new Student( 3, 70 ) );
    	student.add( new Student( 4, 66 ) );
    	student.add( new Student( 5, 50 ) );
    	
    	List<Float> streamObj = student.stream()
    								.filter( p -> p.percentage >= 66 )
    									.map( p -> p.percentage )
    										.collect( Collectors.toList() );
    
    	System.out.println( streamObj );
    }
}
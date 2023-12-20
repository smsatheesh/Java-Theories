import java.util.function.Function;

public class Main {
	
    public static void main (String[] args) {
    
    	Student[] student =
    		{
    			new Student( 98, "Satheesh" ),
    			new Student( 87, "Harish" ),
    			new Student( 72, "Santhosh" ),
    			new Student( 69, "Nandy" ),
				new Student( 89, "Vijay" )
    		};
    	
    	Function<Student, String> f = ( s2 ) -> {
    		
    		int marks = s2.marks;
    		
    		 String grade = " ";
             if(marks>90)
                 grade = "A";
             else if(marks>80)
                 grade = "B";
             else if(marks>70)
                 grade = "C";
             else
                 grade = "D";
             
             return grade;
    	};
    	
    	for( Student stu: student ) {
    		
    		System.out.println( "Student name :" + stu.name );
    		System.out.println( "Student marks :" + stu.marks );
    		System.out.println( "Grade of the Student :" + f.apply( stu ) + "\n" );
    	}
    }
}
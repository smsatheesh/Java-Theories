import java.lang.*;

class Student implements Comparable<Student> {  
	
	int rollNo;  
	String name;  
	int age;
	
	public Student( int rollNo, String name, int age ) {  
		
		this.rollNo = rollNo;  
		this.name = name;  
		this.age = age;  
	}  
	  
	public int compareTo( Student st ) { 
		
		if(age == st.age)  
			return 0; 
		else if(age > st.age)  
			return 1;  
		else  
			return -1;  
	}  
}
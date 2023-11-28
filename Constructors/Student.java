
class Student {
	
	private String studentName, studentRollNo, studentStandard, studentSection;
	
	public Student() {
		
		this.studentName = "Satheesh";
		this.studentRollNo = "18CSE50";
		this.studentStandard = "10th";
		this.studentSection = "A";
	}
	
	public Student( String name, String rollNo ) {
		
		this.studentName = name;
		this.studentRollNo = rollNo;
		this.studentStandard = "10th";
		this.studentSection = "A";
	}
	
	public Student(String name, String rollNo, String std, String sec) {
		
		this( name, rollNo );
		this.studentStandard = std;
		this.studentSection = sec;
	}
	
	public String getStudentName() {
		return studentName;
	}


	public String getStudentRollNo() {
		return studentRollNo;
	}


	public String getStudentStandard() {
		return studentStandard;
	}


	public String getStudentSection() {
		return studentSection;
	}
	
	public void display() {
		
		System.out.println( "Student Name    : " + this.getStudentName() );
		System.out.println( "Student Roll No : " + this.getStudentRollNo() );
		System.out.println( "Student Standard: " + this.getStudentStandard() );
		System.out.println( "Student Section : " + this.getStudentSection() );
		
	}
}
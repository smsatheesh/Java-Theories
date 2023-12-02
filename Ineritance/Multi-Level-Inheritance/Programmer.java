public class Programmer extends Employee {

	private float programmerAddOnSalary = 20000;
	
	public static void main(String[] args) throws Exception {

		Programmer childObj = new Programmer();
		
		System.out.println( "\t\tMulti-Level Inheritance in  Java" );
		
		System.out.println( "\nManagement name                        : " + childObj.managementName );
		System.out.println( "Basic salary of an employee            : " + childObj.salary );
		System.out.println( "Bonus for the Programmer               : " + childObj.programmerAddOnSalary );
		System.out.println( "Total salary for a role of  Programmer : " + ( childObj.salary + childObj.programmerAddOnSalary ) );
	}
}
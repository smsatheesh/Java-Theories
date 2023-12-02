
public class Programmer extends Employee {

	private float programmerAddOnSalary = 20000;
	
	public static void main(String[] args) throws Exception {

		Programmer childObj = new Programmer();
		
		System.out.println( "\t\tSingle-Level Inheritance in  Java" );
		
		System.out.println( "\nBasic salary of an employee            : " + childObj.salary );
		System.out.println( "Bonus for the Programmer               : " + childObj.programmerAddOnSalary );
		System.out.println( "Total salary for a role of  Programmer : " + ( childObj.salary + childObj.programmerAddOnSalary ) );
	}
}

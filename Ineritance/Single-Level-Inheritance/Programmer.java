
public class Programmer extends Employee {

	private float programmerAddOnSalary = 20000;
	
	public static void main(String[] args) throws Exception {

		Programmer parentObj = new Programmer();
		
		System.out.println( "\t\tSingle Level-Inheritance in  Java" );
		
		System.out.println( "\nBasic salary of an employee            : " + parentObj.salary );
		System.out.println( "Bonus for the Programmer               : " + parentObj.programmerAddOnSalary );
		System.out.println( "Total salary for a role of  Programmer : " + ( parentObj.salary + parentObj.programmerAddOnSalary ) );
	}
}

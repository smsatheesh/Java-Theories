public class Main {
	
	public static void main(String[] args) throws Exception {

		Programmer childObjForProgrammer = new Programmer();
		
		System.out.println( "\t\tHierarchical-Level Inheritance in  Java" );
		
		System.out.println( "Basic salary of an employee           : " + childObjForProgrammer.salary );
		System.out.println( "\nBonus for the Programmer              : " + childObjForProgrammer.programmerAddOnSalary );
		System.out.println( "Total salary for a role of Programmer : " + ( childObjForProgrammer.salary + childObjForProgrammer.programmerAddOnSalary ) );
		
		Tester childObjForTester = new Tester();
		System.out.println( "\nBonus for the tester                  : " + childObjForTester.testerAddOnSalary );
		System.out.println( "Total salary for a role of Tester     : " + ( childObjForTester.salary + childObjForTester.testerAddOnSalary ) );
	}
}
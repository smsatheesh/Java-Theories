class Hr implements Programmer, Tester {
	
	void displayProgrammerDomain() {

		System.out.println( "\nBonus for the Programmer              : " + Programmer.programmerAddOnSalary );
		System.out.println( "Total salary for a role of Programmer : " + ( Programmer.salary + Programmer.programmerAddOnSalary ) );	
	}
	
	void displayTesterDomain() {
		
		System.out.println( "\nBonus for the tester                  : " + Tester.testerAddOnSalary );
		System.out.println( "Total salary for a role of Tester     : " + ( Tester.salary + Tester.testerAddOnSalary ) );
	}
	
	Hr() {
		
		System.out.println( "\t\tHybrid-Level Inheritance in  Java" );
		System.out.println( "\nBasic salary of an employee           : " + Employee.salary );
	}
}
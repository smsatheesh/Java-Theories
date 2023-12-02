
public class Main implements Programmer, Tester {
	
	@Override
	public void showRole() {
		
		System.out.println( "We will working co-ordinately for the client satisfaction " );
	}

	public void showRoleForProgrammer() {
		
		Programmer.super.showRole();
	}
	
	public void showRoleForTester() {
		
		Tester.super.showRole();
	}
	
	public static void main(String[] args) throws Exception {

		Main childObj = new Main();
		
		System.out.println( "\t\tMultiple-Level Inheritance" );
		
		System.out.print( "\nOver-rided Method : " );
		childObj.showRole();
		
		System.out.print( "\nProgrammer Role : " );
		childObj.showRoleForProgrammer();
		
		System.out.print( "\nTester Role : " );
		childObj.showRoleForTester();
	}
}
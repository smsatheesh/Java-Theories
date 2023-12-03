public class Main 
{
	
	static void getDisplayAllDetails( University univ ) {
		
		System.out.println( "\t\tComposition Of Object Details" );
		
		System.out.println( "\nName of the university            : " + univ.getUniversityName() );
		System.out.println( "Code fot the university           : " + univ.getUniversityCode() );
		System.out.println( "College name under the University : " + univ.college.getCollegeName() );
		System.out.println( "College code under the university : " + univ.college.getAddressOfCollege() );
		System.out.println( "Branches for the college          : " + (univ.college.branches.getBranches()).toString() );
	}
	
	public static void main( String[] args ) {
	
		ArrayList<String> branches = new ArrayList<String>();
		branches.add( "CSE" );
		branches.add( "ECE" );
		branches.add( "EEE" );
		
		Branch branch = new Branch( branches );
	
		College college = new College( "XXX", "YYY", branch );
		University univ = new University( 10001, "ZZZ", college );
		
		getDisplayAllDetails( univ );
	}
}
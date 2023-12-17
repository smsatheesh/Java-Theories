public class Main {
	
	enum Level {
		HIGH, MEDIUM, EASY
	}
	
	public static void main(String[] args) {

		Level enumLevelHigh = Level.HIGH;
		Level enumLevelMedium = Level.MEDIUM;
		Level enumLevelEasy = Level.EASY;
		
		System.out.println( enumLevelHigh + ", " + enumLevelMedium + ", " + enumLevelEasy );
		
		for( Level level: Level.values() )
			System.out.println( "Level : " + level );
		
	}
}
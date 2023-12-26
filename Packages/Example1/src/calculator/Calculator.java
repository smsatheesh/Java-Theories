package calculator;

public class Calculator {

	private double a, b;
	
	public Calculator() {
	
		System.out.println(" Scientifi Cacli class initialization done .... "); 
	}
	
	public static double sum(double a, double b) {
		
		return ( a + b );
	}
	
	public static double difference( double a, double b ) {
		
		return ( a - b );
	}
	
	public static double multiply( double a, double b ) {
		
		return ( a * b );
	}
	
	public static double division( double a, double b ) {
		
		return ( a / b );
	}
}

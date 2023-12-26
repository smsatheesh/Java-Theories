package com.company;

import calculator.*;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		ScientificCalci sciCalci = new ScientificCalci();
		
		Scanner getInp = new Scanner( System.in );
		System.out.println( "Enter 2 numbers :: " );
		double x = getInp.nextDouble();
		double y = getInp.nextDouble();
		
		double resSum = Calculator.sum(x, y);
		System.out.println( "Sum is         " + resSum );
		
		double resDiff = Calculator.difference( x, y );
		System.out.println( "Difference is  " + resDiff );
		
		double resMul = Calculator.multiply( x , y );
		System.out.println( "Multiply is    " + resMul );
		
		double resDiv = Calculator.division( x , y );
		System.out.println( "Division is    " + resDiv );
		
		double resPow = ScientificCalci.power( x );
		System.out.println( "Power of " + x + " is " + resPow );
	}
}
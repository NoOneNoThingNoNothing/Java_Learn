package main;

public class Java_data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Minimum and Maximum value for integers
		//1. For Byte
		System.out.println("Minumum value for Byte: " + Byte.MIN_VALUE);
		System.out.println("Maximum value for Byte: " + Byte.MAX_VALUE);
		
		//2. For Short
		System.out.println("Minumum value for Short: " + Short.MIN_VALUE);
		System.out.println("Maximum value for Short: " + Short.MAX_VALUE);
		
		//3. For Integer
		System.out.println("Minumum value for Integer: " + Integer.MIN_VALUE);
		System.out.println("Maximum value for Integer: " + Integer.MAX_VALUE);
		
		//4. For Long
		System.out.println("Minumum value for Long: " + Long.MIN_VALUE);
		System.out.println("Maximum value for Long: " + Long.MAX_VALUE);
		
		//Minimum and Maximum value for Float points
		//1. Float
		System.out.println("Minumum value for Float: " + Float.MIN_VALUE);
		System.out.println("Maximum value for Float: " + Float.MAX_VALUE);
				
		//2. Double
		System.out.println("Minumum value for Double: " + Double.MIN_VALUE);
		System.out.println("Maximum value for Double: " + Double.MAX_VALUE);
		
		//Check NaN (Not a Number)
		double testVar1 = Double.NaN;
		
		System.out.println(Double.isNaN(testVar1) ? "Not a Number" : "Number: " + testVar1);
		
		//The Char Type
		//1. Write character
		char charvar1 = 'A';
		
		//2. Unicode Character
		char charvar2 = '\u2122';
		
		System.out.println("This is the character 1: " + charvar1);
		System.out.println("This is the character 2: " + charvar2);

	}

}

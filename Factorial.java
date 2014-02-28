/**
 * @author Zachary Donato. 
 * Computes factorial recursively. 
 */

import java.util.Scanner; 

public class Factorial{
	// Initialize data members. 
	static int number = 0; 
	
	/**
	 * Method getNumber reads input from the user via command line. 
	 */ 
	public static void getNumber(){
		Scanner scan = new Scanner(System.in);  
		do { 
			System.out.println("Please input a positive number: "); 
			number = scan.nextInt(); 
		} while (number < 0); 
		
		System.out.println("The factorial of " + number + " is: " + factorial(number)); 
		
	}
	
	/** 
	 * Method factorial computes the factorial of a given number recursively. 
	 * @param int n, the number to find the factorial of. 
	 * @return The factorial of n. 
	 */
	public static int factorial(int n){
		if (n == 0) return 1; 
		
		return n * factorial(n-1); 
	}
	
	public static void main(String[] args){
		getNumber(); 
	}
	
}
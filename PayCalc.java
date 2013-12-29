class payCalculator{ 
	// Expects hours worked and basePay in the form of doubles. Prints out the totalPay. 
	public static void pay(int hours, double basePay){
		// Initialize overtime to 0 for no overtime hours. 
		double overtime = 0;
		
		// Check for hours worked being greated than 60 and disgregard any over 60.  
		if (hours > 60){ 
			hours = 60; 
			System.out.println("You will only be paid for 60 hours. We do not pay for any hours over 60 worked in the workweek."); 
		}
		
		// Check for basePay to be at least 8.00. 
		if (basePay < 8.00){ 
			System.out.println("The wage must be greater than $8.00."); 
			return; 
		}
		
		// Determine overtime hours. Overtime is basePay * 1.5 for each hour worked.
		if (hours > 40){ 
			double over = hours - 40; 
			overtime = over * 1.5 * basePay; 
			hours = 40; 
		}
		
		// Calculate the totalPay and print it. 
		double totalPay = overtime + (hours * basePay); 
		System.out.println("Your total pay for this week is $" + totalPay + "."); 
	}	
	
	public static void main(String[] args){ 
		// Tests to run method pay
		pay(40, 8.00); 
		pay(60, 8.00); 
		pay(20, 4.00); 
		pay(50, 9.00); 
		pay(40, 10.00); 
	}

}
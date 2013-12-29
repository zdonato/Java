class Marathon{ 
	// Expects an array with all doubles for race times. 
	public static double getBest(double[] times){ 
		// Set the minimum to be the first value. 
		double currMin = times[0]; 
		for (int i = 0; i < times.length; i++){ 
			// If the value at times[i] is less than current min, assign current min to times[i]. 
			if (times[i] < currMin){ 
				currMin = times[i]; 
			}
		}
		// After loop execution, return the current min. 
		return currMin; 
	}
	
	// Expects an array with all doubles for race times. 
	public static double getSecondBest(double[] times){ 
		// Find the best time to skip over when finding the second best. 
		double first = getBest(times);
		
		// Declare a variable to hold the second best. 
		double secMin; 
		
		// Check if the zeroth index is equal to the best time. 
		if (first == times[0]){ 
			secMin = times[1]; 
		} else {
		 	secMin = times[0];  
		}
		for (int i = 0; i < times.length; i++){ 
			// If times[i] is equal to the best time skip over the iteration. 
			if (times[i] == first){ 
				continue; 
			} else{ 
				// If times[i] is less than the second best time, replace secMin with times[i]. 
				if (times[i] < secMin){ 
					secMin = times[i]; 
				}
			}
		}
		// Return the second best time. 
		return secMin; 
	}
	
	public static void main(String[] args){ 
		// Testing array with race times. 
		double[] test = {3.3, 7.9, 8.8, 5.3, 4.4, 10.10 }; 
		System.out.println("The best performance is a time of " + getBest(test) + ".");
		System.out.println("The second best performance is a time of " + getSecondBest(test) + ".");  
	}
		
}
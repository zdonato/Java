class GravityCalculator { 
	public static void main(String[] arguments){ 
		double a; 
		double v; 
		double t; 
		double x; 
		double xf = .5 * a * t * t; 
		xf = xf + v*t; 
		xf = xf + x; 
		System.out.println("An object's position after time " + t + " seconds is " + xf + " m."); 
	}	
}
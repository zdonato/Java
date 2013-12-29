// Practicing with classes. 

public class Baby { 
	// Declare instance variables as private so that they can only be accessed within the class. 
	private String name; 
	private String sex; 
	private double weight; 
	
	// Public constructor to be used in any other file. Private if only to be used within class. 
	public Baby(String myName, String s, double w){ 
		name = myName; 
		sex = s; 
		weight = w; 
	}
	// Method to say what the name is. 
	void sayHi(){ 
		System.out.println("Hi my name is " + name + "."); 
	}
	// Method to display the fields of the Baby object.  
	public void displayBaby(){ 
		System.out.println("Name: " + name); 
		System.out.println("Sex: " + sex); 
		System.out.println("Weight: " + weight + " lbs");
	}
	
	public static void main(String[] args){ 
		Baby zach = new Baby("Zach", "Male", 7.6); 
		zach.displayBaby();
		zach.sayHi(); 
		space.set(); 
		Baby liz = new Baby("Liz", "Female", 6.5); 
		liz.displayBaby(); 
		liz.sayHi();  
	}
} 


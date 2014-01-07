// Simple class to create a Person object. 
public class Person{
	// Initalize variables.
	private String wholeName; 
	private String phoneNum; 
	
	// Person constructor. 
	public Person(String name, String number){
		this.wholeName = name; 
		this.phoneNum = number; 
	} // End constructor. 
	
	// Method getName() to get the name. 
	public String getName(){
		return wholeName; 
	} // end getName()
	
	// Method getNumber() to get the phone number. 
	public String getNumber(){
		return phoneNum; 
	} // end getNumber()
}
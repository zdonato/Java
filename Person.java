public class Person{
	private String wholeName; 
	private String phoneNum; 
	
	public Person(String name, String number){
		this.wholeName = name; 
		this.phoneNum = number; 
	}
	
	public String getName(){
		return wholeName; 
	}
	
	public String getNumber(){
		return phoneNum; 
	}
}
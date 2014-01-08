// Example of creating an ArrayList. 
import java.util.ArrayList; 

class ArrayListExample{
	public static void main(String[] args){
		// Initalize the ArrayList. 
		ArrayList<String> strings = new ArrayList<String>(); 
		
		// Use .add(item) for adding elements. 
		strings.add("SomeName"); 
		strings.add("Blah"); 
		strings.add("Foo"); 
		strings.add("FooFoo"); 
		strings.add("Zachary"); 
		strings.add("Elizabeth"); 
		strings.add("Kellie"); 
		strings.add("Anthony"); 

		
		// Use .size() for the length of the ArrayList and .get(index) to get the value of the index. 
		for (int i = 0; i < strings.size(); i++){
			System.out.println(strings.get(i)); 
		}	
		
		// Use .set(index, value) to manipulate pre-existing values. 
		strings.set(0, "Blah"); 
		System.out.println(); 
		
		for (int j = 0; j < strings.size(); j++){
			System.out.println(strings.get(j)); 
		}
		
		System.out.println(); 
		// Use .remove(value) to remove that value from the ArrayList.
		strings.remove("FooFoo"); 
		strings.remove("Kellie"); 
		
		// Alternative way to loop through ArrayList. 
		for (String s : strings){
			System.out.println(s); 
		}
		
	}
}
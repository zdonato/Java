/**
 * A simple class that removes a number that the user specifies from an ArrayList. 
 * @author Zachary Donato 
 * Date: 1.28.14
 * Revisions: 
*/ 

import java.util.ArrayList; 
import java.util.Scanner; 

public class Remover{
	// Initialize variables. 
	private static ArrayList<Integer> list = new ArrayList<Integer>(); 
	private static int numToRemove; 
	
	/**
	 * Method to remove the number desired. 
	 * @param al An ArrayList for which the element is to be removed from. 
	 * @return list The list after the number has been removed form it. 
	*/
	private static ArrayList removeAll(ArrayList<Integer> al){
		// Check if the list is empty before moving onto the loop. 
		if (al.isEmpty()){
			return list; 
		}
		for (int i = 0; i < al.size(); i++){
			// Remove the number if it is at the current index. 
			if (al.get(i) == numToRemove){
				al.remove(i); 
			}
		}
		return list; 
	}
	
	/**
	 * Method to loop through adding elements to the list. 
	*/
	private static void addElements(){
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter -1 to quit."); 
		while (true){
			System.out.print("Add element: "); 
			int e = scan.nextInt(); 
			if (e == -1){
				break; 
			} else { 
				list.add(e); 
			}
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Which element would you like to remove? --> "); 
		numToRemove = scanner.nextInt(); 
		addElements(); 
		removeAll(list); 
		System.out.println(list); 		
	}
}
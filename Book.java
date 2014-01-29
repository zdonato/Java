public class Book{ 
	private String title; 
	private boolean borrowed; 
	
	public Book(String bookTitle){ 
		title = bookTitle; 
	} // End of Book constructor. 
	
	public void Borrowed(){ 
		borrowed = true; 	
	} // End of Borrowed(). 
	
	public void Returned(){ 
		borrowed = false; 	
	} // End of Returned(). 
	
	public boolean isBorrowed(){
		// Returns true if the book is borrowed, false otherwise. 
		if (borrowed == true){
			return true; 
		} else {
			return false; 
		}
	} // End of isBorrowed(). 
	
	public String getTitle(){ 
		return title; 
	} // End of getTitle().
}
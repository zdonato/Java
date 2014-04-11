import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;  

class FileReading {
	public static void main(String[] args) {
		int number;
		int j = 0; 
		int sum = 0;  
		String ret = "";
		String inputLine; 
		String[] splits = new String[25]; 
		BufferedReader in; 
		
		try {
			in = new BufferedReader(new FileReader("data.txt")); // Put the name of the file in FileRead.
			for(inputLine = in.readLine(); inputLine != null; inputLine = in.readLine()){ // Iterate through the file.
				splits = inputLine.split(" "); // Splits at the space character. Can pass regular expressions or other characters.
				if (splits.length != 0){
					for(j = 0; j < splits.length; j++){
						if (j == splits.length - 1)
							ret += splits[j] + " = ";
						else 
							ret += splits[j] + " + ";
					}
					for (j = 0; j < splits.length; j++){
						sum += Integer.parseInt(splits[j]);
					}
					System.out.println(ret + sum); 
					ret = ""; 
				} 	
			}
			in.close(); 
		} catch (NumberFormatException nfe) {
			System.out.println("Error! Expected: class java.lang.Integer\nError: " + nfe.getMessage());
		} 
		catch (IOException e) {
			System.out.println("File I/O error.");
			System.exit(1);
		}
	}
}
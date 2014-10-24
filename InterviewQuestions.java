public class InterviewQuestions {
	static boolean is_prime(double n){
		int i; 
		final double sq = Math.sqrt(n); 
		for (i = 2; i <= sq; ++i){
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	static void fizzbuzz(int n){
		int i; 
		for (i = 1; i <= n; ++i){
			if (i % 15 == 0){
				System.out.println("fizzbuzz"); 
			}
			else if (i % 5 == 0){
				System.out.println("buzz");
			}
			else if (i % 3 == 0){
				System.out.println("fizz"); 
			} 
			else {
				System.out.println(i); 
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println(Double.MAX_VALUE); 
		System.out.println(is_prime(Double.MAX_VALUE)); 
		//fizzbuzz(100); 
	}
}
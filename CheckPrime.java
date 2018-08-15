package july24;

public class CheckPrime {

	public static void main(String[] args) {
		//Check if a number is prime
		
		boolean b = isPrime(11);
		if(b) {
			System.out.println("This is a prime");
		}else {
			System.out.println("This is Not a prime");
		}		
		
		boolean c = isPrime(10);
		if(c) {
			System.out.println("This is a prime");
		}else {
			System.out.println("This is Not a prime");
		}		
	}
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<n-1; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
		
	}
}

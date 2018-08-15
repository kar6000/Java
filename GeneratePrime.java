package com.aug5;

public class GeneratePrime {

	public static void main(String[] args) {
		// Generate Prime number from 1 to 100
		
		for(int i=2; i<100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}

	}
	
	public static boolean isPrime(int n) {
		
		if(n<=0) {
			return false;
		}
		for(int i=2; i<n-1; i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}

}

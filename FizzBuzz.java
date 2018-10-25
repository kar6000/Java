package com.oct18;

public class FizzBuzz {

	//Write a FizzBuzz program. Print intgers from 1 to 50. If the number is divided by 3, it will print "Fizz", if the number
	//divisible by 5, it will print "Buzz", if the number divided by 15, it will print "FizzBuzz". Else it will print the number
	public static void main(String[] args) {
		
		for(int i=0; i<50; i++) {
			if (fizzBuzz(i)) {
				System.out.println(i);	
			}
		}
	}
	
	public static boolean fizzBuzz(int n) {
		if(n%15 ==0) {
			System.out.println("FizzBuzz");
		}else if(n%3 ==0) {
			System.out.println("Fizz");
		}else if(n%5 ==0){
			System.out.println("Buzz");
		}else {
			System.out.println(n);
		}
		return false;
	}
}

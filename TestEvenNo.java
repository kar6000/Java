package com.july30;

public class TestEvenNo {

	public static void main(String[] args) {
		
		boolean b=isEven(-89);
		if(b) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}		

	}
	
	public static boolean isEven(int a) {
		
		if(a%2 ==0) {
			return true;
		}else {
			return false;
		}


	}
}

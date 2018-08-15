package com.practice1;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = fab(6);
		System.out.println(v);

	}

	public static int fab(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int fab = fab(n-1)+fab(n-2);
		return fab;
	}
}

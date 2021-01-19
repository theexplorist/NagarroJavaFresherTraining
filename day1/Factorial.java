package com.nagarro.codingblocks.java.day1;

public class Factorial {
	
	public static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int recAns = fact(n - 1);
		return n * recAns;
	}
	
	public static void fact(int n, int ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		fact(n - 1, ans * n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(4, 1);
	}

}

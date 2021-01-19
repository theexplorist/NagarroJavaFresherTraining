package com.nagarro.codingblocks.java.day1;

public class IncDec {
	
	public static void Dec(int n) {
		
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		Dec(n - 1);
	}
	
	public static void Inc(int n) {
		
		if(n == 0) {
			return;
		}
		
		Inc(n - 1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inc(5);
	}

}

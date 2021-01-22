package com.nagarro.codingblocks.java.day3;

import java.util.Arrays;

public class FibonacciNumber {
	
	private static int fibRec(int n, int[] cache) {
		// TODO Auto-generated method stub
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(cache[n] != -1) {
			return cache[n];
		}
		
		int c1 = fibRec(n - 1, cache); //n - 1 th // 1th
		int c2 = fibRec(n - 2, cache); // n - 2 th // 0th
		
		return cache[n] = c1 + c2; //nth n = 2 
	}
	
	private static int fibIter(int n) {
		int[] cache = new int[n + 1];
		cache[0] = 0;
		cache[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			int c1 = cache[i - 1];
			int c2 = cache[i - 2];
			
			cache[i] = c1 + c2;
		}
		
		return cache[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] cache = new int[n + 1];
		Arrays.fill(cache, -1);
	}

}

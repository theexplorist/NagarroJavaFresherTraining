package com.nagarro.codingblocks.java.day3;

import java.util.Arrays;

public class ClimbingStairs {
	
	private static int ways(int n, int[] cache) {
		// TODO Auto-generated method stub
		
		if(n == 0) {
			return 1;
		}
		
		if(n < 0) {
			return 0;
		}
		
		if(cache[n] != -1) {
			return cache[n];
		}
		
		int c1 = ways(n - 1, cache);
		int c2 = ways(n - 2, cache);
		
		return cache[n] = c1 + c2;
	}
	
	private static int waysIter(int n) {
		// TODO Auto-generated method stub
		int[] cache = new int[n + 1];
		cache[0] = 1;
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
		int n = 3;
		int[] cache = new int[n + 1];
		Arrays.fill(cache, -1);
		System.out.println(ways(3, cache));
	}

}

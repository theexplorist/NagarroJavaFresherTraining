package com.nagarro.codingblocks.java.day3;

import java.util.Arrays;

public class HouseRobber {
	
	private static int rec(int[] arr, int n, int[] cache) {
		// TODO Auto-generated method stub
		
		if(n <= 0) {
			return 0;
		}
		
		if(cache[n] != -1) {
			return cache[n];
		}
		
		int c1 = arr[n - 1] + rec(arr, n - 2, cache);
		int c2 = rec(arr, n - 1, cache);
		
		return cache[n] = Math.max(c1, c2);
	}
	
	private int iter(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}
		int[] cache = new int[n + 1];
		Arrays.fill(cache, -1);
		
		cache[0] = 0;
	    cache[1] = arr[0];
	    
	    for(int i = 2; i <= n; i++) {
	    	int c1 = arr[i - 1] + cache[i - 2];
	    	int c2 = cache[i - 1];
	    			
	    	cache[i] = Math.max(c1, c2);
	    }
	    
	    return cache[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 1};
		int n = 4;
		int[] cache = new int[n + 1];
		Arrays.fill(cache, -1);
		System.out.println(rec(arr, n, cache));
	}

}

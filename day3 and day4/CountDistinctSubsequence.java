package com.nagarro.codingblocks.java.day3;

import java.util.Arrays;

public class CountDistinctSubsequence {

	public static int numDistinct(String s, String t, int n, int m, int[][] dp) {

		if (m == 0) { // amount equivalent
			return 1;
		}

		if (n == 0) {// Coins array
			return 0;
		}

		if (dp[n][m] != -1) {
			return dp[n][m];
		}
		int inc = 0, exc = 0;
		if (s.charAt(n - 1) == t.charAt(m - 1)) {
			inc = numDistinct(s, t, n - 1, m - 1, dp);
		}

		exc = numDistinct(s, t, n - 1, m, dp);

		return dp[n][m] = inc + exc;
	}
	
	private static int iter(String s, String t, int n, int m) {
		// TODO Auto-generated method stub
		if (m == 0) { // amount equivalent
			return 1;
		}

		if (n == 0) {// Coins array
			return 0;
		}
		
		int[][] dp = new int[n + 1][m + 1];
		
		for(int row = 0; row <= n; row++) {
			dp[row][0] = 1;
		}
		
		for(int col = 1; col <= m; col++) {
			dp[0][col] = 0;
		}
		
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= m; col++) {
				int inc = 0, exc = 0;
				if(s.charAt(row - 1) == t.charAt(col - 1)) {
					inc = dp[row - 1][col - 1];
				}
				
				exc = dp[row - 1][col];
				
				dp[row][col] = inc + exc;
			}
		}
		return dp[n][m];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babgbag";
		String t = "bag";
		int n = s.length();
		int m = t.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(numDistinct(s, t, n, m, dp));
	}

}

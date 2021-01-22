package com.nagarro.codingblocks.java.day3;

import java.util.Arrays;

public class CoinChangeWays {

	private static int ways(int[] coins, int amount, int n, int[][] dp) {
		// TODO Auto-generated method stub

		if (amount == 0) {
			return 1;
		}

		if (n == 0) {
			return 0;
		}

		if (dp[n][amount] != -1) {
			return dp[n][amount];
		}

		int inc = 0, exc = 0;

		if (coins[n - 1] <= amount) {
			inc = ways(coins, amount - coins[n - 1], n, dp);
		}

		exc = ways(coins, amount, n - 1, dp);

		return dp[n][amount] = inc + exc;
	}

	private static int iter(int[] coins, int amount, int n) {
		// TODO Auto-generated method stub

		if (amount == 0) {
			return 1;
		}

		if (n == 0) {
			return 0;
		}

		int[][] dp = new int[n + 1][amount + 1];

		for (int row = 0; row <= n; row++) {
			dp[row][0] = 1;
		}

		for (int col = 1; col <= amount; col++) {
			dp[0][col] = 0;
		}
		for (int row = 1; row <= n; row++) {// n represent
			for (int col = 1; col <= amount; col++) {// amount represent
				int inc = 0, exc = 0;
				if (coins[row - 1] <= col) {
					inc = dp[row][col - coins[row - 1]];
				}

				exc = dp[row - 1][col];
				dp[row][col] = inc + exc;
			}
		}

		return dp[n][amount];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int n = coins.length;
		int amount = 5;
		int[][] dp = new int[n + 1][amount + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(ways(coins, amount, 3, dp));
	}

}

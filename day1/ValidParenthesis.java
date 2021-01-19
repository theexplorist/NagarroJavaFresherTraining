package com.nagarro.codingblocks.java.day1;

public class ValidParenthesis {

	private static void printValid(int n, int op, int cl, String ans) {
		// TODO Auto-generated method stub

		if (op == n && cl == n) {
			System.out.println(ans);
			return;
		}

		if (op < n) {
			printValid(n, op + 1, cl, ans + '(');
		}

		if (op > cl) {
			printValid(n, op, cl + 1, ans + ')');
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printValid(3, 0, 0, "");
	}

}

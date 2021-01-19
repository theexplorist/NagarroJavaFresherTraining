package com.nagarro.codingblocks.java.day1;

public class PrintPartition {

	private static boolean isPalin(String part) {
		// TODO Auto-generated method stub
		int i = 0, j = part.length() - 1;

		while (i < j) {
			if (part.charAt(i) == part.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}

		return true;
	}

	private static void printPartition(String inp, String out) {
		// TODO Auto-generated method stub

		if (inp.length() == 0) {

			System.out.println(out);
			return;
		}

		for (int i = 1; i <= inp.length(); i++) {
			// Recursive call
			if (isPalin(inp.substring(0, i)))
				printPartition(inp.substring(i), out + inp.substring(0, i) + "|");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPartition("nitin", "");
	}

}

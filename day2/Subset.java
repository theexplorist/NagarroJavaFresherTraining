package com.nagarro.codingblocks.java.day2;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	private static void printSubset(int[] arr, String subset, int vidx) {
		// TODO Auto-generated method stub

		if (vidx == arr.length) {
			System.out.println(subset);
			return;
		}

		printSubset(arr, subset, vidx + 1);// Exc
		printSubset(arr, subset + arr[vidx], vidx + 1); // Inc
	}

	// 78. Subsets Leetcode
	private static void printSubset(int[] arr, List<Integer> temp, List<List<Integer>> ans, int vidx) {
		// TODO Auto-generated method stub

		if (vidx == arr.length) {
			List<Integer> subset = new ArrayList<>(temp);
			ans.add(subset);
			return;
		}

		temp.add(arr[vidx]); // Element include
		printSubset(arr, temp, ans, vidx + 1);
		temp.remove(temp.size() - 1);// Wapis return to backtracking
		printSubset(arr, temp, ans, vidx + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> res = new ArrayList<>();
		printSubset(arr, new ArrayList<>(), res, 0);
		System.out.println(res);
	}

}

package com.nagarro.codingblocks.java.day5;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo {
	
	private static int[] stockSpan(int[] height, int n) {
		// TODO Auto-generated method stub
		int[] span = new int[n];
		span[0] = 1;
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		for(int curr = 1; curr < n; curr++) {
			while(!st.isEmpty() && height[st.peek()] < height[curr]) {
				st.pop();
			}
			
			span[curr] = st.isEmpty() ? curr + 1 : curr - st.peek();
			st.push(curr);
		}
		
		return span;
	}
	
	private static void NGE(int[] arr, int n) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		
		for(int i = 1; i < n; i++) {
			while(!st.isEmpty() && st.peek() < arr[i]) {
				System.out.println(st.pop() + "->" + arr[i]);
			}
			st.push(arr[i]);
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop() + "->" + -1);
		}
	}
	
	private static int[] NGE2(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[]nGE = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		for(int i = 1; i < n; i++) {
			while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
				nGE[st.pop()] = arr[i];
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			nGE[st.pop()] = -1;
		}
		
		return nGE;
	}

	private static void formMin(String inp) { //DD
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i <= inp.length(); i++) {
			st.push(i + 1);
			
			if(i == inp.length() || inp.charAt(i) == 'I') {
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {84, 80, 60, 70, 60, 75, 85};
//		int[] arr = {11, 13, 21, 3};
//		int[] nGE = NGE2(arr, 4);
//		for(int i = 0; i < 4
//				; i++) {
//			System.out.println(arr[i] + "->" + nGE[i]);
//		}
		
		//System.out.println(Arrays.toString(stockSpan(arr, 7)));	
		formMin("DI");
	}

}

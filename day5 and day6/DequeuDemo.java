package com.nagarro.codingblocks.java.day5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DequeuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 2, 5, 7, 8};
		int k = 3;
		Deque<Integer> dq = new ArrayDeque<>();
		List<Integer> res = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			
			//Monotonic dec 
			while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
				dq.removeLast();
			}
			
			dq.addLast(i);
			
			//Unwanted removal
			if(dq.getFirst() == i - k) {
				dq.removeFirst();
			}
			
			//Max of a window
			if(i >= k - 1) {
				res.add(nums[dq.getFirst()]);
			}
		}
		
		System.out.println(res);
	}

}

package com.nagarro.codingblocks.java.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static  int[] twoSum(int[] nums, int target) {
		
		if(nums == null || nums.length < 2) {
			return new int[2];
		}
		
		Map<Integer, Integer> map = new HashMap<>();//nums[i], i
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
	
		for(int curr = 0; curr < nums.length; curr++) {
			int search = target - nums[curr];
			
			if(map.containsKey(search) && curr != map.get(search)) {
				int[] arr = new int[2];
				arr[0] = curr;
				arr[1] = map.get(search);
				return arr;
			}
		}
		System.out.println(map);
		return new int[2];
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 3};
		
		int[] arr = new int[] {1, 2};
		System.out.println(Arrays.toString(arr));
		twoSum(nums, 6);
	}
}

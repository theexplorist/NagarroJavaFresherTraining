package com.nagarro.codingblocks.java.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		
		Set<List<Integer>> ansSet = new HashSet<>();
		for(int curr1 = 0; curr1 <= nums.length - 2; curr1++) {
			Set<Integer> subSet = new HashSet<>();
			
			for(int curr2 = curr1 + 1; curr2 < nums.length; curr2++) {
				int a = -(nums[curr1] + nums[curr2]);
				
				if(subSet.contains(a)) {
					List<Integer> subList = new ArrayList<>();
					subList.add(a);
					subList.add(nums[curr1]);
					subList.add(nums[curr2]);
					Collections.sort(subList);
					ansSet.add(subList);
				} else {
					subSet.add(nums[curr2]);
				}
			}
		}
		
		List<List<Integer>> ansList = new ArrayList<>(ansSet);
		return ansList;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		threeSum(nums);
	}
}

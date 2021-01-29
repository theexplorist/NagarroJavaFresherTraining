package com.nagarro.codingblocks.java.day7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 3};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int n = nums.length / 2;
		int ans = 0;
		for(int key : map.keySet()) {
			int value = map.get(key);
			if(value > n) {
				ans = key;
				break;
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			if(entry.getValue() > n) {
				ans = entry.getKey();
				break;
			}
		}
		
		for(int value : map.values()) {
			System.out.println(value);
		}
			
		System.out.println(ans);
	}

}

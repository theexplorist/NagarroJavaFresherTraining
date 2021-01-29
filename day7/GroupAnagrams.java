package com.nagarro.codingblocks.java.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	/*
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String, List<String>> res = new HashMap<>();
		
		//"eat","tea","tan","ate","nat","bat"
		for(String str : strs) {
			char[] ar = str.toCharArray();
			Arrays.sort(ar);
			String key = String.valueOf(ar);
			
			List<String> list = res.getOrDefault(key, new ArrayList<>());
			list.add(str);
			res.put(key, list);
		}
		
		for(List<String> l : res.values()) {
			System.out.println(l);
		}
		
		return null;
	}
	*/
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String, List<String>> res = new HashMap<>();
		
		int[] count = new int[26];
		//"eat","tea","tan","ate","nat","bat"
		for(String str : strs) {
			Arrays.fill(count, 0);
			for(int i = 0; i < str.length(); i++) {
				count[str.charAt(i) - 'a']++;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int counter : count) {
				sb.append("#");
				sb.append(counter);
			}
			
			String key = sb.toString();
			List<String> list = res.getOrDefault(key, new ArrayList<>());
			list.add(str);
			res.put(key, list);
		}
		
		for(List<String> l : res.values()) {
			System.out.println(l);
		}
		
		return new ArrayList<>(res.values());
	}
}

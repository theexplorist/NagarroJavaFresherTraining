package com.nagarro.codingblocks.java.day2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.remove(list.size() - 1);

		System.out.println(list);
		List<Integer> list2 = new ArrayList<>(list);
		list2.add(4);
		System.out.println(list2);

		List<List<Integer>> bigList = new ArrayList<>();
		bigList.add(list);
		bigList.add(list2);
		System.out.println(bigList);

		list.add(6);
		System.out.println(list);
		System.out.println(bigList);
	}

}

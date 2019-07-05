package com.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NumberList {

	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		
		System.out.println("\nSorted Map");
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(map);
		printMap(treeMap);
			
	  }
		
	  public static void printMap(Map<Integer, Integer> map){

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Number : " + entry.getKey() + " Count : "
				+ entry.getValue());
		}
			
	  }

}

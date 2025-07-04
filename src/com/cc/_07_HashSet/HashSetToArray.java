package com.cc._07_HashSet;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<>();
		set.add("Red");
		set.add("Green");
		set.add("Blue");
		set.add("Black");
		set.add("Orange");
		set.add("Yellow");
		System.out.println(set);
		
		String[] array= set.toArray(new String[0]);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		

	}

}

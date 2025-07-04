package com.cc._04_HashSet;

import java.util.HashSet;

public class emptyHashSet {

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
		System.out.println("Empty HashSet: ");
		set.clear();
		System.out.println(set);
		

	}

}

package com.cc._06_HashSet;

import java.util.HashSet;

public class clone {

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
		
		@SuppressWarnings("unchecked")
		HashSet<String> clonedHashSet= (HashSet<String>) set.clone();
		System.out.println(clonedHashSet);
		
		

	}

}

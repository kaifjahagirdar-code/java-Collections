package com.cc._10_HashSet;

import java.util.HashSet;

public class CompareHashSets {

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
		
		HashSet<String> set2= new HashSet<>();
		set2.add("Black");
		set2.add("Pink");
		System.out.println(set2);
		
		if(set.equals(set2)) {
			System.out.println("Both HashSets are equal");
		}else {
			System.out.println("HashSets are not equal");
		}

	}

}

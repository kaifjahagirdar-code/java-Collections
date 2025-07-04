package com.cc._11_HashSet;

import java.util.HashSet;

public class RetainSimilarElements {

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
		set2.add("Pink");
		set2.add("Green");
		set2.add("Brown");
		set2.add("Grey");
		set2.add("Yellow");
		System.out.println(set2);
		
		set.retainAll(set2);
		System.out.println("Retained Elements: "+set);
		
		


	}

}

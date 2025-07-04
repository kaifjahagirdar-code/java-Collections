package com.cc._12_HashSet;

import java.util.HashSet;

public class removeAll {

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
		
		set.removeAll(set);
		System.out.println(set);

	}

}

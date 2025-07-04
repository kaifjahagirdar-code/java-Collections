package com.cc._09_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {

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
		
		ArrayList<String> list= new ArrayList<>(set);
		System.out.println(list);

	}

}

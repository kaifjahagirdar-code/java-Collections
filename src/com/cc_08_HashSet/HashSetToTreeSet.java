package com.cc_08_HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {

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
		
		TreeSet<String> treeSet= new TreeSet<>(set);
		System.out.println("TreeSet: "+treeSet);

	}

}

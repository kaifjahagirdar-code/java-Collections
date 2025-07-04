package com.cc._01_HashSet;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set= new HashSet<>();
		set.add(10);
		set.add(10);
		set.add('A');
		set.add("A");
		set.add(true);
		set.add(10.25);
		set.add(null);
		System.out.println(set);

	}

}

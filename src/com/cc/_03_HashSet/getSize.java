package com.cc._03_HashSet;

import java.util.HashSet;

public class getSize {

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
		System.out.println("The size of the HashSet is= "+ set.size());


	}

}

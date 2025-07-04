package com.cc._15_ArrayList;

import java.util.ArrayList;

public class TrimToCurrentListSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>(10);
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		list.trimToSize();
		System.out.println(list);

	}

}

package com.cc._03_ArrayList;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		list.add(0,"Pink");
		System.out.println(list);

	}

}

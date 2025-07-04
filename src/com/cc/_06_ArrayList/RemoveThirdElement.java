package com.cc._06_ArrayList;

import java.util.ArrayList;

public class RemoveThirdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);

	}

}

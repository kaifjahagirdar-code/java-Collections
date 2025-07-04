package com.cc._14_ArrayList;

import java.util.ArrayList;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		if(list.isEmpty()) {
			System.out.println("The Given List is Emty");
		}else {
			System.out.println("The Given list is Not Empty");
		}

	}

}

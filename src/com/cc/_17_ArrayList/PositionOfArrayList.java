package com.cc._17_ArrayList;

import java.util.ArrayList;

public class PositionOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("Element at index "+i+"="+list.get(i));
			
		}

	}

}

//WAP to Join Two ArrayList
package com.cc._11_ArrayList;

import java.util.ArrayList;

public class JoinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		ArrayList<String> list2= new ArrayList<>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Pink");
		list2.add("Black");
		
		list1.addAll(list2);
		System.out.println(list1);

	}

}

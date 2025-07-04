//WAP to RETRIEVE an element (from a SPECIFIED INDEX) from a given ArrayList.
package com.cc._04_ArrayList;

import java.util.ArrayList;

public class RetrieveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		String s1= list.get(0);
		System.out.println(s1);
		}

}

//8.WAP to COPY ONE ARRAYLIST INTO ANOTHER
package com.cc._08_ArrayList;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		System.out.println("Elements: "+list1);
		
		ArrayList<String> list2= new ArrayList<>();
		list2.addAll(list1);
		
		System.out.println("Copied Elements: "+list2);

	}

}

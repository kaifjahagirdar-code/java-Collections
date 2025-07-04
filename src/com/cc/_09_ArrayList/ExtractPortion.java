//9.WAP to EXTRACT A PORTION OF AN ARRAYLIST.
package com.cc._09_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		List<String> sublist= list1.subList(0,3);
		System.out.println("List: "+list1);
		System.out.println("Extracted Portion: "+sublist);
		
		}

}

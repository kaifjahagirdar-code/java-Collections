//10.	WAP to compare two ArrayList.
package com.cc._10_ArrayList;

import java.util.ArrayList;

public class CompareArrayList {

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
		list2.add("Orange");
		list2.add("Pink");
		list2.add("Black");
		
		ArrayList<String> result= new ArrayList<>();
		
		for(int i=0;i<list1.size();i++) {
		if(list1.get(i).equals(list2.get(i))) {
			result.add("Yes");
		}else {
			result.add("No");
		}
		
		}
		System.out.println(result);

	}

}

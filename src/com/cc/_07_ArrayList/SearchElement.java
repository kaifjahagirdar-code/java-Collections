//WAP to SEARCH AN ELEMENT in an ArrayList.
package com.cc._07_ArrayList;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list= new ArrayList<>();
        list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		String element= "Green";
		
		if(list.contains(element))
		{
			System.out.println(element+"- Element Found at Index "+list.indexOf(element));
		}else {
			System.out.println("No Element Found");
		}
	}

}

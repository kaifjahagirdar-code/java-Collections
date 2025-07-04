//WAP to clone an ArrayList to another ArrayList.
package com.cc._12_ArrayList;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		@SuppressWarnings("unchecked")
		ArrayList<String> clonedList = (ArrayList<String>) list1.clone();

        // Print both lists
        System.out.println("Original List: " + list1);
        System.out.println("Cloned List:   " + clonedList);

	}

}

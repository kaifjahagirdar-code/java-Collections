//5.WAP to UPDATE SPECIFIC ELEMENT by given element.
package com.cc._05__ArrayList;

import java.util.ArrayList;

public class UpdateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Black");
		System.out.println(list);
		list.set(0, "Pink");
		System.out.println(list);

	}

}

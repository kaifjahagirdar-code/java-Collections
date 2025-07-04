//2.	WAP to ITERATE through all elements & MULTIPLY BY 2 in an ArrayList.
package com.cc_02_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MultiplyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		Iterator<Integer> iterator= list.iterator();
		int index=0;
		while(iterator.hasNext()) {
			int value= list.get(index);
			list.set(index, value*2);
			iterator.next();
			index++;
		}
		System.out.println("Arraylist after Multiplying by 2 :"+list);
		

	}

}

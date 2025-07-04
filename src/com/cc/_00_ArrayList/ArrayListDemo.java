package com.cc._00_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list1= new ArrayList<>();
		list1.add(10);
		list1.add(10.25);
		list1.add("10");
		list1.add(true);
		System.out.println(list1);
		
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
//		list2.addAll(list1);
//		System.out.println(list2);
		
//      Contains Specific Element in th ArrayList
		System.out.println("Does the List contains given Element= "+list1.contains(10));
		
//      Contains all Elements of list
		System.out.println("Does list1 contains all the elements of list 2= "+ list1.containsAll(list2));
		
//      AutoBoxing= Converting primitive type of data to object(wrapper Class)
		int i= 10;
		System.out.println("Does list1 contains element= "+list1.contains(i));
		
//      AutoUnboxing= Converting object(wrapper Class) to primitive data
		int i1= new Integer(i);
		System.out.println("list 1 contains List 2= "+ list1.contains(i1));
		
//      Retain all elements of list2 
		list1.retainAll(list2);
		System.out.println("Retained elements of list 1 are= "+list1);
		
//      To convert list into array
		
		Object[] array= list1.toArray();
        for(Object obj: array) {
        	
        }
        list1.clear();
        System.out.println("Clear Everything= "+ list1);
        
//      To add new employee
        list1.add(new Employee(107, "Kaif", 1000000000000000000.25));
        System.out.println(list1);
		
		}

}

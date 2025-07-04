package com.cc._02_LinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyLinkedListDemo list= new MyLinkedListDemo();
		  list.add(10);
		  list.add(20);
		  list.add(30);
		  list.add(40);
		  list.add(50);
		  list.printList();
		  
		  System.out.println("Size of the list= "+list.size());
		  
		  System.out.println("Adding elemenet at the first index= ");
		  list.addFirst(5);
		  list.printList();
		  
		  System.out.println("To check if the list contains given element= ");
		  System.out.println(list.contains(100));
		  
		  list.reverse();
		  list.printList();
		  
		  list.update(2, 33);
		  list.printList();
		  
		  list.deleteAtLast();
		  list.printList();
		  
		  
	}

}

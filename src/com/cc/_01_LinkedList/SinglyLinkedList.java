package com.cc._01_LinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  SinglyLinkedListDemo list= new SinglyLinkedListDemo();
	  list.add(10);
	  list.printList();
	  list.add(20);
	  list.printList();
	  list.add(30);
	  list.printList();
	  list.add(40);
	  list.add(50);
	  list.printList();
	  list.addFirst(0);
	  System.out.println("Add at First index= ");
	  list.printList();
	  System.out.println("Size of the list= "+list.sizeList());
	  System.out.println("Check if the list has the given element= ");
	  if(list.contains(20)) {
		  System.out.println("True");
	  }else {
		  System.out.println("False");
	  }
	  System.out.println("Adding elements in the list");
	  list.addAtIndx(2, 30);
	  list.printList();
	  System.out.println("Deleting any element in the list");
	  list.delete(30);
	  list.printList();
	  System.out.println("Find middle element");
	  System.out.println(list.middleElement());
	  
	
	  Node current = list.head;
	  while(current.next != null) {
		  current= current.next;
	  }
	  current.next = list.head;
	  System.out.println("Is it circular = "+ list.iscircularList());
	  
	  
	 // list.reverseList();

     // System.out.println("Reversed list:");
      
	  
	  
	}	 
}

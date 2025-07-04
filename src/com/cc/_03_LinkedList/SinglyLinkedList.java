package com.cc._03_LinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSinglyLinkedList list= new DemoSinglyLinkedList();
		list.add("Red");
		list.print();
		list.add("Green");
		list.print();
		list.add("Black");
		list.print();
		list.add("White");
		list.print();
		list.add("Pink");
		list.print();
		list.add("Yellow");
		list.print();
		
		System.out.println("Iterate over a List: ");
		list.iterate();
		
		System.out.println("Iterate while printing Index: ");
		list.iterateWithIndex();
		
		System.out.println("Iterate From given positions: ");
		list.iterateFromPosition(2);
		
		list.addAtSpecifiedPosition(2,"Pink");
		list.print();
		
		list.addFirstLast("Maroon","Purple");
		list.print();
		
		list.addFirst("Chocalate");
		list.print();
		
		list.addLast("Biscuit");
		list.print();
		
		list.addAll(3, "Blacky");
		list.addAll(4, "Whity");
		list.print();
		
		list.removeFirstLast();
		list.print();
		
		list.clear();
		list.print();
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		list.add("Yellow");
		list.print();
		
		/*list.swap("Red", "Green");
		list.print();*/
		
		/*list.addList("RED");
		list.print();*/
		
		DemoSinglyLinkedList original = new DemoSinglyLinkedList();
        original.add("Yellow");
        original.add("Green");
        original.add("Black");

        System.out.print("Original List: ");
        original.print();

        System.out.print("Cloned List: ");
        original.clonedList();
        original.print();
        
        if (list.isEmpty()) {
            System.out.println("LinkedList is empty.");
        } else {
            System.out.println("LinkedList is not empty.");
        }
        
        
	}
	
	    
  
}

package com.cc._03_LinkedList;

import java.util.Iterator;

public class DemoSinglyLinkedList {
	
	Node head = null;
	public void add(String data) {
		Node newNode= new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current= current.next;
			}
			current.next= newNode;
		}
	}
	public void print() {
		Node current= head;
		while(current!= null) {
			System.out.print(current.data+"-->");
			current= current.next;
		}
		System.out.println("null");
		
	}
	public void iterate() {
		 Node current = head;
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
        }
	public void iterateWithIndex() {
		Node current = head;
	    int index = 0;
	    while (current != null) {
	        System.out.println("Index " + index + ": " + current.data);
	        current = current.next;
	        index++;
	    }
	 
	}
	public void iterateFromPosition(int startIndex) {
		 Node current = head;
		 int index=0;
		 while(current != null && startIndex > index) {
			 current = current.next;
			 index++;
		 }
		 if(head == null) {
			 System.out.println("List doesn't contain any elements");
		 }
		while(current != null) {
			System.out.println("Index "+index+" "+current.data);
			current= current.next;
			index++;
		}
		 
	 }
     public void addAtSpecifiedPosition(int index, String element) {
    	 Node newNode= new Node(element);
    	 Node current= head;
    	 int count=0;
    	 while(current != null && count<index-1) {
    		 current= current.next;
    		 count++;
    	 }
    	 if(current == null) {
    		 System.out.println("Index out of bounds");
    		 return;
    	 }
    	 newNode.next=current.next;
    	 current.next= newNode;
		
	}
     public void addFirstLast(String element1, String element2) {
    	 Node firstNode= new Node(element1);
    	 firstNode.next = head;
    	 head =firstNode;
    	 
    	 Node lastNode = new Node(element2);
    	 Node current= head;
    	 while (current.next != null) {
    	        current = current.next;
    	    }

    	    current.next = lastNode;
    	}
     public void addFirst(String element) {
    	 Node newNode= new Node(element);
    	 newNode.next = head;
    	 head= newNode;
     }
     public void addLast(String element) {
    	 Node newNode= new Node(element);
    	 Node current= head;
    	 while(current.next != null) {
    		 current= current.next;
    		 
    	 }
    	 if(current.next == null) {
    		 current.next= newNode;
    	 }
     }
     public void addAll(int index, String element) {
    	 Node newNode= new Node(element);
    	 Node current= head;
    	 
    	 int count=0;
    	 while(current != null && count<index-1) {
    		 current =current.next;
    		 count++;
          }
    		 newNode.next=current.next;
        	 current.next= newNode;
    	 
     }
     public void removeFirstLast() {
    	Node current= head;
    	head= head.next;
    	
    	if(head== null) {
    		System.out.println("list is empty");
    		return;
    	}
    	while(current.next.next != null) {
    		current= current.next;
    	}
    	current.next= null;
    		
    	}
     
     public void clear() {
    	  head= null;
     }
     
     /*public void swap(String element1, String element2) {
    	 Node current= head;
    	 Node previous= null;
    	 while(current != null && current.data != element1) {
    		 previous= current;
    		 current= current.next;
    		 
    	 }
    	 
    	 }*/
     /*public void addList(SinglyLinkedList otherList) {
    	 Node current = this.head;
    	    while (current.next != null) {
    	        current = current.next;
    	    }
    	    current.next = otherList.head;
    	}*/
     
     public void clonedList() {
    	    DemoSinglyLinkedList list1 = new DemoSinglyLinkedList();

    	    Node current = head;
    	    while (current != null) {
    	        list1.add(current.data);  // deep copy of each node's data
    	        current = current.next;
    	    }
	 
     }
     public boolean isEmpty() {
    	 if(head== null) {
		     return true;
    	 }else {
    		 return false;
    	 }
   	  
     }
     public boolean compareList(DemoSinglyLinkedList otherList) {
    	    Node current1 = this.head;
    	    Node current2 = otherList.head;

    	    while (current1 != null && current2 != null) {
    	        if (!current1.data.equals(current2.data)) {
    	            return false; // Found mismatch
    	        }
    	        current1 = current1.next;
    	        current2 = current2.next;
    	    }

    	    // Both should end at same time
    	    return current1 == null && current2 == null;
    	}
}
     
     
	



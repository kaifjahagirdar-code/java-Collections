package com.cc._01_LinkedList;

public class SinglyLinkedListDemo {
	
	Node head= null;

	public void add(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head= newNode;
		}else {
			Node current= head;
			while(current.next != null) {
				current= current.next;
			}
			current.next= newNode;
			}
		}
	public void printList() {
		Node current= head;
		while(current != null) {
			System.out.print(current.data+"->");
			current= current.next;
		}
		System.out.println("null");
		
	}
	public void addFirst(int data) {
		Node newNode= new Node(data);
		newNode.next = head;
		head= newNode;
	}
	
	public int sizeList() {
		int count=0;
		Node current= head;
		
		while(current!= null) {
			count++;
			current= current.next;
		}
		return count;
	}
	
	public boolean contains(int element) {
		Node current= head;
		while(current != null) {
		if(current.data == element) {
			return true;
		}
		current=current.next;
		}
		return false;
		}
		
     public void addAtIndx(int index, int data) {
    	 Node current= head;
    	 Node newNode= new Node(data);
    	 
    	 if(index<0) {
    		 throw new IllegalArgumentException();
    	 }else if(index>sizeList()+1) {
    		 throw new IllegalArgumentException();
    	 }else if(index==0){
    		 addFirst(data);
    	 }else if(index == sizeList()+1) {
    		 add(data);
    	 }else {
    		 int count=0;
    		 while(current != null) {
    			 Node temp= current.next;
    			 if(count == index-1) {
    				 current.next = newNode;
    				 newNode.next= temp;
    			 }
    			 count++;
    			 current = current.next;
    		 }
    	 }
 
    	
       }
         public void delete(int element) {
    	 
    	 if(head== null) {
    		 return;
    	 }
    	 if(head.data == element) {
    	    head= head.next;
    		 return;
    	 }
    	 
    	 Node current = head;
    	 while(current.next!= null && current.next.data != element) {
    		 current= current.next;
    	 }
    	 if(current.next != null) {
    		 current.next= current.next.next;
    	 }
    	 
    	 }
         
         public int middleElement() {
        	 Node fast=head;
        	 Node slow= head;
        	 while(fast.next != null && fast.next.next != null) {
        		 slow= slow.next;
        		 fast= fast.next.next;
        	 }
			return slow.data;
        	 
        	 
         }
         public boolean iscircularList() {

        	    if (head == null) {
        	        return false;
        	    }
        	    Node fast = head;
        	    Node slow = head;
        	    while (fast.next != null && fast.next.next != null) {
        	        slow = slow.next;
        	        fast = fast.next.next;
        	        if (slow == fast) {
        	            return true;  
        	        }
        	    }

        	    return false;  
        	}
         
         public void reverseList() {
        	 Node current= head;
        	 Node next = null;
        	 Node prev = null;
        	 
        	 while(current != null) {
        		 next = current.next;
        		 current.next = prev;
        		 prev = current;
        		 current = next;
        	 }
        	 head= prev;
        		 
        	 }
         }


package com.cc._02_LinkedList;

public class MyLinkedListDemo {
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
//			if(current != null) {
				current.next= newNode;
				newNode.prev= current;
//			}
	}
	}
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+ "-->");
			current= current.next;
		}
		System.out.println("null");
		
	}
	public int size() {
		Node current= head;
		int count=0;
		while(current != null) {
			current= current.next;
			count++;
		}
		return count;
	}
	public void addFirst(int data) {
		Node newnode= new Node(data);
		if(head== null) {
			head = newnode;
		}else {
			head.prev = newnode;
			newnode.next= head;
			head= newnode;
		}
		
	}
	public boolean contains(int element) {
		Node current = head;
		while(current != null) {
			if(current.data == element) {
				return true;
			}
			current= current.next;
		}
		return false;
		
	}
	public void reverse() {
		Node current =head;
		Node next= null;
		Node prev= null;
		
		while(current.next != null) {
			 next = current.next;
    		 current.next = prev;
    		 prev = current;
    		 current = next;
    	 }
    	 head= prev;
		}
	
	
	public void update(int index, int element) {
		if(index<0) {
			throw new IllegalArgumentException();
		}
		Node current= head;
		int i=0;
		while(current != null && i<index) {
			current = current.next;
			i++;
			}
		current.data= element;
	}
	
	
	 public void deleteAtLast() {
		Node current= head;
		
		while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }
		
	}




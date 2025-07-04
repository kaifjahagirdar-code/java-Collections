package com.cc._04_LinkedList;

public class DemoDoublyLinkedList {
	Node head= null;
	
	public void add(String data) {
		Node newNode= new Node(data);
		if(head== null) {
			head= newNode;
		}else {
			Node current= head;
			while(current.next != null) {
				current = current.next;
			}
			current.next= newNode;
			newNode.prev= current;
		}
	}
	public void print() {
		Node current= head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current= current.next;
		}
		System.out.println("null");
	}
	public void reverse() {
		Node current= head;
		while(current.next !=null) {
			current= current.next;
		}
		while(current != null) {
			System.out.print(current.data+"-->");
			current= current.prev;
		}
		System.out.println("null");
	}

}

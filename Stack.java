package com.capgemini.linkedlist;

public class Stack<K> {
	private MyLinkedList myLinkedList;
	
	public Stack() {
		myLinkedList = new MyLinkedList<>();
	}
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}
	
	public INode pop() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

}

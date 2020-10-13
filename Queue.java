package com.capgemini.linkedlist;

public class Queue<K> {
	private MyLinkedList myLinkedList;

	public Queue() {
		myLinkedList = new MyLinkedList<>();
	}

	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}

	public INode dequeue() {
		return myLinkedList.pop();
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	
}

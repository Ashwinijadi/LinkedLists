package com.capgemini.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersAddedFromTopTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
		myLinkedList.printMyNodes();
	}

	@Test
	public void given3NumbersAppendedFromLastTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenThreeNumbersInsertingSecondIntegerTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode, secondNode);
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
		myLinkedList.printMyNodes();
	}

	@Test
	public void deletingFirstElementTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(secondNode) && myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void deletingLastElementTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		myLinkedList.popLast();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.tail.equals(thirdNode);
		Assert.assertFalse(result);
	}

	@Test
	public void searchElementTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		MyNode<Integer> search = (MyNode<Integer>) myLinkedList.search(30);
		assertEquals(secondNode, search);
		myLinkedList.printMyNodes();
	}

	@Test
	public void searchAndInsertAtThirdNodeTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		myLinkedList.append(fourthNode);
		MyNode<Integer> search = (MyNode<Integer>) myLinkedList.searchAndInsert(30, fourthNode);
		assertEquals(secondNode, search);
		myLinkedList.printMyNodes();
	}

}

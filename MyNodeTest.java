package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	@Test
	public void givenThreeNumbersInLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mysecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mysecondNode);
		mysecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mysecondNode)
				&& myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

}

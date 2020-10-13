package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void given3NumbersAddedInStack() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		Stack stack = new Stack();

		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		Assert.assertEquals((int) firstNode.getKey(), 56);
	}

	@Test
	public void given3NumbersRemoveElementInStack() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		Stack stack = new Stack();

		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();

		INode removed = stack.pop();
		stack.printStack();
		INode removed1 = stack.pop();
		stack.printStack();
		INode removed2 = stack.pop();
		INode top1 = stack.peak();
		Assert.assertEquals(firstNode, removed2);
		Assert.assertEquals(null, top1);
	}
}

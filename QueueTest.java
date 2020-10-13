package com.capgemini.linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

	@Test
	public void given3NumbersAddedInQueue() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		Queue queue = new Queue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
		Assert.assertEquals((int) firstNode.getKey(), 70);

	}

}

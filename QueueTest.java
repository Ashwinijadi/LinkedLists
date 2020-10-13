package com.capgemini.linkedlist;

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

	@Test
	public void given3NumbersRemoveElementInQueue() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		Queue queue = new Queue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
		INode remove = queue.dequeue();
		queue.printQueue();
		INode remove1 = queue.dequeue();
		queue.printQueue();
		INode remove2 = queue.dequeue();
		Assert.assertEquals(thirdNode, remove2);
	}

}

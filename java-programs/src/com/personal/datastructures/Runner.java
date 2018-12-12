package com.personal.datastructures;

public class Runner 
{
public static void main(String[] args) {
		//linked list
		/*MyLinkedList list = new MyLinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		
		list.insertAtStart(25);
		
		list.insertAt(0, 55);
		
		list.deleteAt(2);
		list.show();
		//list.show();
*/		
		//stack
		
		MyStack nums = new MyStack();
		nums.push(15);
		nums.push(8);
		nums.push(10);
		nums.push(20);
		nums.push(11);
		nums.push(22);
		nums.push(1);
		nums.push(2);
		nums.push(3);
		nums.push(4);
		nums.push(5);
		
		nums.show();
		System.out.println();
		System.out.println(nums.size());
		System.out.println(nums.peek());
		System.out.println(nums.peek());
		System.out.println(nums.peek());
		System.out.println(nums.peek());
		
		//Queue
	/*MyQueue mq= new MyQueue();
	mq.enQueue(2);
	mq.enQueue(3);
	mq.enQueue(4);
	mq.enQueue(5);
	mq.show();*/
	}
}

package com.personal.datastructures;

/*
 /**
* This entire class is used to build a Binary Tree data structure.
* There is the BTNode Class and the Tree Class, both explained below.
*
* @author Unknown
*
*/


/**
* This class implements the BTNodes that will go on the Binary Tree.
* They consist of the data in them, the BTNode to the left, the BTNode
* to the right, and the parent from which they came from.
*
* @author Unknown
*
*/
public class BTNode{
	/** Data for the BTNode */
	public int data;
	/** The BTNode to the left of this one */
	public BTNode left;
	/** The BTNode to the right of this one */
	public BTNode right;
	/** The parent of this BTNode */
	public BTNode parent;

	/**
	* Constructor of BTNode
	*
	* @param value Value to put in the BTNode
	*/
	public BTNode(int value){
		data = value;
		left = null;
		right = null;
		parent = null;
	}
}

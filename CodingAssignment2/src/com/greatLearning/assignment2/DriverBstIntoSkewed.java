package com.greatLearning.assignment2;

import com.greatLearning.util.Node;

public class DriverBstIntoSkewed {

	public static void main(String[] args) {
		
		Node newNode = new Node(50);
		newNode.left = new Node(30);
		newNode.right = new Node(60);
		newNode.left.left = new Node(10);
		newNode.right.left = new Node(55);
		
		BstIntoSkewed b = new BstIntoSkewed();
		b.create(newNode);
		b.getSkewedTree();
	}
}

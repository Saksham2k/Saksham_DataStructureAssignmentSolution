package com.greatLearning.assignment2;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

import com.greatLearning.util.Node;
import com.greatLearning.util.BinaryTree;

public class BstIntoSkewed {
	
	private Node sroot = null;
	
	
	public void create(Node root) {
		
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
		BinaryTree bt = new BinaryTree();
		
		while(!stack.isEmpty() || temp!=null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				Node n = new Node(temp.data);
				sroot = bt.insertInBst(n);
				temp = temp.right;
			}
		}
	}
	
	public void getSkewedTree() {
		
		Queue<Node> q = new LinkedList<>();
		Node temp = sroot;
		
		if(temp == null) {
			System.out.println("0");
			return;
		}
		else {
			q.add(temp);
		}
		
		while(!q.isEmpty()) {
			temp = q.remove();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				q.add(temp.left);
			}
		
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		
	}
}

package com.greatLearning.util;

public class BinaryTree {
	
	private Node broot = null;
	

	public Node insertInBst(Node root){
		
		Node temp;
		Node tempTail;
		
		if(broot == null) {
			
			broot = root;
			return broot;
			
		}
		else {
			temp = broot;
			tempTail = temp;
			while(temp != null) {
				
				if(temp.data == root.data) {
					return broot;
				}
				else if(temp.data > root.data){
					
					tempTail = temp;
					temp = temp.left;
				}
				else {
					tempTail = temp;
					temp = temp.right;
				}
			}
			if(tempTail.data > root.data) {
				tempTail.left = root;
			}
			else {
				tempTail.right = root;
			}
		}	
		return broot;
	}
}

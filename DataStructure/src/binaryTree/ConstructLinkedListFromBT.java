package binaryTree;

import binaryTree.BinaryTreeFromInorderAndPreorder.Node;

public class ConstructLinkedListFromBT {
	Node root;
	static Node prev=null;
	static Node head=null;
	static int preIndex=0;
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	public ConstructLinkedListFromBT(int key){
		root=new Node(key);
	}
	
	public static void constructList(Node root){
		if(root==null)
			return;
		constructList(root.left);
		if(prev==null){
			root.left=prev;
			head=root;
		}
		else{
			root.left=prev;
			prev.right=root;
		}
		constructList(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

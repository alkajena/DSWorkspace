package binaryTree;

import binaryTree.LevelWithMaxNumberOfNode.Node;

public class FindMaxnMinInBT {
	Node root;
	static int max1=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	public FindMaxnMinInBT(int key){
		root=new Node(key);
	}
	
	public static void inOrderMax(Node root){
		if(root==null)
			return;
		inOrderMax(root.left);
		if(root.key>max1){
			max1=root.key;
		}
		inOrderMax(root.right);
	}
	
	public static void inOrderMin(Node root){
		if(root==null)
			return;
		inOrderMin(root.left);
		if(root.key<min){
			min=root.key;
		}
		inOrderMin(root.right);
	}
	public static void main(String[] args) {
		FindMaxnMinInBT max=new FindMaxnMinInBT(1);
		max.root.left=new Node(2);
		max.root.right=new Node(3);
		max.root.left.left=new Node(4);
		max.root.left.right=new Node(5);
		max.root.right.left=new Node(6);
		max.root.right.right=new Node(7);
		inOrderMax(max.root);
		System.out.println("max is :"+max1);
		inOrderMin(max.root);
		System.out.println("min is :"+min);
	}

}

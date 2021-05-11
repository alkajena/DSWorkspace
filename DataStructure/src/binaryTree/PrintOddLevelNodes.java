package binaryTree;

import binaryTree.SumTree.Node;

public class PrintOddLevelNodes {
	Node root;
	
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	public PrintOddLevelNodes(int key){
		root=new Node(key);
	}
	
	public static void print(Node root,boolean level){
		if(root==null)
			return;
		if(level==true)
			System.out.println(root.key);
		print( root.left,!level);
		print( root.right,!level);
	}
	
	public static void printInorder(Node root,boolean level){
		if(root==null)
			return;
		printInorder(root.left,!level);
		if(level)
			System.out.println(root.key);
		printInorder(root.right,!level);
	}
	public static void main(String[] args) {
		PrintOddLevelNodes st=new PrintOddLevelNodes(1);
		st.root.left=new Node(2);
		st.root.right=new Node(3);
		st.root.left.left=new Node(4);
		st.root.left.right=new Node(5);
		st.root.right.left=new Node(6);
		st.root.right.right=new Node(7);
		print(st.root,true);

	}

}

package binaryTree;

import binaryTree.MorrisTraversal.Node;

public class CheckBTIsSumTree {
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
	
	public CheckBTIsSumTree(int key){
		root=new Node(key);
	}
	public static int sum(Node node){
		if(node==null)
			return 0;
		return sum(node.left)+node.key+sum(node.right);
	}
	public static int sumTree(Node root){
		
		if(root==null || (root.left==null && root.right==null))
			return 1;
		
		int ls=sum(root.left);
		int rs=sum(root.right);
		
		if( (root.key==ls+rs) && sumTree(root.left)!=0 && sumTree(root.right)!=0)
			return 1;
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

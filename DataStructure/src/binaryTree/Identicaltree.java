package binaryTree;

import binaryTree.MorrisTraversal.Node;

public class Identicaltree {
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
	
	public Identicaltree(int key){
		root=new Node(key);
	}
	
	public static boolean check(Node root1,Node root2){
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		if(root1!=null && root2!=null){
			return root1.key==root2.key && check(root1.left,root2.left) && check(root1.right,root2.right);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

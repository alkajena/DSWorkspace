package binaryTree;

import binaryTree.BoundaryTraversal.Node;

public class CheckLeavesAreSameLevel {
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
	
	public CheckLeavesAreSameLevel(int key){
		root=new Node(key);
	}
	public static boolean checkUtil(Node root,int level,int d){
		if(root==null){
			return true;
		}
		if(root.left==null && root.right==null){
			if(d==level+1){
				return true;
			}
		}
		
		return checkUtil(root.left,level+1,d) && checkUtil(root.right,level+1,d);
	}
	public static boolean check(Node root){
		int level=0;
		int d=0;
		while(root!=null){
			d++;
			root=root.left;
		}
		
		return checkUtil(root,level,d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package binaryTree;

import binaryTree.SumTree.Node;

public class FindDeepestNode {
Node root;
static int max=Integer.MIN_VALUE;
static int level1=0;
static class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key){
		this.key=key;
		left=right=null;
	}
}

public FindDeepestNode(int key){
	root=new Node(key);
}

public static void deepestNode(Node root,int level){
	if(root==null)
		return;
	deepestNode(root.left,++level);
	if(level>level1){
		level1=level;
		max=root.key;
	}
	deepestNode(root.right,++level);	
}
	public static void main(String[] args) {
		FindDeepestNode st=new FindDeepestNode(1);
		st.root.left=new Node(2);
		st.root.right=new Node(3);
		st.root.left.left=new Node(4);
		st.root.left.right=new Node(5);
		st.root.right.left=new Node(6);
		st.root.right.right=new Node(7);
	

	}

}

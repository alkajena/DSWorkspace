package binaryTree;

import binaryTree.FindMaxnMinInBT.Node;

public class FindMaxDepthOfBT {
Node root;
static int level;

static class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key){
		this.key=key;
		left=right=null;
	}
	
}
	public FindMaxDepthOfBT(int key){
		root=new Node(key);
	}

	public static int findDepth(Node root){
		if(root==null)
			return 0;
		int lDepth=findDepth(root.left);
		int rDepth=findDepth(root.right);
		
		if(lDepth>rDepth)
			return lDepth+1;
		else
			return rDepth+1;
	}
	public static void inOrderDepth(Node root,int level1){
		if(root==null)
			return;
		if(level1>level)
			level=level1;
		inOrderDepth(root.left,++level1);
		inOrderDepth(root.right,level1++);
	}
	public static void inOrder(Node root,int level1,int depth){
		if(root==null)
			return;
		inOrder(root.left,++level1,depth);
		if(level1==depth){
			System.out.println("The max depth node is :"+root.key);
		}
		inOrder(root.right,level1++,depth);
	}
	public static void main(String[] args) {
		FindMaxDepthOfBT max=new FindMaxDepthOfBT(1);
		max.root.left=new Node(2);
		max.root.right=new Node(3);
		max.root.left.left=new Node(4);
		max.root.left.right=new Node(5);
		max.root.right.left=new Node(6);
		max.root.right.right=new Node(7);
		max.root.left.left.left=new Node(8);
		max.root.left.left.right=new Node(9);
		int depth=max.findDepth(max.root);
		max.inOrder(max.root,0,depth);
		//max.inOrderDepth(max.root,1);
		
		//System.out.println(max.level);
		//System.out.println(max.level);
	}
	
}

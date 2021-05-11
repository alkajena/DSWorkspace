package binaryTree;

import binaryTree.BinaryTreeFromInorderAndPreorder.Node;

public class BinaryTreeFromInorderAndPostOrder {
	Node root;
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
	
	public BinaryTreeFromInorderAndPostOrder(int key){
		root=new Node(key);
	}
	
	public static Node BinaryTree(int[] in,int[] post,int st,int end,int poIndex){
		if(st>end)
			return null;
		
		Node node=new Node(post[poIndex]);
		poIndex--;
		if(st==end)
			return node;
		
		int index=search(in,st,end,node.key);
		node.right=BinaryTree(in,post,index+1,end,poIndex);
		node.left=BinaryTree(in,post,st,index-1,poIndex);
		return node;
		
	}
	public static int search(int[] in,int st,int end,int key){
		for(int i=st;i<=end;i++){
			if(in[i]==key)
				return i;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

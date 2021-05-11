package binaryTree;

import binaryTree.BinaryTreeFromInorderAndPreorder.Node;

public class BinaryTreeFromInorderAndLevelorder {
	Node root;
	static Node stNode=null;
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
	
	public BinaryTreeFromInorderAndLevelorder(int key){
		root=new Node(key);
	}
	
	public static Node BinaryTree(int[] in,int[] level,int st,int end){
		if(st>end)
			return null;
		if(st==end)
			return new Node(in[st]);
		
		boolean found=false;
		int index=0;
		for(int i=0;i<level.length;i++){
			int data=level[i];
			for(int j=st;j<=end;j++){
				if(data==in[j]){
					stNode=new Node(data);
					index=j;
					found=true;
					break;
				}
			}
			if(found==true)
				break;
		}
		stNode.left=BinaryTree(in,level,st,index-1);
		stNode.right=BinaryTree(in,level,index+1,end);
		
		return stNode;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

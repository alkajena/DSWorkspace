package binaryTree;

import binaryTree.InOrderTraversalWihoutRecursion.Node;

//Inorder traversal without stack and recursion/MorrisTraversal
public class MorrisTraversal {
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
	
	public MorrisTraversal(int key){
		root=new Node(key);
	}
	
	public static void morrisTraversal(Node root){
		Node temp=root;
		while(temp!=null){
			if(temp.left==null){
				System.out.println(temp.key);
				temp=temp.right;
			}
			else{
				Node pre=temp.left;
				while(pre.right!=null && pre.right!=temp){
					pre=pre.right;
				}
				if(pre.right==null){
					pre.right=temp;
					temp=temp.left;
				}
				else{
					pre.right=null;
					System.out.println(temp.key);
					temp=temp.right;
					
				}
			}
		}
	}
	public static void main(String[] args) {
		MorrisTraversal rt=new MorrisTraversal(1);
		rt.root.left=new Node(2);
		rt.root.right=new Node(3);
		rt.root.left.left=new Node(4);
		rt.root.left.right=new Node(5);
		rt.root.right.left=new Node(6);
		rt.root.right.right=new Node(7);
		morrisTraversal(rt.root);
	}
}

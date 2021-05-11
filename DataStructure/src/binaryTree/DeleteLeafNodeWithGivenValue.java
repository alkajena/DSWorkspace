package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class DeleteLeafNodeWithGivenValue {
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
	
	public DeleteLeafNodeWithGivenValue(int key){
		root=new Node(key);
	}
	
	public static Node deleteLeafNode(Node root,int key){
		if(root==null)
			return null;
		root.left=deleteLeafNode(root.left,key);
		root.right=deleteLeafNode(root.right,key);
		
		if(root.key==key && root.left==null && root.right==null)
			return null;
		return root;
	}
	public static void main(String[] args) {
		DeleteLeafNodeWithGivenValue rt = new DeleteLeafNodeWithGivenValue(10);  
		    rt.root.left = new Node(3);  
		    rt.root.right = new Node(10);  
		    rt.root.left.left = new Node(3);  
		    rt.root.left.right = new Node(1);  
		    rt.root.right.right = new Node(3);  
		    rt.root.right.right.left = new Node(3);  
		    rt.root.right.right.right = new Node(3);  
		    deleteLeafNode(rt.root, 3);  

	}

}

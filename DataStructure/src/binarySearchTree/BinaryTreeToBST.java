package binarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeToBST {
	static Node root;
	static List<Integer> inOrderList=new ArrayList<>();
	static List<Integer> sortedList=new ArrayList<>();
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	public BinaryTreeToBST(int key){
		root=new Node(key);
	}
	public static void inOrder(Node root){
		if(root==null)
			return;
		inOrder(root.left);
		inOrderList.add(root.key);
		inOrder(root.right);
	}
	public static void inOrderBST(Node root){
		if(root==null)
			return;
		inOrderBST(root.left);
		root.key=sortedList.get(0);
		sortedList.remove(0);
		inOrderBST(root.right);
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		BinaryTreeToBST bst=new BinaryTreeToBST(10);
		bst.root.left=new Node(2);
		bst.root.left.left=new Node(8);
		bst.root.left.right=new Node(4);
		bst.root.right=new Node(7);
		inOrder(bst.root);
		sortedList.addAll(inOrderList);
		Collections.sort(sortedList);
		inOrderBST(bst.root);
		System.out.println(bst.root.key);
	}

}

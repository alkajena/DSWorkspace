package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import binaryTree.MorrisTraversal.Node;

public class ReverseLevelOrderTraversal {
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
	
	public ReverseLevelOrderTraversal(int key){
		root=new Node(key);
	}
	
	public static void ReverseLevelOrderTraversal(Node root){
		List<Node> list=new ArrayList<>();
		Stack<Node> st=new Stack<>();
		list.add(root);
		while(list.size()!=0){
			Node node=list.remove(0);
			st.push(node);
			if(node.right!=null)
				list.add(node.right);
			if(node.left!=null)
				list.add(node.left);
		}
		
		while(!st.isEmpty()){
			Node node=st.peek();
			st.pop();
			System.out.println(node.key);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import binaryTree.NodeWithSumOfInOrderPredecessorAndSuccessor.Node;

public class IterativePreOrderAndPostOrder {
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
	
	public IterativePreOrderAndPostOrder(int key){
		root=new Node(key);
	}
	
	public static void preOrder(Node root){
		Stack<Node> st=new Stack<>();
		st.push(root);
		while(st.size()!=0){
			Node node=st.peek();
			System.out.println(node.key);
			st.pop();
			if(node.right!=null){
				st.push(node.right);
			}
			if(node.left!=null){
				st.push(node.left);
			}
		}
	}
	
	
	public static void postOrder(Node root){
		List<Node> list1=new ArrayList<>();
		List<Node> list2=new ArrayList<>();
		list1.add(root);
		while(list1.size()!=0){
			Node node=list1.remove(list1.size()-1);
			while(node!=null){
				list2.add(node);
				list1.add(node.left);
				list1.add(node.right);
			}
		}
		Collections.reverse(list2);
	}
	public static void main(String[] args) {
		IterativePreOrderAndPostOrder rt=new IterativePreOrderAndPostOrder(1);
		rt.root.left=new Node(2);
		rt.root.right=new Node(3);
		rt.root.left.left=new Node(4);
		rt.root.left.right=new Node(5);
		rt.root.right.left=new Node(6);
		rt.root.right.right=new Node(7);
		preOrder(rt.root);

	}

}

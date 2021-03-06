package binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import binaryTree.MorrisTraversal.Node;

public class NodeWithSumOfInOrderPredecessorAndSuccessor {
	Node root;
	static List<Node> list=new ArrayList<>();
	static class Node{
		int key;
		Node left;
		Node right;
		int prev;
		int aft;
		int sum;
		
		public Node(int key){
			this.key=key;
			left=right=null;
			int prev=aft=sum=0;
		}
	}
	
	public NodeWithSumOfInOrderPredecessorAndSuccessor(int key){
		root=new Node(key);
	}
	public static void inOrder(Node root){
		if(root==null)
			return;
		inOrder(root.left);
		list.add(root);
		System.out.println(root.key);
		inOrder(root.right);
	}
	public static void sumOfInorderPredecessorAndSuccessor(Node root){
		int j=0;
		for(int i=0;i<list.size()-1;i++){
			j=i+1;
			list.get(i).aft=list.get(j).key;
		}
		list.get(j).aft=0;
		
		Collections.reverse(list);
		
		int j1=0;
		for(int i=0;i<list.size()-1;i++){
			j1=i+1;
			list.get(i).prev=list.get(j1).key;
		}
		list.get(j1).prev=0;
		
		Collections.reverse(list);
		System.out.println("\n");
		for(Node node:list){
			node.sum=node.prev+node.aft;
			System.out.println(node.sum);
		}
	
		
		
	}
	public static void main(String[] args) {
		NodeWithSumOfInOrderPredecessorAndSuccessor rt=new NodeWithSumOfInOrderPredecessorAndSuccessor(1);
		rt.root.left=new Node(2);
		rt.root.right=new Node(3);
		rt.root.left.left=new Node(4);
		rt.root.left.right=new Node(5);
		rt.root.right.left=new Node(6);
		rt.root.right.right=new Node(7);
		inOrder(rt.root);
		sumOfInorderPredecessorAndSuccessor(rt.root);
	}

}

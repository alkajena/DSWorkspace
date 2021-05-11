package binaryTree;

import java.util.ArrayList;
import java.util.List;

import binaryTree.BinaryTreeFromInorderAndPreorder.Node;

public class ConstructBinaryTreeFromLinkedList {
	static Node root;
	static LinkedNode head;
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
	
	static class LinkedNode{
		int data;
		LinkedNode next;
		
		
		public LinkedNode(int key){
			this.data=key;
			next=null;
		}
	}
	
	public ConstructBinaryTreeFromLinkedList(int key){
		root=new Node(key);
	}
	public static Node constructTree(){
		if(head==null){
			return null;
		}
		List<Node> list=new ArrayList<>();
		root=new Node(head.data);
		list.add(root);
		head=head.next;
		while(head!=null){
			Node node=list.remove(0);
			node.left=new Node(head.data);
			list.add(node.left);
			head=head.next;
			if(head!=null){
				node.right=new Node(head.data);
				list.add(node.right);
				head=head.next;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

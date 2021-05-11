package binarySearchTree;

import binarySearchTree.BinaryTreeToBST.Node;

public class SortedLinkedListToBalancedBST {
	static Node head;
	 TreeNode root;
	static int count=0;
	 class Node{
		int key;
		Node next;
		
		public Node(int key){
			this.key=key;
			this.next=null;
		}
	}
	static class TreeNode{
		int key;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int key){
			this.key=key;
			left=right=null;
		}
	}
	public void push(int key){
		if(head==null){
			head=new Node(key);
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;		
			}
			Node newNode=new Node(key);
			temp.next=newNode;
		}
	}
	
	public void printList(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.key);
			count++;
			temp=temp.next;		
		}
	}
	
	public static TreeNode conversionToBalancedBST(int n){
		if(n<=0)
			return null;
		
		TreeNode left=conversionToBalancedBST(n/2);
		TreeNode root=new TreeNode(head.key);
		root.left=left;
		head=head.next;
		root.right=conversionToBalancedBST(n-n/2-1);
		return root;
		
	}
	public static void main(String[] args) {
		SortedLinkedListToBalancedBST llist = new SortedLinkedListToBalancedBST(); 
		  
	        /* Let us create a sorted linked list to test the functions 
	           Created linked list will be 7->6->5->4->3->2->1 */
	        llist.push(7); 
	        llist.push(6); 
	        llist.push(5); 
	        llist.push(4); 
	        llist.push(3); 
	        llist.push(2); 
	        llist.push(1); 
	        System.out.println("Given Linked List "); 
	        llist.printList(llist.head); 
	        TreeNode root=conversionToBalancedBST(count);

	}

}

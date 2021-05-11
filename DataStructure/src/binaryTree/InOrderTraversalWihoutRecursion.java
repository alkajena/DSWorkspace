package binaryTree;

import java.util.Stack;

public class InOrderTraversalWihoutRecursion {
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
	
	public InOrderTraversalWihoutRecursion(int key){
		root=new Node(key);
	}
	public static void inOrder(Node root){
		Stack<Node> stack=new Stack<>();
		Node temp=root;
		while(stack.size()!=0 || temp!=null){
			while(temp!=null){
				stack.push(temp);
				temp=temp.left;
			}
			
			Node node=stack.pop();
			System.out.println(node.key);
			
			temp=node.right;
		}
	}
	public static void main(String[] args) {
		InOrderTraversalWihoutRecursion rt=new InOrderTraversalWihoutRecursion(1);
		rt.root.left=new Node(2);
		rt.root.right=new Node(3);
		rt.root.left.left=new Node(4);
		rt.root.left.right=new Node(5);
		rt.root.right.left=new Node(6);
		rt.root.right.right=new Node(7);
		
		inOrder(rt.root);

	}

}

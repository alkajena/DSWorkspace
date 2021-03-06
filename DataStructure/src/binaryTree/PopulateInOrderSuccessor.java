package binaryTree;

public class PopulateInOrderSuccessor {
	Node root;
	static Node next=null;
	
	static class Node{
		int key;
		Node left;
		Node right;
		Node next;
		
		public Node(int key){
			this.key=key;
			left=right=next=null;
		}
	}
	
	public PopulateInOrderSuccessor(int key){
		root=new Node(key);
	}
	
	public static void populate(Node root){
		if(root!=null){
			populate(root.right);
			root.next=next;
			next=root;
			populate(root.left);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

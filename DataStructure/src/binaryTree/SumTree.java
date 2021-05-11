package binaryTree;

public class SumTree {
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
	
	public SumTree(int key){
		root=new Node(key);
	}
	
	public static int sumTree(Node root){
		if(root==null)
			return 0;
		
		root.key+=sumTree(root.left)+sumTree(root.right);
		
		return root.key;
		
	}
	
	public static Node OtherSumTree(Node root){
		if(root==null)
			return null;
		if(root.left==null & root.right==null)
			return root;
		root.left=OtherSumTree(root.left);
		root.right=OtherSumTree(root.right);
		
		root.key+=root.left.key+root.right.key;
		
		return root;
			
	}
	public static void main(String[] args) {
		SumTree st=new SumTree(1);
		st.root.left=new Node(2);
		st.root.right=new Node(3);
		st.root.left.left=new Node(4);
		st.root.left.right=new Node(5);
		st.root.right.left=new Node(6);
		st.root.right.right=new Node(7);
		st.root=OtherSumTree(st.root);
		System.out.print(st.root.key);
	}

}

package binaryTree;

public class CheckBTfullbinaryTree {
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
	
	public CheckBTfullbinaryTree(int key){
		root=new Node(key);
	}
	
	public static boolean check(Node root){
		if(root==null){
			return true;
		}
		if(root.left==null && root.right==null)
			return true;
		if(root.left==null || root.right==null)
			return false;
		return check(root.left) &&  check(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

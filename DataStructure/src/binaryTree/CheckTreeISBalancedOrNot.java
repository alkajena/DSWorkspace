package binaryTree;

public class CheckTreeISBalancedOrNot {
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

	public CheckTreeISBalancedOrNot(int key){
		root=new Node(key);
	}
	
	public static boolean balancedTree(Node root){
		if(root==null)
			return true;
		
		int lHeight=height(root.left);
		int rHeight=height(root.right);
		
		if(Math.abs(lHeight-rHeight)<=1 && balancedTree(root.left) && balancedTree(root.right)){
			return true;
		}
		
		return false;
	}
	
	public static int height(Node node){
		return 1+Math.max(height(node.left), height(node.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

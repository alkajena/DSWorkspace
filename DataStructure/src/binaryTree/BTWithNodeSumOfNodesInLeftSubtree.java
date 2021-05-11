package binaryTree;

public class BTWithNodeSumOfNodesInLeftSubtree {
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
	
	public BTWithNodeSumOfNodesInLeftSubtree(int key){
		root=new Node(key);
	}
	
	public static int updatedTree(Node root){
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 0;
		int lsum=updatedTree(root.left);
		int rSum=updatedTree(root.right);
		
		root.key+=lsum;
		return root.key+rSum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package binaryTree;

public class FoldableBinaryTree {
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
	public FoldableBinaryTree(int key){
		root=new Node(key);
	}
	
	public boolean checkFoldable(Node root){
		
			root.left=mirrorTree(root.left);
			boolean res=chckStructure(root.left,root.right);
			root.left=mirrorTree(root.left);
			return res;
		
	}
	
	public boolean chckStructure(Node left,Node right){
		if(left==null && right==null)
			return true;
		if(left==null || right==null)
			return false;
		if(left!=null && right!=null && chckStructure(left.left,right.left) && chckStructure(left.right,right.right))
			return true;
		return false;
	}
	public Node mirrorTree(Node root){
		if(root==null)
			return root;
		
			Node left=mirrorTree(root.left);
			Node right=mirrorTree(root.right);
			
			root.left=right;
			root.right=left;
	
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

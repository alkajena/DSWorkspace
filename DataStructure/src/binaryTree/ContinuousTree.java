package binaryTree;

public class ContinuousTree {
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
	public ContinuousTree(int key){
		root=new Node(key);
	}
	
	public static boolean continuous(Node root){
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left==null){
			return Math.abs(root.key-root.right.key)==1 && continuous(root.right);
		}
		if(root.right==null){
			return Math.abs(root.key-root.left.key)==1 && continuous(root.left);
		}
		
		if(root.left!=null && root.right!=null){
			return Math.abs(root.key-root.right.key)==1 && Math.abs(root.key-root.left.key)==1 && continuous(root.left) && continuous(root.right);
		}
		return false;
	}
	public static void main(String[] args) {
		ContinuousTree ct=new ContinuousTree(3);
	    ct.root.left     =new Node(2); 
	    ct.root.right     = new Node(4); 
	    ct.root.left.left = new Node(1); 
	    ct.root.left.right = new Node(3); 
	    ct.root.right.right = new Node(5);
	    System.out.println(continuous(ct.root));

	}

}

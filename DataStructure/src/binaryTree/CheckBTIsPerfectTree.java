package binaryTree;

public class CheckBTIsPerfectTree {
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
	public CheckBTIsPerfectTree(int key){
		root=new Node(key);
	}
	
	public static int findDepth(Node root,int d){
		if(root==null)
			return 0;
		while(root!=null){
			d+=1;
			root=root.left;
		}
		return d;
	}
	
	public static boolean check(Node root,int d,int level){
		if(root==null)
			return true;
		if(root.left==null && root.right==null){
			return(d==level+1);
		}
		if(root.left==null || root.right==null)
			return false;
		if(root.left!=null && root.right!=null){
			return check(root.left,d,level+1) && check(root.right,d,level+1);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

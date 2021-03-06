package binaryTree;

public class NthOrderOfInorderTraversal {
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
	
	public NthOrderOfInorderTraversal(int key){
		root=new Node(key);
	}
	
	public void nthInorder(Node root,int n){
		if(root==null)
			return;
		int count=0;
		if(count<=n){
			nthInorder(root.left,n);
			count++;
			if(count==n)
				System.out.println(root.key);
			nthInorder(root.right,n);
		}
	}
	
	public void nthPostorder(Node root,int n){
		if(root==null)
			return;
		int count=0;
		if(count<=n){
			nthInorder(root.left,n);
			nthInorder(root.right,n);
			count++;
			if(count==n)
				System.out.println(root.key);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

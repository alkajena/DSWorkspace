package binaryTree;

public class BoundaryTraversal {
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
	
	public BoundaryTraversal(int key){
		root=new Node(key);
	}
	
	public static void BoundaryLeftTraversal(Node node){
		if(node==null)
			return;
		if(node.left!=null){
			System.out.println(node.key);
			BoundaryLeftTraversal(node.left);
		}
		
		else if(node.right!=null){
			System.out.println(node.key);
			BoundaryLeftTraversal(node.right);
		}
	}
	
	public static void BoundaryRightTraversal(Node node){
		if(node==null)
			return;
		if(node.right!=null){
			BoundaryRightTraversal(node.right);
			System.out.println(node.key);
		}
		
		else if(node.left!=null){
			BoundaryRightTraversal(node.left);
			System.out.println(node.key);
		}
	}
	
	
	public static void LeafNodeTraversal(Node node){
		if(node==null)
			return;
		LeafNodeTraversal(node.left);
		if(node.left==null && node.right==null)
			System.out.println(node.key);
		LeafNodeTraversal(node.right);
	}
	public static void BoundaryTraversal(Node root){
		if(root==null)
			return;
		
		System.out.println(root.key);
		//left sub tree traversal from top to bottom
		BoundaryLeftTraversal(root.left);
		
		//leaf of left sub tree  and right sub treetraversal
		LeafNodeTraversal(root.left);
		LeafNodeTraversal(root.right);
		
		//right sub tree traversal from bottom to top
		BoundaryRightTraversal(root.right);
	}
	public static void main(String[] args) {
		BoundaryTraversal tree = new BoundaryTraversal(20); 
	        tree.root.left = new Node(8); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.right.left = new Node(10); 
	        tree.root.left.right.right = new Node(14); 
	        tree.root.right = new Node(22); 
	        tree.root.right.right = new Node(25); 
	        BoundaryTraversal(tree.root); 

	}

}

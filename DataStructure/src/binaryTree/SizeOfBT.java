package binaryTree;

import binaryTree.SumTree.Node;

public class SizeOfBT {
Node root;
static int count=0;

static class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key){
		this.key=key;
		left=right=null;
	}
}

public SizeOfBT(int key){
	root=new Node(key);
}

public static int sizeOFBT(Node root){
	if(root==null)
		return 0;
	return sizeOFBT(root.left)+1+sizeOFBT(root.right);
}

public static void sizeOfBTAnother(Node root){
	if(root==null)
		return;
	sizeOfBTAnother(root.left);
	count++;
	sizeOfBTAnother(root.right);
}
	public static void main(String[] args) {
		SizeOfBT st=new SizeOfBT(1);
		st.root.left=new Node(2);
		st.root.right=new Node(3);
		st.root.left.left=new Node(4);
		st.root.left.right=new Node(5);
		st.root.right.left=new Node(6);
		st.root.right.right=new Node(7);
		int x=sizeOFBT(st.root);
		sizeOfBTAnother(st.root);
		System.out.print(count);

	}

}

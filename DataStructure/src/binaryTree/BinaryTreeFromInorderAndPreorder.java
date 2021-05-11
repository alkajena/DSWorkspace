package binaryTree;

public class BinaryTreeFromInorderAndPreorder {
	Node root;
	static int preIndex=0;
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	public BinaryTreeFromInorderAndPreorder(int key){
		root=new Node(key);
	}
	public static int search(int[] in,int st,int end,int key){
		for(int i=st;i<=end;i++){
			if(in[i]==key)
				return i;
		}
		return 0;
	}
	public static Node BinaryTree(int[] in,int[] pre,int st,int end){
		
		if(st>end)
			return null;
		Node node=new Node(pre[preIndex++]);
		if(st==end)
			return node;
		int index=search(in,st,end,node.key);
		node.left=BinaryTree(in,pre,st,index-1);
		node.right=BinaryTree(in,pre,index+1,end);
		
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

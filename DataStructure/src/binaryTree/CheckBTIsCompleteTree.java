package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class CheckBTIsCompleteTree {
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
	
	public CheckBTIsCompleteTree(int key){
		root=new Node(key);
	}
	
	public static boolean check(Node root){
		List<Node> list=new ArrayList<>();
		list.add(root);
		boolean nonfull=false;
		if(root==null)
			return true;
		while(list.size()!=0){
			Node node=list.remove(0);
			if(node.left!=null){
				if(nonfull){
					return false;
				}
				list.add(node.left);
			}
			else{
				nonfull=true;
			}
			
			if(node.right!=null){
				if(nonfull){
					return false;
				}
				list.add(node.right);
			}
			else{
				nonfull=true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

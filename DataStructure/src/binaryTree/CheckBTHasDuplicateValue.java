package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CheckBTHasDuplicateValue {
	Node root;
	static List<Integer> set=new ArrayList<>();
	static class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	public CheckBTHasDuplicateValue(int key){
		root=new Node(key);
	}
	public static void check(Node root){
		if(root==null)
			return;
		check(root.left);
		if(!set.contains(root.key))
			set.add(root.key);
		else{
			System.out.println(root.key+" is alraedy present in tree");
		}
		check(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

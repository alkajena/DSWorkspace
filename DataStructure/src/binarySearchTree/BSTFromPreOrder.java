package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BSTFromPreOrder {
	Node root;
	
	class Node{
		Node left;
		Node right;
		int key;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	
	
	public Node conversion(List<Integer> pre){
		if(pre.size()>0){
			int x=pre.get(0);
			Node root=new Node(x);
			List<Integer> lSubTree=new ArrayList<>();
			List<Integer> rSubTree=new ArrayList<>();
			for(Integer i:pre){
				if(i<x)
					lSubTree.add(i);
				else if(i>x)
					rSubTree.add(i);
			}
			root.left=conversion(lSubTree);
			root.right=conversion(rSubTree);
			return root;
	}
	else{
		return null;
	}
	}
	public static void main(String[] args) {
		BSTFromPreOrder bst=new BSTFromPreOrder();
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(40);
		list.add(50);
		bst.root=bst.conversion(list);
		System.out.println(bst.root.key);

	}

}

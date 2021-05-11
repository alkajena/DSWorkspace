package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DiogonalTraversal {
	Node root;
	
	static class Node{
		int key;
		Node left;Node right;
		
		public Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	public DiogonalTraversal(int key){
		root=new Node(key);
	}
	
	public static void diogonaltraversalUtil(Map<Integer,List<Integer>> map,int d,Node root){
		if(root==null)
			return;
		List<Integer> k=map.get(d);
		if(k==null){
			k=new ArrayList<>();
			k.add(root.key);
		}
		else{
			k.add(root.key);
		}
		map.put(d, k);
		//traverse left subtree
		diogonaltraversalUtil(map,d+1,root.left);
		//traverse right subtree
		diogonaltraversalUtil(map,d,root.right);
	}
	public static void diogonaltraversal(Node root){
		Map<Integer,List<Integer>> map=new HashMap<>();
		diogonaltraversalUtil(map,0,root);
		for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
			List<Integer> list=entry.getValue();
			System.out.println(list.toString());
		}
	}
	
	
	public static void main(String[] args) {
		DiogonalTraversal node=new DiogonalTraversal(8);
        node.root.left = new Node(3); 
        node.root.right = new Node(10); 
        node.root.left.left = new Node(1); 
        node.root.left.right = new Node(6); 
        node.root.right.right = new Node(14); 
        node.root.right.right.left = new Node(13); 
        node.root.left.right.left = new Node(4); 
        node.root.left.right.right = new Node(7); 
        diogonaltraversal(node.root);

	}

}

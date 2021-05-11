package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintNodeFromRootToLeaf {
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
	
	public PrintNodeFromRootToLeaf(int key){
		root=new Node(key);
	}
	public static void pritTopTobottom(Map<Node,Node> map,Node node){
		Node nd=node;
		while(nd!=null){

			System.out.println(nd.key);
			 nd=map.get(node);
		}
		
	}
	public static void print(Node root){
		List<Node> list=new ArrayList<>();
		list.add(root);
		Map<Node,Node> map=new HashMap<>();
		map.put(root,null);
		while(list.size()!=0){
			Node node=list.remove(0);
			
			if(node.left==null && node.right==null)
				pritTopTobottom(map,node);
			if(node.left!=null){
				map.put(node.left, node);
				list.add(node.left);
			}
			
			if(node.right!=null){
				map.put(node.right, node);
				list.add(node.right);
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelWithMaxNumberOfNode {
	Node root;
	static Map<Integer,List<Integer>> map=new HashMap<>();
	static class Node{
		int key;
		Node left;
		Node right;
		int level;
		
		public Node(int key){
			this.key=key;
			left=right=null;
			level=0;		
		}
	}
	public LevelWithMaxNumberOfNode(int key){
		root=new Node(key);
	}
	public static void find(Node root){
		List<Node> list=new ArrayList<>();
		List<Node> itList=new ArrayList<>();
		Map<Integer,List<Node>> map=new HashMap<>();
		list.add(root);
		itList.add(root);
		map.put(0, list);
		while(itList.size()!=0){
			Node node=itList.remove(0);
			if(node.left!=null){
				itList.add(node.left);
				node.left.level=node.level+1;
				List<Node> list1=map.get(node.left.level);
				if(list1!=null)
					list1.add(node.left);
				else{
					list1=new ArrayList<>();
					list1.add(node.left);
					
				}
				map.put(node.left.level, list1);
			}
			
			
			if(node.right!=null){
				itList.add(node.right);
				node.right.level=node.level+1;
				List<Node> list1=map.get(node.right.level);
				if(list1!=null){
					list1.add(node.right);
				}
				else{
					list1=new ArrayList<>();
					list1.add(node.right);
					
				}
				map.put(node.right.level, list1);
			}
				
		}
		System.out.println(map);
		int max=0;
		int level=0;
		for(Map.Entry map1:map.entrySet()){
			if(((List)map1.getValue()).size()>max){
				max=((List)map1.getValue()).size();
				level=(Integer)map1.getKey();
			}
		}
		System.out.println(level);
		
		
	}
	
	public static void inOrder(Node root,int level){
		if(root==null)
			return;
		
		List<Integer> list=map.get(level);
		if(list!=null){
			list.add(root.key);
		}
		else{
			list=new ArrayList<>();
			list.add(root.key);
		}
		map.put(level, list);
		inOrder(root.left,++level);
		inOrder(root.right,level++);
		
	}
	public static void main(String[] args) {
		LevelWithMaxNumberOfNode max=new LevelWithMaxNumberOfNode(1);
		max.root.left=new Node(2);
		max.root.right=new Node(3);
		max.root.left.left=new Node(4);
		max.root.left.right=new Node(5);
		max.root.right.left=new Node(6);
		max.root.right.right=new Node(7);
		find(max.root);
		inOrder(max.root,0);
		System.out.println(map);

	}

}

package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderSpiralform {
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
	
	public LevelOrderSpiralform(int key){
		root=new Node(key);
	}
	
	public static void spiralform(Node root){
		List<Node> list1=new ArrayList<>();
		List<Node> list2=new ArrayList<>();
		list1.add(root);
		
		while(list1.size()!=0 || list2.size()!=0){
			while(list1.size()!=0){
				Node node=list1.remove(0);
				System.out.println(node.key);
				if(node.right!=null)
					list2.add(node.right);
				if(node.left!=null)
					list2.add(node.left);
			}
			
			while(list2.size()!=0){
				Node node=list2.remove(list2.size()-1);
				System.out.println(node.key);
				System.out.println(node.key);
				if(node.left!=null)
					list1.add(node.left);
				if(node.right!=null)
					list1.add(node.right);
			}
		}
	}
	
	public static void spiral2stage(Node root){
		List<Node> list1=new ArrayList<>();
		List<Node> list2=new ArrayList<>();
		list1.add(root);
		int count=0;
		while(list1.size()!=0 || list2.size()!=0){
			while(list1.size()!=0){
				Node node=list1.remove(list1.size()-1);
				System.out.println(node.key);
				if(count%2!=0){
					if(node.right!=null)
						list2.add(node.right);
					if(node.left!=null)
						list2.add(node.left);
				}
				else{
					if(node.left!=null)
						list2.add(node.left);
					if(node.right!=null)
						list2.add(node.right);
				}
				
			}
			
			while(list2.size()!=0){
				Node node=list2.remove(0);
				System.out.println(node.key);
				System.out.println(node.key);
				if(count%2!=0){
					if(node.left!=null)
						list2.add(node.left);
					if(node.right!=null)
						list2.add(node.right);
				}
				else{
					if(node.right!=null)
						list2.add(node.right);
					if(node.left!=null)
						list2.add(node.left);
				}
				
			}
			count++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

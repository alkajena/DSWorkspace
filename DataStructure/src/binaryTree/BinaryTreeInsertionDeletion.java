package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInsertionDeletion {
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
	
	public BinaryTreeInsertionDeletion(int key){
		root=new Node(key);
	}
	public static Node findRightMostNode(Node root){
		Node temp=root;
		Node prev = null;
		while(temp.right!=null){
			prev=temp;
			temp=temp.right;
		}
		prev.right=null;
		return temp;
	}
	public static void delete(Node root,int key){
		List<Node> list=new ArrayList<>();
		list.add(root);
		while(list.size()!=0){
			Node node=list.remove(0);
			if(node.key==key){
				Node temp=findRightMostNode(root);
				node.key=temp.key;
				break;
			}
			else{
				if(node.left.key==key){
					Node temp=findRightMostNode(root);
					node.left.key=temp.key;
					break;
				}
				else{
					list.add(node.left);
				}
				
				if(node.right.key==key){
					Node temp=findRightMostNode(root);
					node.right.key=temp.key;
					break;
				}
				else{
					list.add(node.right);
				}
			}
		}
	}
	public static Node insert(Node root,int key){
		List<Node> list=new ArrayList<>();
		list.add(root);
		while(list.size()!=0){
			Node node=list.remove(0);
			if(node.left==null){
				node.left=new Node(key);
				break;
			}
			else{
				list.add(node.left);
			}
			if(node.right==null){
				node.right=new Node(key);
				break;
			}
			else{
				list.add(node.right);
			}
		}
		return root;
		}
	public static void levelOrderTraversal(Node root){
		List<Node> list=new ArrayList<>();
		list.add(root);
		while(list.size()!=0){
			Node node=list.remove(0);
			System.out.println(node.key);
			if(node.left!=null){
				list.add(node.left);
			}
			if(node.right!=null){
				list.add(node.right);
			}
		}
		}
	public static void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
		}
	}
	
	public static void postorder(Node root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key);
			
		}
	}
	
	public static void preorder(Node root){
		if(root!=null){
			System.out.println(root.key);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void main(String[] args) {
		BinaryTreeInsertionDeletion bt=new BinaryTreeInsertionDeletion(1);
		insert(bt.root,2);
		insert(bt.root,3);
		insert(bt.root,4);
		insert(bt.root,5);
		insert(bt.root,6);
		insert(bt.root,7);
		levelOrderTraversal(bt.root);
		inorder(bt.root);
		delete(bt.root, 3);
		inorder(bt.root);
	}

}

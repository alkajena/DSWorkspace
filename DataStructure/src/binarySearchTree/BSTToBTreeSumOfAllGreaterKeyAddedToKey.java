package binarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BSTToBTreeSumOfAllGreaterKeyAddedToKey {
	Node root;
	static List<Node> inOrderList=new ArrayList<>();
	//static List<Integer> sortedList=new ArrayList<>();
	static class Node{
		int key;
		Node left,right,sum,greater;
		
		public Node(int key){
			this.key=key;
			left=right=sum=null;
		}
	}
	public BSTToBTreeSumOfAllGreaterKeyAddedToKey(int key){
		root=new Node(key);
	}
	
	public static void inOrder(Node root){
		if(root==null)
			return;
		inOrder(root.left);
		inOrderList.add(root);
		inOrder(root.right);
		
	}
	public static void main(String[] args) {
		BSTToBTreeSumOfAllGreaterKeyAddedToKey bst=new BSTToBTreeSumOfAllGreaterKeyAddedToKey(5);
		bst.root.left=new Node(2);
		bst.root.right=new Node(13);
		inOrder(bst.root);
		Collections.reverse(inOrderList);
		int k=0;
		int sum=0;
		for(int i=1;i<inOrderList.size();i++){
			sum+=inOrderList.get(k).key;
			inOrderList.get(i).sum=new Node(inOrderList.get(k).key+inOrderList.get(i).key);
			inOrderList.get(i).greater=new Node(sum);
			//inOrderList.get(i).key=inOrderList.get(i).greater.key;
			k++;
		}
		for(int i=1;i<inOrderList.size();i++){
			inOrderList.get(i).key=inOrderList.get(i).greater.key;
		}
		inOrderList.get(0).key=0;
		System.out.println(bst.root.key+" "+bst.root.left.key+" "+bst.root.right.key);
	}

}

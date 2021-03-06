package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class FindAllPossibleBinaryTree {
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
	
	public FindAllPossibleBinaryTree(int key){
		root=new Node(key);
	}
	
	public List<Node> findTrees(int[] in,int st,int end){
		List<Node> trees=new ArrayList<>();
		
		if(st>end){
			trees.add(null);
			return trees;
		}
		
		for(int i=st;i<=end;i++){
			List<Node> lTrees=findTrees(in,st,i-1);
			List<Node> rTrees=findTrees(in, i+1, end);
			
			for(int j=0;j<lTrees.size();j++){
				for(int k=0;k<rTrees.size();k++){
					Node node=new Node(in[i]);
					
					node.left=lTrees.get(j);
					
					node.right=rTrees.get(k);
					
					trees.add(node);
				}
			}
		}
		return trees;
			
	}
	public static void main(String[] args) {
		FindAllPossibleBinaryTree tree=new FindAllPossibleBinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		int[] in=new int[]{1,2,3};
		tree.findTrees(in, 0, in.length-1);

	}

}

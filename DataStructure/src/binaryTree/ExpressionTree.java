package binaryTree;

import java.util.Stack;

public class ExpressionTree {
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
	
	public ExpressionTree(int key){
		root=new Node(key);
	}
	public boolean checkOperator(char c){
		if(c=='+' || c=='-' || c=='*' || c=='/' || c=='%')
			return true;
		return false;
	}
	public Node findexpressiontree(String postfix){
		Stack<Node> stack=new Stack<>();
		Node t,t1,t2;
		for(int i=0;i<postfix.length();i++){
			char c=postfix.charAt(i);
			boolean res=checkOperator(c);
			if(!res){
				stack.push(new Node(postfix.charAt(i)));
			}
			else{
				t=new Node(postfix.charAt(i));
				t1=stack.pop();
				t2=stack.pop();
				
				t.left=t1;
				t.right=t2;
				
				stack.push(t);
			}
		}
		
		Node node=stack.peek();
		stack.pop();
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

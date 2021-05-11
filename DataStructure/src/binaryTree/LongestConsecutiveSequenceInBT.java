package binaryTree;

public class LongestConsecutiveSequenceInBT {
Node root;
static int res=0;
static class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key){
		this.key=key;
		left=right=null;
	}
}

public LongestConsecutiveSequenceInBT(int key){
	root=new Node(key);
}

public static int checkLongestSequence(Node root,int expected,int currLength){
	if(root==null)
		return 0;
	
	if(root.key==expected)
		currLength++;
	else
		currLength=1;
	
	res=currLength;
	
	checkLongestSequence(root.left,root.key+1,currLength);
	checkLongestSequence(root.right,root.key+1,currLength);
	
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

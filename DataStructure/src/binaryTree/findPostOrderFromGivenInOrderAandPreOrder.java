package binaryTree;

import java.util.Arrays;

public class findPostOrderFromGivenInOrderAandPreOrder {
	 static int preIndex=0;
	public static void findPostOrder(int[] pre,int[] in,int st,int end){
		
		if(st>end)
			return;
		int index=search(in,st,end,pre[preIndex++]);
		findPostOrder(pre,in,st,index-1);
		findPostOrder(pre,in,index+1,end);
		
		System.out.println(in[index]);
		
	}
	
	//another method
	
	public static void findPostOrderTree(int in[],int pre[],int n){
		int index=searchIndex(in,pre[0],n);
		
		if(index!=0){
			findPostOrderTree(in,Arrays.copyOfRange(pre, 1, n),index);
		}
		
		if(index!=n-1){
			findPostOrderTree(Arrays.copyOfRange(in, index+1, n),Arrays.copyOfRange(pre, index+1, n),n-index-1);
		}
		
		System.out.println(pre[0]);
	}
	public static int searchIndex(int[] in,int key,int n){
		for(int i=0;i<n;i++){
			if(in[i]==key){
				return i;
			}
		}
		return 0;
	}
	public static int search(int[] in,int st,int end,int key){
		for(int i=st;i<=end;i++){
			if(in[i]==key){
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] in={4,2,5,1,6,3,7};
		int[] pre={1,2,4,5,3,6,7};
		findPostOrderTree(in,pre,in.length);
		//findPostOrder(pre,in,0,in.length-1);

	}

}

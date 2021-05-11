package binaryTree;

public class CountBinaryTreeFromPreOrder {
	
	public static int countTrees(int n){
		int bt[]=new int[n+1];
		for(int i=0;i<n;i++){
			bt[i]=0;
		}
		bt[0]=bt[1]=1;
		
		for(int j=2;j<=n;j++){
			for(int k=0;k<j;k++){
				bt[j]+=bt[k]*bt[j-k-1];
			}
		}
		return bt[n];
	}

	public static void main(String[] args) {
		int n = 3; 
		System.out.println("Total Possible " +  
		                "Binary Trees are : " +  
		                       countTrees(n)); 

	}

}

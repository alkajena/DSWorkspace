package binaryTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckGraphIsAtree {
	int v;
	static List<Integer> adj[];
	
	public CheckGraphIsAtree(int v){
		this.v=v;
		adj=new ArrayList[this.v];
		for(int i=0;i<v;i++){
			adj[i]=new ArrayList<Integer>();
		}
	}
	
	public void Edge(int u,int v){
		adj[u].add(v);
		adj[v].add(u);
	}
	public static boolean chckUtil(int v,boolean[] visited,int parent){
		visited[v]=true;
		
		List<Integer> list=adj[v];
		Iterator it=list.iterator();
		while(it.hasNext()){
			Integer i=(Integer)it.next();
			
			if(!visited[i])
				chckUtil(i,visited,v);
			
			else if(i!=parent)
				return true;
		}
		return false;
		
	}
	public static boolean check(CheckGraphIsAtree graph){
		boolean[] visited=new boolean[graph.v];
		
		for(int i=0;i<graph.v;i++){
			visited[i]=false;
		}
		
		if(chckUtil(0,visited,-1))
			return false;
		
		for(boolean b:visited){
			if(b==false)
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

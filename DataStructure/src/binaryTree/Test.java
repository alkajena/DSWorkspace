package binaryTree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		String str=new String("alka|ena|12");
		String[] arr=str.split("|");
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("alka");
		tree.add("jena");
		tree.add("neha");
		NavigableSet<String> nav=tree.descendingSet();
		System.out.println(nav);
		Iterator<String> itr=tree.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

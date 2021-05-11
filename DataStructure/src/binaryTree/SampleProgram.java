package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;



public class SampleProgram {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		List<Integer> list3=new ArrayList<>();
		list1.add("1");
		list1.add("1");
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		list2.add("4");
		list2.add("5");
		list2.add("6");
		
		list3.add(8);
		list3.add(26);
		list3.add(3);
		Object[] str=list1.toArray();
		for(Object o:str){
			System.out.println(o);
		}
		
		System.out.println(Collections.disjoint(list1, list2));
		System.out.println(Collections.frequency(list1,"1"));
		Collections.sort(list3,Collections.reverseOrder());
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		Collections.reverse(list3);
		System.out.println(list3);
		//list1.removeAll(Collections.singleton("1"));
		//System.out.println(list1);
		Collections.swap(list2, 1, 2);
		System.out.println(list2);
		Collections.rotate(list2, 1);
		System.out.println(list2);
		Iterator<String> itr=list1.iterator();
		int count=0;
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			count++;
			if(count<=3)
				itr.remove();
			
		}
		System.out.println(list1);
		ListIterator<String> itr1=list1.listIterator();
		int count1=0;
		while(itr1.hasNext()){
			
			System.out.println(itr1.next());
			count1++;
			if(count1<=3)
				itr1.set("8");
			
		}
		System.out.println(list1);
	
	LinkedList<Integer> abc=new LinkedList<>();
	abc.add(1);
	abc.add(2);
	abc.add(3);
	abc.add(4);
	abc.add(5);
	
	//abc.poll();
	//abc.pollLast();
	System.out.println(abc.peek());
	System.out.println(abc);
	
	List<Integer> immutableList=Collections.unmodifiableList(abc);
	//immutableList.add(8);
	//immutableList.remove(1);
	System.out.println(abc);
	CopyOnWriteArrayList<Integer> gh=new CopyOnWriteArrayList<>();
	gh.add(1);
	gh.add(2);
	gh.add(3);
	gh.add(4);
	gh.add(5);
	
	Iterator<Integer> itr3=gh.iterator();
	while(itr3.hasNext()){
		//itr3.remove();
		System.out.println(itr3.next());
	}
	
	List tx=Collections.synchronizedList(gh);
	Iterator<Integer> itr4=gh.iterator();
	while(itr4.hasNext()){
		//itr4.remove();
		System.out.println(itr4.next());
	}
	
	HashMap<Integer,String> map=new HashMap<>();
	map.put(1, "alka");
	map.put(2, "neha");
	map.put(5, "tgh");
	map.put(3, "jena");
	map.put(4, "abc");
	valueComparator comp=new valueComparator();
	
	List<Map.Entry<Integer, String>> list=new ArrayList<>();
	for(Entry<Integer,String> k:map.entrySet()){
		list.add(k);
	}
	Collections.sort(list,comp);
	for(Map.Entry entry:list){
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	HashSet<Student> set=new HashSet<>();
	Student s1=new Student("alka","jena");
	Student s2=new Student("asha","jena");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode()==s2.hashCode());
	s2.setfName("alka");
	set.add(s1);
	set.add(s2);
	System.out.println(s1==s2);
	System.out.println(set.size());
	}
}
class valueComparator implements Comparator<Map.Entry<Integer,String>>{
	
	@Override
	public int compare(Map.Entry<Integer, String> arg0, Map.Entry<Integer, String> arg1) {
		
		return arg0.getValue().compareTo(arg1.getValue());
	}
	
}

class Student extends Object{
	private String fName;
	private String lName;
	
	public Student(String fname,String lname){
		this.fName=fname;
		this.lName=lname;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public boolean equals(Object obj){
		Student s=(Student)obj;
		if(this==obj)
			return true;
		if(this.fName.equals(s.fName) && this.lName.equals(s.lName))
			return true;
		return false;
	}
	
	@Override
	public int hashCode(){
		return 1;
	}
}

package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("Sunitha");
	set.add("Sathya");
	boolean add1 = set.add("Bala");
	set.add("Dhinesh");
	set.add("Anand");
	set.add("Vidya");
	set.add("Iqbal");
	boolean add2 = set.add("Bala");
	System.out.println(add1);
	System.out.println(add2);
	System.out.println(set);
	
	
	for(String eachValue:set) {
		System.out.println(eachValue);
	}
	
	
	List<String> list = new ArrayList<String>(set);
//	list.addAll(set);
	System.out.println("List -> "+list);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	set.remove("");
//	set.removeAll(c);
//	set.clear();
//	set.isEmpty();
//	set.contains(o);
//	set.containsAll(c);
}
}

package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Sneha");
	list.add("Hema");
	list.add("Nirmal");
	list.add("Anitha");
	list.add("Ravi");
	list.add(1, "Sanjay");
	list.add("Anitha");
	list.add("Anitha");
	list.add("Anitha");
	System.out.println(list);
	list.set(0, "Nethaji");
	list.remove("Anitha");
	System.out.println(list);
	List<String> asList = Arrays.asList("Anitha","Anitha","Anitha");
	list.removeAll(asList);
	System.out.println(list);
	
	list.contains("Nethaji");
	list.containsAll(Arrays.asList("Sneha","Hema","Nethaji"));
	
	int size = list.size();
	System.out.println(size);
	for (int i = 0; i < size; i++) {
		String string = list.get(i);
		System.out.println(string);
		
	}
//	list.clear();
//	list.isEmpty();
	
	
	Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	
	
	
	

}
}

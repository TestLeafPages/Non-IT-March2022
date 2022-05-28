package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<Integer, String>();
	map.put(10001, "Vidhya");
	map.put(10002, "Sowmiya");
	map.put(10003, "Ravi");
	map.put(10004, "Dhinesh");
	map.put(10005, "Kavitha");
	map.put(10006, "Sathya");
	map.put(10007, "Saranya");
	map.put(10001, "Lakshman");
	map.remove(10001);
	System.out.println(map);
	
	map.containsKey(10002);
	map.containsValue("Saranya");
	
	String string = map.get(10003);
	System.out.println(string);
	
	// Key value pair -> entry
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	for(Entry<Integer, String> eachEntry:entrySet) {
		System.out.println(eachEntry);
		System.out.println(eachEntry.getKey());
		System.out.println(eachEntry.getValue());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

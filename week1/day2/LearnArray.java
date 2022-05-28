package week1.day2;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	String name = "Balaji";
	String[] names1 = {"RajaSekar", "Saranya", "Dhivakar", "PriyaDharshini", "Kavitha", "Aruna"};
	Arrays.sort(names1);
	int length = names1.length;
	System.out.println(length);
	for(int i = 0; i < length; i++)
		System.out.println(names1[i]);
	System.out.println("_______________________________________________________");
	String[] names2 = new String[6];
	names2[0] = "Anand";
	names2[1] = "Fahrun";
	names2[2] = "Pavithra";
	
	for(int i = 0; i < names2.length; i++)
		System.out.println(names2[i]);
	
	
}
}

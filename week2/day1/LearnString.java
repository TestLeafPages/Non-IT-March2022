package week2.day1;

public class LearnString {
	public static void main(String[] args) {
		// String is a non primitive datatype/ user defined data type
		// String is a class
		// String should be defined inside ""
		// String is immutable

		// String literal
		// String text1 = "testleaf";
		// String object
		// String text2 = new String("testleaf");
		// System.out.println(text0 == text1);
		// String upperCase = text0.toUpperCase();
		// System.out.println(upperCase);
		// String lowerCase = upperCase.toLowerCase();
		// System.out.println(lowerCase);


		// String comparison
		// boolean equals = text0.equals(text1);
		// System.out.println(equals);
		// boolean equalsIgnoreCase = text0.equalsIgnoreCase(text1);
		// System.out.println(equalsIgnoreCase);
		// boolean contains = text0.contains(text1);
		// System.out.println(contains);
		// boolean startsWith = text0.startsWith("test");
		// System.out.println(startsWith);
		// boolean endsWith = text0.endsWith("nnai");
		// System.out.println(endsWith);
		// String str1 = "Since 2005";
		// String str2 = "200";
		// System.out.println(str1.contains(str2));

//		String concat = text1.concat(text2);
//		System.out.println(concat);
//		System.out.println(text1+" "+text2);
		
//		String text1 = "   test leaf   ";
//		String trim = text1.trim();
//		System.out.println(text1);
//		System.out.println(trim);
//		String text1 = "testleaf";
//		int length = text1.length();
//		System.out.println(length);
//		for(int i = 0; i < length; i++) {
//		char charAt = text1.charAt(i);
//		System.out.println(charAt);
//		}
//		char[] array = text1.toCharArray();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
//		String text = "Testleaf,is,in,chennai";
//		String[] split = text.split(",");
//		for (int i = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//		}
		
//		String text = "testleaf";
//		String substring = text.substring(4);
//		System.out.println(substring);
//		String substring2 = text.substring(2, 6);
//		System.out.println(substring2);
		
		String text = "testleaf";
		String replace = text.replace("t", "");
		System.out.println(replace);
		
		String text1 = "Estb 1905";
		String replaceAll = text1.replaceAll("[^A-Za-z]", "");
		System.out.println(replaceAll);
		String replaceAll2 = text1.replaceAll("\\D", "");
		System.out.println(replaceAll2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

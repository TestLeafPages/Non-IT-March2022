package week1.day1;

public class LearnOperators {
public static void main(String[] args) {
	int a = 6;
	int b = 3;
	// Arithmetic operators
	System.out.println(a+b);    //Addition
	System.out.println(a-b);    //Subtraction
	System.out.println(a*b);    //Multiplication
	System.out.println(a/b);    //Division
	System.out.println(a%b);    //Modulo
	
	// Comparison Operator ->   >,<,>=,<=,==,!=
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	
	// = -> Assignment operator
	
	// Incremental or decremental operator ++ --
	System.out.println(a--);
	System.out.println(a);
	
	// logical operator
	// && - AND logic1 && logic2 -> Both should be true
	// || - OR  logic1 || logic2 -> Anyone should be true
	// ! - NOT  !logic1 -> Both should be false
}
}

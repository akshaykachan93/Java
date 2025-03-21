package com.Fusion_March17_StaticMethod;

public class CalculatorStatic {
	public static void add() {
		
		System.out.println("Ram");
		System.out.println(20+30);
		}
	
	public static void sub(int a, int b) {
		
		System.out.println("Virat");
		System.out.println(a-b);
		}
	
	public static void mul(String p , String q) {
		System.out.println("Rohit");
		System.out.println(p+q);
	}

	public static void main(String[]args) {
		System.out.println("Main Start");
		add();
		
		int a=20;
		int b=30;
		sub(a,b);
		
		mul("Ram" , " Rahul");
	}

}

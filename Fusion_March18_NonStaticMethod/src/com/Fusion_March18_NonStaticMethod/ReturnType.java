package com.Fusion_March18_NonStaticMethod;

public class ReturnType {

//	public static void add(int a, int b) {
//		int c=a+b;
//		System.out.println(c);
//	}

	public static int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		System.out.println("Ram");
		return c;
		//return 800;
		
		
	}

	public static void main(String[] args) {

		int a = 50;
		int b = 20;

		// add(a,b) ;

		// int d=

		// int d=add(a,b); // for void return type it will not work

		int d = add(a, b);
		// int d=c; c is local variable
		int e = d + 50;
		System.out.println(e);

	}

}

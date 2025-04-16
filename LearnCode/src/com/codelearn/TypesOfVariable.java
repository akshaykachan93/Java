package com.codelearn;

public class TypesOfVariable {

	int a = 10; // Instance Variable
	static double b = 20.5; // Static Variable

	public static void main(String[] args) {

		boolean c = true; // Local Variable

		TypesOfVariable d = new TypesOfVariable();
		System.out.println(d.a);
		System.out.println(b);
		System.out.println(c);
	}

}

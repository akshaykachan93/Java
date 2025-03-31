package com.non_static_method;

public class InstanceMethod {
	
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void mod(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {

		System.out.println("Calculator Program");
		int a = 20;
		int b = 10;

		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		mod(a, b);
	}
	}


}

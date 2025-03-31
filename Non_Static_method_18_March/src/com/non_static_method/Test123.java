package com.non_static_method;

public class Test123 {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public void mod(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		Test123 obj = new Test123();

		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);
		obj.mod(a,b);
	}

}

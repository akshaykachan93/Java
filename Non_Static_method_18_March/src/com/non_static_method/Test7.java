package com.non_static_method;

public class Test7 {

	public void m1() {
		System.out.println("Nonstatic m1 ");
	}

	public void m2() {
		m1();
		m3();
		System.out.println("Nonstatic m2 ");
	}

	public static void m3() {
		Test7 t= new Test7();
		t.m1();

		System.out.println("static m3 ");
	}

	public static void m4() {

		m3();
		System.out.println("static m4 ");
	}

	public static void main(String[] args) {

	}

}
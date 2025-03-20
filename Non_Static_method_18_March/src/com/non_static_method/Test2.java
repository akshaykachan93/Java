package com.non_static_method;

public class Test2 {
	
	int a=50; //instance variable
	static int b=70;
	
	public void m1() {
		System.out.println("Nonstatic m1 "+a);
	}
	
	public void m2() {
		System.out.println("Nonstatic m2 "+b);
	}
	
	public static void m3() {
		Test2 t= new Test2();
		System.out.println("static m3 "+t.a);
	}
	
	
	public static void m4() {
		System.out.println("static m4 "+b);
	}


	public static void main(String[] args) {
		

	}

}

package com.Opreator;

public class Test {
	
	int a=20;
	static int b=50;
	
	public void add() {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Test t= new Test();
		System.out.println(t.a+b);
		System.out.println("================");
		t.add();
		
		
	}

}
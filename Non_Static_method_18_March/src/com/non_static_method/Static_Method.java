package com.non_static_method;


public class Static_Method {
	
	 static void add(int a, int b) {
		System.out.println("In add of StaticMethod class"+ (a+b));
	}

	public static void main(String[] args) {


		add();
	}

}
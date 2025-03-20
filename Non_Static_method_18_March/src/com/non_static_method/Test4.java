package com.non_static_method;


public class Test4 {
	
	static int a=100; //Static

	public static void main(String[] args) {

		int a=500; //Local
		
		System.out.println(a+200);

	}

}

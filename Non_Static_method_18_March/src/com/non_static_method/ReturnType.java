package com.non_static_method;

public class ReturnType {
	
	//void - does not return Anything
	public static String add() {
		
		System.out.println("In add");
		int a=20;
		
		return null;
		
	}
	
	public static double sub() {
		
		System.out.println("In add");
		int a=20;
		
		return 30.52 ;
		
	}
	
	

	public static void main(String[] args) {

		add();

	}

}
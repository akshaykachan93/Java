package com.Opreator;


public class Test3 {

	public static int add() {

		return (int) 20.20; //Explicit Typecast
	}

	public static double add2(int a, double b) {

		return '!';  //Implicit Typecast
	}
	
	public static String add3() {

		//return "Ram";  
		return null;
	}

	public static void main(String[] args) {

		System.out.println(add());
		System.out.println(add2(20,50.60));
		System.out.println(add3());

	}

}

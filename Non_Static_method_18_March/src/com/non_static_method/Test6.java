package com.non_static_method;

public class Test6 {
	
	public static String m1() {
		
		String a="Virat";
		
		return "Hardik " +a;
		
		//return 50;
	}

	public static void main(String[] args) {

		String s=m1();
		
		System.out.println(s);

	}

}

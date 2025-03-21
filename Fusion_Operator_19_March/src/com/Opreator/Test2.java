package com.Opreator;

public class Test2 {

	public static boolean addCheck(int a, int c) {
		boolean b = false;
		int d = a + c;
		if (d < 90) {
			b = true;
		}
		System.out.println("Ram");
		return true; // return should be your last statement always
		// System.out.println();
	}

	public static void main(String[] args) {

		System.out.println(addCheck(100, 20));

	}

}
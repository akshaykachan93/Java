package com.Task;

public class Manager1 extends Account1 {
	 private static String role="Manager";

	public static void main(String[] args) {
		Manager1 m=new Manager1();
		m.setAmount(9000, role);
		m.getAmount(role);
		

	}

}

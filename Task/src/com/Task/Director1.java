package com.Task;

public class Director1 extends Account1 {
	 private static String role="director";

	public static void main(String[] args) {
		Director1 d=new Director1();
		d.setAmount(10000, role);
		d.getAmount(role);

	}

}

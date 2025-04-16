package com.Task;

public class Employee1 extends Account1 {
	 private static String role="Employee";

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.getAmount(role);
		e.setAmount(10000, role);
	}

}

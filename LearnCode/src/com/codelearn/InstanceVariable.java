package com.codelearn;

public class InstanceVariable {

	int a = 20;
	int b = 30;
	int c = (a + b);

	public static void main(String[] args) {

		InstanceVariable i = new InstanceVariable();

		System.out.print(i.c);

	}

}

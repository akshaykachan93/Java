package com.non_static_method;

public class InstanceMethod {
	
	public void add() {
		System.out.println("Instance Method ");
	}
	
	public static void sub() {
		System.out.println("Static Method ");
	}
	

	public static void main(String[] args) {
		
		InstanceMethod i= new InstanceMethod();

		i.add();
		
		//i.sub();
		
		sub();
		
		InstanceMethod.sub();

	}

}

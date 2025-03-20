package com.ObjectCreation;

public class Test {
	
	int a=50;
	
	String s="Ram";
	double d;

	public static void main(String[] args) {


		//System.out.println(a); //C.E need to initialize
		
		Test t= new Test(); //className variableName= new className();
		System.out.println(t.a); //ObjectName.VariableName
		System.out.println(t.s);
		System.out.println(t.d);

	}

}
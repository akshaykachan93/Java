package com.Fusion_March18_NonStaticMethod;

public class NonStaticMethod_or_InsatnceMethod {

	public void add() {
		System.out.print("Insatnce Method");
	}
	
	public static void main(String[]args) {
		
		NonStaticMethod_or_InsatnceMethod m= new NonStaticMethod_or_InsatnceMethod();
		m.add();
		
	}
	
}

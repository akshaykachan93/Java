package com.Fusion21March_Operators_Final;

public class TestInstanceOf extends Z{

	public static void main(String[] args) {


		TestInstanceOf a= new TestInstanceOf();
		
		System.out.println(a instanceof TestInstanceOf);
		
		
		System.out.println(a instanceof Runnable);
		
		System.out.println(a instanceof Object);
		
		System.out.println(a instanceof Z);

	}

}


class Z{
	
}
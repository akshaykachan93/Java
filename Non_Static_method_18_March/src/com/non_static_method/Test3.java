package com.non_static_method;

public class Test3 {
	
	int id; //Individual
	String name;
	static String countryName="Pakistan"; //Common property
	
	

	public Test3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
//	
//	public Test3(int id, String name ,int b) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	public void show() {
		System.out.println(id +" "+name+" "+countryName);
	}



	public static void main(String[] args) {
		
		// t1= new Test3(1,"Ram" ,3);
		Test3 t1= new Test3(1,"Ram");
		countryName="India";
		t1.show();
		
		Test3 t2= new Test3(2,"Virat");
		t2.show();
		
		



	}

}
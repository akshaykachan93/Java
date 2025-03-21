package com.Fusion21March_Operators_Final;

public class Ternary {

	public static void main(String[] args) {


		int a=10;
		
		if(a>50) {
			System.out.println("Ram");
		}else {
			System.out.println("Virat");
		}
		
		//String s=(a<50)?"Ram":"Virat";
		String s=(true)?"Ram":"Virat";
		System.out.println(s);
		
		int x=10;
		int y=20;
		
		int z=(x>y)?x:y;
		System.out.println(z);

	}

}
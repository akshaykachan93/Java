package com.Opreator;


public class Unary2 {
	
public static void main(String[] args) {
	
	//a++  != a+1
	
			byte e=50;
			//byte f=e++; //50
			byte f=++e; //51  /// Implicit typecast
			System.out.println(f); //50
			
			byte x=50;
			byte y=(byte)(x+1); //Explicit typecasting
			System.out.println(y);
			
			int a=70;
			int b=++a;
			System.out.println(b);
			int c=70;
			int d=c+1;
			System.out.println(d);
}

}
package com.Operators;
import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[]args) {
		int a,b;
		System.out.print("Enter two Numbers...");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();//Greater
		b=obj.nextInt();//Lessar
		System.out.println("true/false "+(a<b));
		System.out.println("true/false "+(a>b));
		System.out.println("true/false "+(a<=b));
		System.out.println("true/false "+(a>=b));
		System.out.println("true/false "+(a==b));
		System.out.println("true/false "+(a!=b));
	}

}

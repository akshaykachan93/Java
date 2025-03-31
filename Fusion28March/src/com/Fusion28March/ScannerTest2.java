package com.Fusion28March;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("please give input for a");
		
		String a=sc.nextLine();
		System.out.println("please give input for b");
		String b= sc.nextLine();
		
		System.out.println(a+b);
		
		//Using one Scanner we can take multiple inputs
		

	}

}
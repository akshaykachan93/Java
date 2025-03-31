package com.Fusion28March;


import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("please give input for a"); //\n
		
		int a=sc.nextInt();  //After reading integer/double you should use nextLine before reading String.
		sc.nextLine();
		System.out.println("please give input for b");
		String b= sc.next();
		
		System.out.println(a +" "+b);

	}

}
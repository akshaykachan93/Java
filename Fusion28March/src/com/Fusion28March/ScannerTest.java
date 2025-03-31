package com.Fusion28March;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("please give input");
		//String s= sc.next();  // used only for single word
		String s= sc.nextLine(); // used for sentence
		System.out.println(s);

	}

}
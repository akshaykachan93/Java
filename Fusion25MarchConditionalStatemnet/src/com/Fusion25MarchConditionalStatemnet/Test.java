package com.Fusion25MarchConditionalStatemnet;

public class Test {

	public static void main(String[] args) {

		String country = "India";
		String state = "maharashtra";

		if (country == "India") {
			//String state = "maharashtra";
			System.out.println("Indian");

			if (state == "maharashtra") {

				System.out.println("Indian -maharashtra ");

			}
			 if (state == "gujrat") {

				System.out.println("Indian -gujrat ");

			} else {
				System.out.println("only Indian");

			}

		} else if (country == "USA") {
			System.out.println("American");
			//String state = "maharashtra";
			if (state == "DC") {
				System.out.println("American - DC");
			} else {
				System.out.println("only American");
			}

		} else {
			System.out.println("Alien");
		}

	}

}
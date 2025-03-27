package com.Fusion25MarchConditionalStatemnet;

public class Switch3 {

	public static void main(String[] args) {

		String month = "Apr";

		switch (month) {

			case "jan": {
				System.out.println("Jan Quater 1");
			
			}
			case "Feb" : {
				System.out.println("Feb Quater 1");
				
			}
			case "march" : {
				System.out.println("Mar Quater 1");
				break;
			}
			case "Apr" : {
				System.out.println("Apr Quater 2");
			}
			case "May" : {
				System.out.println("May Quater 2");
			}
			case "Jun" : {
				System.out.println("Jun Quater 2");
				break;
			}
			case "July" : {
				System.out.println("July Quater 3");
			}case "Aug" : {
				System.out.println("Aug Quater 3");
			}
			case "Sep" : {
				System.out.println("Sep Quater 3");
			}
			case "Oct" : {
				System.out.println("Oct Quater 4");
			}
			case "Nov" : {
				System.out.println("Nov Quater 4");
			}
			case "Dec" : {
				System.out.println("Dec Quater 4");
			}
		}

	}

}
package com.Fusion25MarchConditionalStatemnet;

public class SwitchDemo {

	public static void main(String[] args) {

		int a = 10;

		switch (a) {

		case 1: {
			System.out.println("it is 1");
			break;
		}

		case 2: {
			System.out.println("it is 2");
			break;
		}
		case 3: {
			System.out.println("it is 3");
			break;
		}
		case 10: {
			System.out.println("it is 10");
			// break;
		}
		case 11: {
			System.out.println("it is 11");
			break;
		}
		default: {
			System.out.println("not matched");
			break;
		}

		}

	}

}

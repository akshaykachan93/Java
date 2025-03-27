package com.Fusion25MarchConditionalStatemnet;

public class SwitchEnum {
	
	enum Day{
		SUNDAY , MONDAY , TUESDAY , WEDNSDAY , THURSDAY , FRIDAY , SATURDAY ,RAHUL
	}

	public static void main(String[] args) {

		Day d= Day.MONDAY;
		
		Day d1=Day.RAHUL;
		
		switch(d) {
		
//			case "Ram" : {
//				System.out.println("It is sunday");
//			}
			case MONDAY : {
				System.out.println("It is MONDAY");
				break;
			}
			case TUESDAY : {
				System.out.println("It is TUESDAY");
			}
			case WEDNSDAY : {
				System.out.println("It is WEDNSDAY");
			}
		}
		
		
		

	}

}
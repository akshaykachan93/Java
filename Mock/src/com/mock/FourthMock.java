package com.mock;

public class FourthMock {

	public static void main(String args[]) { 
	     
	      String input = "Akshay R Kanchan";
	      System.out.println("The given String is: " + input);
	     
	      int total = 0;
	      
	      int i = 0; 
	      
	      while (i < input.length()) { 
	         
	         if ((input.charAt(i) == ' '))  {
	            total++;  	         }
	         i++;
	      } 
	 
	      System.out.println(" The Total number of Strings are :" +  total);
	   } 
	}
	
	

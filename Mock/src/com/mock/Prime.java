package com.mock;

public class Prime {

	public static void main(String[] args) {
		 int num = 7; 
	        boolean isPrime = true;
	        if (num < 2){
	            isPrime = false; 
	        } else{
	            for (int i = 2; i <= num / 2; i++){ 
	                if (num % i == 0){
	                    isPrime = false;
	                    break; 
	                }
	            }
	        }
	        
	        if(isPrime) {
	        	System.out.print("prime");
	        }else {
	        	System.out.println("not prime");
	        }

	}

}

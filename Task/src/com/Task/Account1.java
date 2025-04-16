package com.Task;

public class Account1 {
	private double amount;
	

	public double getAmount( String role) {
		if(role.equalsIgnoreCase("Director")|| role.equalsIgnoreCase("Employee")) {
			System.out.println(role +" Amount in Account" +amount);
		return amount;
		}
		else {
			System.out.println(role +"Not Allowed to get amount"); 
			return -1;
		}
	}

	public void setAmount(double amount,String role) {
		if(role.equalsIgnoreCase("Director")|| role.equalsIgnoreCase("Manager")){
		this.amount = amount;
		System.out.println(role + " set amount to:" + amount);
		}
		else {
			System.out.println(role +"Not allowed to set amount");
		}
	}

}
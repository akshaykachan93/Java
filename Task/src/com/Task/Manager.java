package com.Task;

public class Manager {

	
	public class Manager extends Employee {
		
		@Override
		public void info() {
			String name = "Ashish";
			int id = 2;
			int salary=20000;
			String role="Manager";
			System.out.println("Emplyee Type And Details");
	        System.out.println("Employee Name :"+name);
	        System.out.println("Employee id :"+id);
	        System.out.println("Employee Salary :"+salary);
	        System.out.println("Employee role :"+role);
	    
	}
		 @Override
		 public void workDone() {
		        System.out.println("Managing the team and reporting progress.");
		    }
		 public void salaryAfterTaxManager() {
		        int salary = 500000;
		        double tax = 0.20;
		        double netSalary = salary - (salary * tax);
		        System.out.println("Manager Salary after 20% tax: " + netSalary);
		    }

	}
}

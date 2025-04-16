package com.Task;
	
	public class Employee {
		

		public void info() {
		       String name = "Akshay";
		        int id = 1;
		       int  salary=50000;
		        String role="Java developer";
		        System.out.println("Emplyee Type And Details");
		        System.out.println("Employee Name :"+name);
		        System.out.println("Employee id :"+id);
		        System.out.println("Employee Salary :"+salary);
		        System.out.println("Employee role :"+role);
		    
		}
		 public void workDone() {
		        System.out.println("Employee does basic operational work.");
		    }
		 public void salaryAfterTaxEmployee() {
		        int salary = 73000;
		        double tax = 0.10;
		        double netSalary = salary - (salary * tax);
		        System.out.println("Employee Salary after 10% tax: " + netSalary);
		    }

	}
	}
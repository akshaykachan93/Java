package com.Task;

public class Director extends Manager {

	
		
		@Override
		public void info() {
			System.out.println("Emplyee Type And Details");
			String name = "Fusion Singh";
			int id = 3;
			int salary=5000000;
	        String role="Director";
	        System.out.println("Employee Name :"+name);
	        System.out.println("Employee id :"+id);
	        System.out.println("Employee Salary :"+salary);
	        System.out.println("Employee role :"+role);
	    
	}
		 @Override
		 public void workDone() {
		        System.out.println("Director is defining the business strategy.");
		    }
		 public void salaryAfterTaxDirector() {
		        int salary = 5000000;
		        double tax = 0.30;
		        double netSalary = salary - (salary * tax);
		        System.out.println("Director Salary after 30% tax: " + netSalary);
		    }
		public static void main(String[] args) {
			Employee e = new Employee();
	        e.info();
	        e.workDone();
	        System.out.println("------------------------------------------------");

	        
	        Manager m = new Manager();
	        m.info();
	        m.workDone();
	        System.out.println("------------------------------------------------");

	        
	        Director d = new Director();
	        d.info();
	        d.workDone();
	        d.salaryAfterTaxEmployee();
	        d.salaryAfterTaxManager();
	        d.salaryAfterTaxDirector();

		}

	}
}

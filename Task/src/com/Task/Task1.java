package com.Task;

public class Task1 {

	public static void main(String[] args) {
				
		        int category = 1;
		        int subCategory = 2;

		        switch (category) {
		            case 1:
		                System.out.println("Category: Electronics");
		                
		                switch (subCategory) {
		                    case 1:
		                        System.out.println("Subcategory: Laptops");
		                        break;
		                    case 2:
		                        System.out.println("Subcategory: Phones");
		                        break;
		                    default:
		                        System.out.println("Subcategory: Unknown");
		                        break;
		                }
		                break;

		            case 2:
		                System.out.println("Category: Clothing");
		                
		                switch (subCategory) {
		                    case 1:
		                        System.out.println("Subcategory: Shirts");
		                        break;
		                    case 2:
		                        System.out.println("Subcategory: Pants");
		                        break;
		                    default:
		                        System.out.println("Subcategory: Unknown");
		                        break;
		                }
		                break;

		            default:
		                System.out.println("Category: Unknown");
		                break;
		                } 
		        }


	}
 

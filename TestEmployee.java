package com.demo.bll;

public class TestEmployee {
	public static void main(String[] args) {
	     
	      Employee e1 = new Employee(8, "Henry", "Alonso", 12500);
	      System.out.println(e1);

	      e1.setSalary(1999);
	      System.out.println(e1); 
	      System.out.println("id is: " + e1.getId());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      //  raiseSalary()
	      System.out.println(e1.getraiseSalary(10));
	      System.out.println(e1);
	   }

}

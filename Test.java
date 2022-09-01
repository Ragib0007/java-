package com.demo.bll;

public class Test {
	 public static void main(String[] args) {
	    
	      Author a1 = new Author();
	      Author a2=new Author("henry","Cavill");
	      Author a3=new Author("HENRY","Cavill","Superman");
	      
	      System.out.println( "First Name:" + a2.getFirstName());
	      System.out.println( "Last Name:" + a2.getLastName());
	      System.out.println( "Book Name:" + a2.getBookName());
	      System.out.println("A3 : " + a3);
	      System.out.println("First Name : " + a1.getFirstName());
	      System.out.println( "Last Name:" + a1.getLastName());
	      System.out.println( "Book Name:" + a1.getBookName());
	      Author a4=null;
	      System.out.println("A4 : " + a4);
	      a4=a2;
	      System.out.println("A4 : " + a4);
	      
	   }


}

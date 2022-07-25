package com.java;

import java.util.Scanner;

public class LadderIfElse {

	public static void main(String[] args) {
		int rollno,s1,s2,s3,total;
		String name;
		double per;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll.No");
	   rollno =sc.nextInt();
	    System.out.println("Enter your Name:");
	    name = sc.next();
	    System.out.println("Enter Physics Marks");
	    s1 = sc.nextInt();
	    System.out.println("Enter Chem Marks");
	    s2 = sc.nextInt();
	    System.out.println("Enter Maths Marks");
	    s3 = sc.nextInt();
	    total = s1+s2+s3;
	    per = (double)total/3;
	    System.out.println("Student Marksheet");
	    System.out.println("Roll.No: "+rollno);
	    System.out.println("Name: "+name);
	    System.out.println("Total Marks Obtatined is"+total+"out of 300");
	    System.out.println("\nPercentage is "+per);
	    if(per>75)
	    {
	    	System.out.println("A+");
	    }
	    else if(per>60)
	    {
	    	System.out.println("A Grade");
	    }
	    else if (per>50)
	    {
	    	System.out.println("B Grade");
	    }
	    else if (per>40)
	    {
	    	System.out.println("C Grade");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
	
	}   
}

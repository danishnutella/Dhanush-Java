
/*
* Conditional statements
* 
* 1) if/else
* 2) Simple if
* 3) nested if/else
* 4) if/else ladder
* 5) Switch statement
*/
package com.java;

import java.util.Scanner;

public class IfStatements {

	 public static void main(String[] args) {

		 int a,b,c;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter A");
		 a = sc.nextInt();
		 System.out.println("Enter B");
		 b = sc.nextInt();
		 System.out.println("Enter C");
		 c = sc.nextInt();
		 if(a>b)
		 {
			 if (a>c)
			 {
				 System.out.println("A is Greater");
			 }
			 else
			 { 
				 System.out.println("C is Greater");
			 }
		 }
		 else
		 {
			 if(b>c)
			 {	 System.out.println("B is Greater");
			 
			 }
			 else
			 { System.out.println("C is Greater");
			 
			 }
		 }
	}
}

package com.java;

import java.util.Scanner;

public class Switch_Demo {
	
	public static void main(String[] args) {
		int a,b,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		a = sc.nextInt();
		System.out.println("Enter B: ");
		b = sc.nextInt();
		System.out.println("A = " + a +"B = "+ b);
		System.out.println("\n*********Choice Calculator*************");
		System.out.println("\nPress 1. for Addition");
		System.out.println("Press 2. for Subtraction");
		System.out.println("Press 3. for Multipacation");
		System.out.println("Press 4. for Division");
		System.out.println("\nPlease Enter your Choice (1-4)");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("\nAddition is "+(a+b));
			break;
		
		case 2 : System.out.println("\nSubtraction is "+(a-b));
			break;
		
		case 3 : System.out.println("\nMultipacation is "+(a*b));
			break;
		
		case 4 : System.out.println("\nDivision is "+((float)a+b));
			break;
		
		default : System.out.println("Invalid Choice");
			break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

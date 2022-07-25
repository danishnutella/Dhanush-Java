package com.java;

import java.util.Scanner;

public class Inputs_Outputs {
	public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A");
	a = sc.nextInt();
	System.out.println("Enter B");
	b = sc.nextInt();
	System.out.println("A = "+a);
	System.out.println("B = "+b);
	System.out.println("A + B = "+(a+b));
	System.out.println("A - B = "+(a-b));
	System.out.println("A * B = "+(a*b));
	System.out.println("A * B = "+(a/(float)b));
	}
}

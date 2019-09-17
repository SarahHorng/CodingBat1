package com.fdmgroup.codingbat;
//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

import java.util.Scanner;

public class makesTen {
	public static void main(String[] args) {
		System.out.println("Please enter in the first number:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Please enter the second number:");
		Scanner scan1 = new Scanner(System.in);
		int b = scan.nextInt();		
		System.out.println(makes10(a,b));
	}

	public static boolean makes10(int a, int b) {
		return (a == 10 || b == 10 || a + b == 10);
	}

}



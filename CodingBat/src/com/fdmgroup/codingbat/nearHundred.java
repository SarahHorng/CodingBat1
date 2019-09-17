package com.fdmgroup.codingbat;

import java.util.Scanner;

public class nearHundred {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		System.out.println(nearHundred(n));				
	}

	public static boolean nearHundred(int n) {
		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}

}

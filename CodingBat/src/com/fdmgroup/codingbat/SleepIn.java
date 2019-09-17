package com.fdmgroup.codingbat;

import java.util.Scanner;

public class SleepIn {

	// Class for testing and setting dummy values

	public static void main(String[] args) {

//		System.out.println("Enter if weekday: ");
//		Scanner scan = new Scanner(System.in);
//		boolean weekday = scan.hasNext();
//
//		System.out.println("Enter if vacation: ");
//		Scanner scan1 = new Scanner(System.in);
//		boolean vacation = scan1.hasNext();

		 boolean weekday = true;
		 boolean vacation = true;

		// Output tests
		System.out.println(cansleepIn(weekday, vacation));
	}

	public static boolean cansleepIn(boolean weekday, boolean vacation) {
		return (weekday != true || vacation == true);

	}
}
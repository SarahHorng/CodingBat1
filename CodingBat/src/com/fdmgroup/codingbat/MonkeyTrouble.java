package com.fdmgroup.codingbat;

import java.util.Scanner;

public class MonkeyTrouble {

	public static void main(String[] args) {

		System.out.println("Is Monkey A Smiling?");
		Scanner scan = new Scanner(System.in);
		boolean aSmile = scan.hasNext();
		System.out.println("Is Monkey B Smiling?");
		Scanner scan1 = new Scanner(System.in);
		boolean bSmile = scan1.hasNext();

		System.out.println(monkeyTrouble(aSmile, bSmile));
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile == bSmile);

	}

}

package com.fdmgroup.codingbat;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		System.out.println("Please enter String you want to Reverse: ");
		
		Scanner scan = new Scanner(System.in);
		String original = scan.nextLine();		
		
		String rev = "";

		for (int i = original.length()-1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println("Reversed String: " + rev);
	}

}
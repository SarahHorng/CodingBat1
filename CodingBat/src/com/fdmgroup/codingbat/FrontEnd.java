package com.fdmgroup.codingbat;

public class FrontEnd {

	public static void main(String[] args) {
		String str = "blast";

		System.out.println(frontBack(str));

	}

	public static String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);

		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}

}

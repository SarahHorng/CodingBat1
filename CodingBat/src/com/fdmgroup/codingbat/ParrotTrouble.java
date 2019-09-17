package com.fdmgroup.codingbat;
public class ParrotTrouble {
	public static void main(String[] args) {

		boolean talking = false;
		int hour= 5;	

		System.out.println( parrotTrouble( talking, hour));
	}

	public static boolean parrotTrouble(boolean talking, int hour) {
		return(talking == true && (hour < 7 || hour > 20));

	}
}
package com.fdmgroup.codingbat;

import java.util.Scanner;

public class BooleanLeapYear    {
    static boolean isLeapYear;

    public static void main(String[] args)
    {
        System.out.println("Enter a year to determine if it is a leap year or not: ");
        Scanner scan = new Scanner(System.in);
        int year =scan.nextInt();
        isLeapYear(year);
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0)
        isLeapYear = false;

        else if ((year % 4 == 0) && (year % 100 == 0))

        isLeapYear = false;

        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
            isLeapYear = true;

        else
            isLeapYear = false;

        System.out.println(isLeapYear);

        return isLeapYear;
    }
}
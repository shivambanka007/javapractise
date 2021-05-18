package com.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Challenge9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double curr=sc.nextDouble();
		System.out.println("US: " + getLocaleInstance(Locale.US,curr) );
		System.out.println("India: " + getIndianCurrencyInstance(curr));
		System.out.println("China: " + getLocaleInstance(Locale.CHINA,curr));
		System.out.println("France: " + getLocaleInstance(Locale.FRANCE,curr));
		sc.close();
	}
	public static String getLocaleInstance(Locale locale,double number) {
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		
		return nf.format(number);
		
	}
	public static String getIndianCurrencyInstance(double number) {
		DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        String formattedAmount ="Rs." + IndianCurrencyFormat.format(number);
		return formattedAmount;
	}
	
}

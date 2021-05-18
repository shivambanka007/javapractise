package com.test;

import java.util.Scanner;

public class ConsecutiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(sumCalculator(number));
		
	}
	public static int sumCalculator(int n) {
		int counter=0;
		for(int d=1;(d*(d+1)/2)<n;d++) {
			double a=((1.0*n-(d*(d+1))/2)/(d+1));
			if(a-Math.floor(a) == 0.0) {
				counter++;
			}
		}
		return counter;
		
	}
}

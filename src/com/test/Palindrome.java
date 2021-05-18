package com.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer strB =new StringBuffer();
		strB.append(str);
		if(((strB.reverse()).toString()).compareTo(str) == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");

		}
	}

}

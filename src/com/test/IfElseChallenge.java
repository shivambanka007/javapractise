package com.test;

public class IfElseChallenge {
	public static void main(String[] args) {
		int n=23;
		String output=weird(n);
		
	}
	public static String weird(int n) {
		if(n%2!=0) {
			return "Weird";
		}
		else if (n%2==0 && n>=2 && n<=5) {return "Not Weird";}
		else if (n%2==0 && n>=6 && n<=20) {return "Weird";}
		else if (n%2==0 && n>20) {return "Not Weird";}
		return null;
	}

}

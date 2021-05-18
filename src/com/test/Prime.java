package com.test;

public class Prime {
    public static void checkPrime(int ... args ) {
    	
    	for (int i:args) {
    		if(isPrime(i)) {System.out.print(i + " ");}
    	}
    	System.out.println();
    }
    public static boolean isPrime(int n) {
    	if(n<2) {
    		return false;
    	}
    	else if (n == 2) {
    		return true;
    	}
    	else if (n%2 == 0) {return false;}
    	for(int i=3;i<=Math.sqrt(n);i+=2) {
    		if(n%i==0) {return false;}
    	}
    	return true;
    }

}

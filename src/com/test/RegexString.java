package com.test;

import java.util.Scanner;

public class RegexString {
	 public static String pattern;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(pattern()));
	        }
		
	}
	
	static String pattern(){
        String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
   return pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
}

}

package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SniffString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			System.out.println(regex(str));
		}
		
	}
	public static String regex(String str) {
		 String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
	        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	        Matcher m = p.matcher(str);
	        while (m.find()) {
                str = str.replaceAll(m.group(), m.group(1));
            }
			return str;
	}
	

}

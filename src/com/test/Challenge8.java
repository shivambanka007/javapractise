package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Challenge8 {
 static int area;

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		int h=sc.nextInt();
		String g=String.valueOf(h);
		System.out.println(g.getClass());
		if((String.valueOf(g.getClass())).equals("class java.lang.String")) {
			System.out.println("Yes");
		}
		if(b<0 || h<0 ) {
		System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		else {
			 area=b*h;
			 System.out.println(area);
		}
		Calendar rightNow = Calendar.getInstance();
		String inputDateStr = String.format("%s/%s/%s",16,05,2021);
		Date inputDate=new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
		rightNow.setTime(inputDate);
		String dayOfWeek = rightNow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		System.out.println(dayOfWeek);
		sc.close();

	}

}

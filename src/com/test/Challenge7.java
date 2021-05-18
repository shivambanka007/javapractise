package com.test;

import java.util.Scanner;

public class Challenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer finalString = new StringBuffer();
		int lineNumber=1;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String nextLine= sc.nextLine();
			finalString.append(lineNumber+" "+nextLine);
			finalString.append(System.lineSeparator());
			lineNumber ++;
			if(nextLine.matches("(.*)end-of-file(.*)")) {sc.close(); break;
			}
			
		}
		System.out.print(finalString);
	}

}

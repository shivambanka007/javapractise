package com.test;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        StringBuffer newStringToPrint=new StringBuffer();
        StringBuilder newNumber=new StringBuilder();
        StringBuffer finalString = new StringBuffer();
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            newNumber.delete(0,finalString.length());
            int totalSpacesToAppend=15-s1.length();
            finalString.append(s1);
            for(int k=0;k<totalSpacesToAppend;k++) {
            	finalString.append(" "); 
            }
            
            if(x<100 && x>=10) {
            	newNumber.append("0"+x);
            }
            if(x<100 && x<10) {
            	newNumber.append("0"+x+"0");
            }
            if(x>=100) {
            	newNumber.append(Integer.toString(x));
            }
            
            newStringToPrint=finalString.append(newNumber);
            if(i!=2) {
            newStringToPrint.append(System.lineSeparator());}
            //Complete this line
        }
        System.out.println(newStringToPrint);
        System.out.println("================================");
	}

}

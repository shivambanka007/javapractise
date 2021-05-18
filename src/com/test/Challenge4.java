package com.test;

import java.util.Scanner;

public class Challenge4 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder seriesSum=new StringBuilder();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long sum=0;
            for(int j=0;j<n;j++) {
            	sum=0;
            	sum+=a;
            	for (int k=0;k<=j;k++) {
            		sum += (long) ((Math.pow(2, k)*b));
            	}
            	
            	seriesSum.append(sum+" ");
            }
            seriesSum.append(System.lineSeparator());
        }
        seriesSum.deleteCharAt(seriesSum.length() - 1);
        System.out.println(seriesSum);
        in.close();
    }

}

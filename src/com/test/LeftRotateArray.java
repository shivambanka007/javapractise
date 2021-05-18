package com.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotateArray {
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int d = in.nextInt();
   int a[] = new int[n];
   for(int a_i=0; a_i < n; a_i++){
       a[a_i] = in.nextInt();
   }
 
   int[] output = rotLeft(a,d);
   for(int i = 0; i < n; i++)
       System.out.print(output[i] + " ");
 
   System.out.println();
   }
   public static int[] rotLeft(int[] a, int d) {
        for(int i=0;i<d;i++){
       int firstLetter=a[0];
       for(int j=0;j<a.length-1;j++){
           a[j]=a[j+1];
       }
       a[a.length-1]= firstLetter;
   }
   return a;
   }

}





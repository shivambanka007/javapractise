package com.test;

import java.util.ArrayList;

public class ExorOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,8,9};
		long minElement=a[0];
		long maxElement=a[0];
		for(int i=0;i<a.length;i++) {
			if(maxElement<a[i])maxElement=a[i];
			if(minElement>a[i])minElement=a[i];
		}
		
	}

}

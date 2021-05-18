package com.test;

import java.util.Arrays;

public class ParkingDillema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cars = {2,10,8,17}; int k = 3;
		Arrays.sort(cars);
		int min =cars[k-1]-cars[0];
		if(k>cars.length) {
			System.out.print(0);
		}
		for(int i=1;i<=cars.length-k;i++) {
			if(min>cars[k+i-1]-cars[i]) {
				min=cars[k+i-1] - cars[i];
			}
		}
		System.out.print(min);
	}

}

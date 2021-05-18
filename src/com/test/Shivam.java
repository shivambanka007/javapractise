package com.test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Shivam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,3,4,2,2,5,6,7,7,7,8,9};
		LinkedHashMap hMap= new LinkedHashMap();
		boolean visited[] = new boolean[arr.length];
		Arrays.fill(visited, false);
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1; j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				visited[j]=true;
				count++;
				}
			}
			hMap.put(arr[i], count);
		}
		System.out.println(hMap);
	}

}
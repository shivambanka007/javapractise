package com.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class RollingStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int T=sc.nextInt();T>0;T--) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b=sc.nextInt();
			if(n==1)System.out.println(0);
			else n--;
			TreeSet<Integer> stones=new TreeSet<Integer>();
			SortedSet<Integer> sortedAns=new TreeSet<Integer>();
			// condition when only one stone
			for(int j=0;j<=n;j++) {
				stones.add((n-j)*b + a*j);
				int stoneCounter=0;
				for(int k : stones) {
					stoneCounter++;
					if(stoneCounter<stones.size()) {
						sortedAns.add(k);
						//System.out.print(k+" ");
					}
					else 
					{	sortedAns.add(k);
						//System.out.println(k);
					}
				}
			}
			Iterator<Integer> ir=sortedAns.iterator();
			while(ir.hasNext()) {
				System.out.print(ir.next()+ " ");
			}
			sc.close();
		}
	}

}

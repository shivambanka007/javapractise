package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeamFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer[] temp={10,30,20,40,70,60,100,20,10};
		ArrayList<Integer> scores = (ArrayList<Integer>) Arrays.asList(temp);
		int teamSize = sc.nextInt();
		int k=sc.nextInt();
		long sumOfMarks=0;
		int startMax=0;
		int endMax=0;
		ArrayList<Integer> startList = new ArrayList<Integer>();
		ArrayList<Integer> endList = new ArrayList<Integer>();
		if(teamSize>=scores.size()) {
			
		}
		for(int i=0;i<teamSize;i++) {
			for(int j=0;j<k;j++) {
				startList.add(scores.get(i));
				endList.add(scores.get(scores.size()-i-1));
			}
			startMax=Collections.max(startList);
			endMax=Collections.max(endList);
			if(startMax>endMax) {
				sumOfMarks+=startMax;
				scores.remove(scores.indexOf(startMax));
			}
			else if (endMax>startMax) {
				sumOfMarks+=endMax;
				scores.remove(scores.indexOf(endMax));
			}
		}
		startList.clear();
		endList.clear();
		System.out.println( sumOfMarks);
	}

}

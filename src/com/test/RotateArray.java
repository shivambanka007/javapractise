package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RotateArray {
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = s.substring(0,k);int smallestASCII=0;
	        String largest = s.substring(0,k);int largestASCII=0;
	        HashSet<String> subStr = new HashSet<String>();
	        for(int i=0;i<s.length()-k+1;i++) {
	        	subStr.add(s.substring(i, i+k));
	        	if((s.substring(i, i+k)).compareTo(smallest)<0) {
	        		smallest = s.substring(i, i+k);
	        	}
	        	if ((s.substring(i, i+k)).compareTo(largest)>0) {
	        		largest = s.substring(i, i+k);
	        	}
	        	System.out.println("Line 17" + s.substring(i,i+k));
	        }
	        
//	        for(int i=0;i<subStr.size();i++) {
//	        	if(((String) subStr.toArray()[i]).compareTo(smallest)<0) {
//	        		smallest = (String) subStr.toArray()[i];
//	        	}
//	        	if (((String) subStr.toArray()[i]).compareTo(largest)>0) {
//	        		largest = (String) subStr.toArray()[i];
//	        	}
//	        }
//	        HashMap<String,Integer> strASCIIPair = new HashMap<String,Integer>();
//	        System.out.println("Line 20" + subStr);
//	        Iterator<String> i = subStr.iterator();
//	        while(i.hasNext()) {
//	        	System.out.println("Line 23" + i.next());
//	        	strASCIIPair.put(i.next(), getASCIIString(i.next()));
//	        }
//	        System.out.println("Line 26" + strASCIIPair);
//	        smallestASCII = (int) strASCIIPair.values().toArray()[0];
//	        smallest = (String) strASCIIPair.keySet().toArray()[0];
//	        largestASCII = (int) strASCIIPair.values().toArray()[0];
//	        largest = (String) strASCIIPair.keySet().toArray()[0];
//	        for(int j=0;j<strASCIIPair.size();j++) {
//	        	if(smallestASCII == (int) strASCIIPair.values().toArray()[j]) {
//	        		// compare the first letter's ascii 
//	        		int asciiFirstChar1=smallest.charAt(0);
//	        		int asciiFirstChar2=((String) strASCIIPair.keySet().toArray()[j]).charAt(0);
//	        		if(asciiFirstChar1 > asciiFirstChar2) {
//	        			smallest = (String) strASCIIPair.keySet().toArray()[j];
//	        		}
//	        	}
//	        	if(smallestASCII>(int) strASCIIPair.values().toArray()[j]) {
//	        		smallestASCII=(int) strASCIIPair.values().toArray()[j];
//	        		smallest=(String) strASCIIPair.keySet().toArray()[j];
//	        	}
//	        	if(largestASCII == (int) strASCIIPair.values().toArray()[j]) {
//	        		// compare the first letter's ascii 
//	        		int asciiFirstChar1=smallest.charAt(0);
//	        		int asciiFirstChar2=((String) strASCIIPair.keySet().toArray()[j]).charAt(0);
//	        		if(asciiFirstChar1 < asciiFirstChar2) {
//	        			largest = (String) strASCIIPair.keySet().toArray()[j];
//	        		}
//	        	}
//	        	if(largestASCII<(int) strASCIIPair.values().toArray()[j]) {
//	        		largestASCII=(int) strASCIIPair.values().toArray()[j];
//	        		largest=(String) strASCIIPair.keySet().toArray()[j];
//	        	}
//	        }
//	        System.out.println("Line 56" + strASCIIPair);
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	    public static int getASCIIString(String s) {
	    	int asciiOfString=0;
	    	for(int i=0;i<s.length();i++) {
	    		asciiOfString += s.charAt(i);
	    	}
			return asciiOfString;
	    	
	    }

}

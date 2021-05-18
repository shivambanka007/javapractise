package com.test;

import java.util.HashMap;
import java.util.LinkedList;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new SinglyLinkedList();
		
	}
	
	static boolean isAnagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		HashMap<Character,Integer> freqA=new HashMap<Character,Integer>();
		HashMap<Character,Integer> freqB=new HashMap<Character,Integer>();
		if(a.length()!=b.length())return false;
		for(int i=0;i<a.length();i++) {
			freqA.put(a.charAt(i), charFreq(a.charAt(i),a));
			freqB.put(b.charAt(i), charFreq(b.charAt(i),b));
		}
		if(freqA.equals(freqB)) {return true;}
		else {
		return false;}
        // Complete the function
		
    }
	static int charFreq(Character c, String str) {
		int counter=0;
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {counter++;}
		}
		return counter;
		
	}

}

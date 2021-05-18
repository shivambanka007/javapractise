package com.test;

import java.util.Scanner;
import java.util.Stack;


public class Challenge5 {
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(isBalanced(in.next()));
		}
        
		in.close();
	}
	public static String isBalanced(String s) {
		 Stack<Character> stack  = new Stack<Character>();
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) {     
	                stack.push(c);
	            } else if(c == ']') {
	                if(stack.isEmpty() || stack.pop() != '[') {
	                    return "false";
	                }
	            } else if(c == ')') {
	                if(stack.isEmpty() || stack.pop() != '(') {
	                    return "false";
	                }           
	            } else if(c == '}') {
	                if(stack.isEmpty() || stack.pop() != '{') {
	                    return "false";
	                }
	            }

	        }
	        if(stack.isEmpty()) {return "true";}
	        else {return "false";}
		
	}
}

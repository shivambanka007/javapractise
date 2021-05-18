package com.test;

import java.util.Scanner;
import java.util.Stack;

public class HtmlCase {

public static void main(String[] args){
		
		//Scanner in = new Scanner(System.in);
		int testCases = 1;//Integer.parseInt(in.nextLine());
		String[] in= {"<h1><h1>Sanjay</h1></h1><par>So</par>"
		};
		Stack<String> stack = new Stack<String>();
		while(testCases>0){
			String line = in[testCases-1];
			int count1=0;
			int idxStartFlag1=0;int idxStartFlag2=0;
			int idxEndFlag1=0;int idxEndFlag2=0;
			String tag="";
			String tagEnd="";
			String text="";
			StringBuffer finalString= new StringBuffer();
			for(int i=0;i<line.length();i++) {
				//start tag
				if(line.charAt(i)=='<' && line.charAt(i+1)!='/') {
					idxStartFlag1=1;
				}
				//end tag
				if(line.charAt(i)=='/' && line.charAt(i-1)=='<') {
					idxEndFlag1=1;
				}
				// read end tag
				if(idxEndFlag1==1 && line.charAt(i)!='/' && line.charAt(i)!='>') {
					tagEnd+=line.charAt(i);
				}
				//read start tag
				if(((idxStartFlag1==1||idxEndFlag1==1) && line.charAt(i)!='<' && line.charAt(i)!='>' && line.charAt(i)!='/')) {
					tag+=line.charAt(i);
				}
				if(line.charAt(i)=='>') {
					if(tagEnd.length()>0) {
						if(stack.peek().toString().equals(tagEnd) ) {
							stack.pop();
							idxEndFlag1=0;
							idxEndFlag2=0;
							finalString.append(text);
							text="";
							tagEnd="";
							tag="";
						}
						else {
							stack.pop();
							int last = finalString.lastIndexOf("\n");
							if (last >= 0) { finalString.delete(last, finalString.length()); }
							finalString.append("None");
							finalString.append("\n");
							text="";
							tagEnd="";
							tag="";
							
						}
					}
					if(tag.length()>0) {
					stack.push(tag);
					idxStartFlag1=0;
					tag="";// CLeaning the tag after use
					idxStartFlag2=1;
					}
				}
				if(idxStartFlag2==1 && idxStartFlag1!=1 && line.charAt(i)!='>' && line.charAt(i)!='<' && line.charAt(i)!='/' && idxEndFlag1!=1)
					text+=line.charAt(i);
			}			
			System.out.print(finalString);
			finalString.delete(0, finalString.length());
			testCases--;
		}
	}

}

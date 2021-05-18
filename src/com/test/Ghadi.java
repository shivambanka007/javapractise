package com.test;

import java.util.Map;

public class Ghadi {
	static char[] cArray={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
		    'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public static void main(String[] args) {
		String s="AZGB";
		
			    char[] inputStringArray=s.toCharArray();
			    long totalTime=0L; long temp=0;long zIndex=0;int flag=0;
			    for(int i=0;i<inputStringArray.length;i++){
			        for(int j=0;j<cArray.length;j++){
			            if(inputStringArray[i] == cArray[j]){
			                if((j+zIndex)>13){
			                    temp=26-j;
			                    totalTime+=temp;
			                    zIndex=j-26;
			                    break;
			                }
			                else{
			                	temp=totalTime;
			                    totalTime=totalTime+j;
			                    zIndex=j;
			                    break;
			                }
			            }
			        }
			        if(zIndex<0) {//shift left
			        	shiftRightByOne((int) Math.abs(zIndex));
			        }
			        else if (zIndex>0) {
			        	//shift right
			        	shiftLeftByOne((int) Math.abs(zIndex));
			        }
			    }
			    System.out.println(totalTime);
			    }
	public static void shiftRightByOne(int zIndex) {
		for(int i=0;i<zIndex;i++) {
			for(int j=cArray.length-1;j>0;j--) {
				char c=cArray[j];
				cArray[j]=cArray[j-1];
				cArray[j-1]=c;
			}
		}
		System.out.println("Right Rotation by :"+zIndex+" times, array is: "+cArray[0]);
	}
	public static void shiftLeftByOne(int zIndex) {
		for(int i=0;i<zIndex;i++) {
			char in=cArray[0];
			for(int j=0;j<cArray.length-1;j++) {
				cArray[j]=cArray[j+1];
			}
			cArray[cArray.length-1]=in;
		}
		System.out.println("Left Rotation by :"+zIndex+" times, array is: "+cArray[0]);
	}

}

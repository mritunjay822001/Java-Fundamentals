package com.patternmatching;
import java.util.Scanner;
public class PatternMatchingConcepts {

	public static void main(String[] args) {
		
      Scanner scn=new Scanner(System.in);
      System.out.print("enter row numbers");
      
      int a=scn.nextInt();
       for(int i=1; i<=a; i++) {
    	   
    	   for(int j=1; j<=i; j++) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();   
       }
		//--------------------------------------
         for(int i=1;i<=5; i++) {
        	  
        	 for(int j=1; j<=10; j++) {
        		 System.out.print(j);
        	 }
        	 System.out.println();
         }
         //----------------------------------------
           for(int i=1; i<=10; i++) {
        	   
        	   for(int j=1; j<=i; j++) {
        		   
        		   System.out.print("abc");
        	   }
        	    System.out.println();
           }
           //-------------------------------------
           
            for(int i=1; i<=5; i++) {
            	
            	for (int j=1; j<= 6-i; j++) {
            		 
            		
            		System.out.print("*  ");
            	}
            	  System.out.println();
            }
           // ----------------------------------
            
            int a1=1;
            for(int i=1; i<=5;i++) {
            	
            	for (int j=1; j<=i; j++) {
            		 System.out.print(a1);
            		 a1++;
            		
            	}
            	System.out.println();
            	
            }
	}
}

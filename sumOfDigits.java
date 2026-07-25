package com.assignments;
import java.util.*;

public class sumOfDigits {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.print("enter any number");
      int a=scn.nextInt();
      int b;
      int sum=0;
      while(a>0) {
    	 b=a%10;
    	 sum=sum+b;
    	 a=a/10;
    	 
      }
         System.out.println(sum);		
	}

}

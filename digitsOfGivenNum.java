package com.assignments;
import java.util.*;

public class digitsOfGivenNum {

	public static void main(String[] args) {
      
	Scanner scn=new Scanner(System.in);
	 System.out.print("enter any number");
	 int a=scn.nextInt();
	 int b;
	 while(a>0)
	 {
		 
		 b=a%10;
		 System.out.println(b);
		 a=a/10;
	 }
	
	
	
	
	}

}

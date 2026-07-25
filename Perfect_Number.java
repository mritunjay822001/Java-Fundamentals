package com.assignments;
import java.util. Scanner;

public class Perfect_Number {

	public static void main(String[] args) {

		  Scanner scn= new Scanner(System.in);
		  System.out.print("Enter any positive no");
		  int a=scn.nextInt();
		  int num=0;
		  for(int i=1;i<a;i++)
		  {
			  if(a%i==0)
			
				  num=num+i;
		  }
		   if(num==a) {
			   System.out.println("perfet number");
		   }
		   else
		   {
			   System.out.println("not a perfect number");
		   }
	}

}

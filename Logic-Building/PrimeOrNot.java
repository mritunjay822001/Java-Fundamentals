package com.practices;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter any number");
		int a=scn.nextInt();
		boolean b=false;
		for(int i=2;i<=a;i++)
		{
		
			if(a%i==0)
			{
				b=false;
			break;
			}
	}
		if(b)
			System.out.println("given number is prime");
		else
			System.out.println("given number is not prime");
		
	}
}
		
	
	 
	

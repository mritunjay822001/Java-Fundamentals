package com.practices;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number");
		int a=scn.nextInt();
		int sum=0;
		for(int i=1;i<=a-1;i++)
		{
			if(a%i==0)
				sum=sum+i;
		}
		if(sum==a)
		{
			System.out.println("number is perfect");
			
		}else
			System.out.println("number is not perfect");


	}

}

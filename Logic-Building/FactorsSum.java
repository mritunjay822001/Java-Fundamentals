package com.practices;
import java.util.*;

public class FactorsSum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter any number");
		int a=scn.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				sum=sum+i;
			
		}
		System.out.println("sum of factors are:"+ sum);

	}

}

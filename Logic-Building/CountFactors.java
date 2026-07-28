package com.practices;
import java.util.*;

public class CountFactors {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter any number");
		int a=scn.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				count++;
		}
		System.out.println(count);
      
		
		
		
		
		
		
		
	}

}

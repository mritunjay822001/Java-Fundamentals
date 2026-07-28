package com.practices;
import java.util.*;

public class PrimeChecker2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number");
		int a=scn.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			
			if(a%i==0)
			
				count++;
		}

	
	if(count==2)
		System.out.println("it is prime number");
	else
		System.out.println("it is not a prime number");

}
}
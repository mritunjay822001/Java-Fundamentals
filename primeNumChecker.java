package com.assignments;
import java.util.*;

public class primeNumChecker {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter any number");
        int a=scn.nextInt();
        boolean b=true;
        for(int i=2;i<a;i++)
        {
        	if(a%i==0)
        	{
        		b=false;
        		break;
        	}
        }
          if(b)
        System.out.println("given number is a prime number");
          else
      System.out.println("given number is not a prime number");
	
	}

}

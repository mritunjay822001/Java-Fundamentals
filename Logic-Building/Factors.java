package com.practices;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		 System.out.print("enter a number");
		 int a=scn.nextInt();
		 for(int i=1;i<=a;i++)
		 {
			 if(a%i==0)
				 System.out.println(i);
			 scn.close();
				 
		 }

	}

}

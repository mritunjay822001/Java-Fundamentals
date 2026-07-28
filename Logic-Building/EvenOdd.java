package com.practices;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter any number");
		int a=scn.nextInt();
		if(a%2==0)
			System.out.println("Given number is even");
		else
			System.out.println("given number is odd");
		scn.close();
	}
}

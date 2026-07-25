package com.assignments;

public class Assignments_1 {

	public static void main(String[] args) {
      
		double d=5.2;
		float b=3.2f;
		int i=(int)(d+b);
		System.out.println(i);//8
		
	//	char a='A';
		//short s=3;
	//byte b1=a+s; error- int can't assigned to byte implicitly
		
		char a='A';
		short s=3;
		byte b1=(byte)(a+s);// narrowing conversion
		System.out.println(b1);//68
		
		 int i1=5;
		 char c='A';
		 float f=i1+(float)c;// float+int=float
		 System.out.println(f);//70.0
		 
		// char c1="A"; error its string not char i.e.. 'A' correct
		// int i2=c1;
		// System.out.println(i2);
		 
		 char c1='A';
		 int i2=c1;
		 System.out.println(i2);// 65
		 
		// boolean true=false; error true,false & null can't be use as identifier
		// boolean false=!true;
		// System.out.println(false);
		 
		 int $i3=10;
		 int i3$=20;
		 int $=$i3+i3$;// valid because '$' and '_' can be used as identifiers
		 System.out.println($);// 30
		 
		// int _i4=5;
		// int i4_=3;
		// int -i4=_i4*i4_; error '-' can't used as identifer
		// System.out.println(-i4);
		 
		      int _i4=5;
			  int i4_=3;
		      int i_4=_i4*i4_; 
		      System.out.println(i_4);//15
		      
		      int NULL=10;
		      short Null=20;
		      double nuLL=NULL*Null;
		      System.out.println(nuLL);//200.0
		      
		      char c2='A';
		      byte b4=(byte)c2; //Narrowing conversion
		      System.out.println(b4);//65
		      
		      short s2=10;
		      long l=(long)s2;
		      System.out.println(l);//10
		      
		   //   float f11=5.25;  error float type must suffixed with 'F' or 'f'
		    //  float f12=2.25;  error float type must suffixed with 'F' or 'f'
		     // double d11=f11-f12;
		     // System.ount.println(d11);
		      
		      float f11=5.25f;
		      float f12=2.25f;
		      double d11=f11-f12;
		      System.out.println(d11);//3.0
		      
		      char c13='B';
		      char c14='A';
		      int i11=c13-c14;
              System.out.println(i11);
              
              
		
		
		
	}
	
	

}

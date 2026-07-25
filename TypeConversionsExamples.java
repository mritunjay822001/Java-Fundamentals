package com.javafundamentals;

public class TypeConversionsExamples {
	public static void main(String args[]) {
	int i=55;
	byte b=(byte)i;
	System.out.println(i);
	
    //char a='a';
   // byte b1=a; Char cannot stored in byte & vice versa implicitly
   // System.out.println(b1);
	char a='a';
	byte b1=(byte)a;
	System.out.println(b1);
	
	//float f=455.55f;
	//int i1=f; we can't stored float in int implicitly
	//System.out.println(i1);
	float f=455.55f;
	int i1=(int)f;
	System.out.println(i1);
	
	//double d=44.55;
	//long l1=d; we cannot store double in long implicitly
	//System.out.println(l1);
	double d=44.55;
	long l1=(long)d;
	System.out.println(l1);
	
	char c='C';
	int i2=c;//Windening conversion(IMPLICITY)
	System.out.println(i2);
	  
	/* short s=555;
	   byte b2=s; we cannot stored short type in byte implicitly narrowing conversion required explicit conversion
	   System.out.println(b2);
	*/
	//float f1=99.88f;
	//char c1=f1; narrowing conversion required explicit conversion
	//System.out.println(c1);
	
	   float f1=99.88f;
	   char c1=(char)f1;
	   System.out.println(c1);
	   
	   int i3=999999;
	   double d1=i3;
	   System.out.println(d1);
	   
	   char c2='J';
	   double d2=c2;
	   System.out.println(d2);
	   
	   float f2=7575.888f;
	   short s1=(short)f2;
	   System.out.println(s1);
	   
	   short s2=987;
	   char c3=(char)s2;
	   System.out.println(c3);
	   
	   byte b3=12;
	   byte b4=b3;
	   System.out.println(b4);
	   
	    char c4='Z';
	    int i4=c4;
	    System.out.println(i4);
	    
	    float f3=567.55f;
	    short s3=(short)f3;
	    System.out.println(s3);
	    
	    int i5=9897979;
	    long l2=i5;
	    System.out.println(l2);
	    
	    long l3=76786787l;
	    float f4=l3;
	    System.out.println(f4);
	    
	    double d5=6666.66;
	    float f5=(float)d5;
	    System.out.println(f5);
	    
	     char c5='X';
	     float f6=c5;
	     System.out.println(f6);
	     
	     long l4=998888l;
	     int i6=(int)l4;
	     System.out.println(i6);
	     
	     double d6=7655656.99;
	     char c6=(char)d6;
	     System.out.println(c6);
	     
	     int i7=9877888;
	     char c7= (char)i7;
	     System.out.println(c7);
	     
	     //boolean b11=true;
	    // int i8=b11; boolean cannot conver to other types and vice versa
	    // System.out.println(i8);
	     
	     int i9=88777;
	     double d7=i9;
	     System.out.println(d7);
	    

}
}

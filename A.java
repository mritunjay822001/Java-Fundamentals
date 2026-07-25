package com.polymorphism;

class A {
	
	void show()
	{
		System.out.println("A class");
	}
	  void print()
	  {
		  System.out.println("print()method");
	 
	
	  }
}


  class B extends A
  {
	  void show()
	  {
		  System.out.println("B class");
	  }
	   void  print()
	   {
		   System.out.println("b class print()");
	   }
	    void display()
	    {
	    	System.out.println("display() mrthod");
	    }	  
	  
  }
  
       class  Call
       {
    	  public static void main(String[] args) {
    		  
    		  A a=new A();
    		   a.show();
    		   a.print();
    		   
    		   A a1=new B();
    		   a1.print();
    		   a1.show();
    		  
    		  
    	  }
    	   
    	   
    	   
       }

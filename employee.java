/* program to initialize variables with constructor  
 */

package com.constructors;

 class employee {
	int empid;
	String name;
    float salary;
    
     employee(int empid,String name,float salary)
     
     {
    	 this.empid=empid;
    	 this.name=name;
    	 this.salary=salary;
     }




    	   public static void main(String[] args) {
    		 employee e1=new employee(1001,"MRITUNJAY",55000.00F);
    		 employee e2=new employee(1002,"SIDHU", 50000.00f);
        System.out.println(e1.empid+"\t"+e1.name+"\t"+e1.salary) 	;
        System.out.println(e2.empid+"\t"+e2.name+"\t"+e2.salary);
    		 
    		 
    		 
    	 }
     }

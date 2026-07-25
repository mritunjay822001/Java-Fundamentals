package com.inheritance;

public class student {      
		int sid;
		String name;
		 float fee;
		 student(int sid,String name,float fee)
		 {
			this.sid=sid;
			this.name=name;
			this.fee=fee;
		 }
		 
	}
        class details extends student
        {
        	String address;
        	 long mobNo;
        	 details(int sid,String name,float fee,String address, long mobNo){
        		 
        	 super(sid,name,fee);
        	 this.address=address;
        	 this. mobNo=mobNo;
        }
        }
         class call
         {
        	 public static void main(String[] args)	 {
        		 
        	 
        	 details d=new details(1001,"mj",550000.00f,"hyd",9801178010l);
        	 System.out.println(d.sid);
        	 System.out.println(d.name);
        	 System.out.println(d.fee);
        	 System.out.println(d.address);
        	 System.out.println(d.mobNo);
        	 student s=new details(1002,"sidhu",75000.00f,"punjab",987698765l);
        	 System.out.println(s.sid);
        	 System.out.println(s.name);
        	 System.out.println(s.fee);
        	// System.out.println(s.address); we cannot access it
        	// System.out.println(s.mobNo);// sub class obj refers to super class member only
         

         }
         }
        
        

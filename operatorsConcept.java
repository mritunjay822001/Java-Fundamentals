package com.operators;

public class operatorsConcept {

	public static void main(String args[]) {
		
		  int a=2, b=6;
		    System.out.println(a/b);
		    System.out.println(a%b);
		    System.out.println(a*b);
		    
		    int a1=10,b1=3,c1=2;
		    
		    int d=a1*b1/c1;
		    
		    int d1=a1/b1*c1;
		    
		    System.out.println(d);
		    System.out.println(d1);
		    
		    int a2=15,b2=10,c2=5;//innermost bracket executed first LEFT to RIGHT
		    int d2=((a*b/2))+((c2%a2+b2))-(a2+b2*c2);
		    
		    System.out.println(d2);
		    
		    float f1=768.99f;
		    double d3=98767;
		    short s1=999;
		    int i2=(int)((f1*s1+d3))-(int)((d3-f1+s1))+(int)(f1*s1-d3);// precedence
		    System.out.println(i2);
		    
		    int i5=165;
		    int i6=95;
		    System.out.println(i5==i6 );
		    System.out.println(i5!=i6);
		    
		    int i7= -987;
		    int i8= -876;
		    System.out.println(i7>i8);
		    System.out.println(i7<i8);
		    
		    float f2=876.99f;
		    int i9= 876;
		    System.out.println(f2>=i9);
		    System.out.println(f2<=i9);
		    
		    char ch1='C';
		    int i10= 104;
		    System.out.println(ch1!=i10);
		    System.out.println(ch1<=i10);
		    
		    int i11=25;
		    int i12=27;
		    
		    int i13=++i11;
		    int i14=i12++;
		    System.out.println(i13);
		    System.out.println(i14);
		    
		    int i15=14,i16=18,i17=19;
		    int i18=((++i5*i16++))+((i17++%i15));
		    System.out.println(i18);
		    
		    int i19=99;
		    int i20=101;
		    
		    int i21= --i19;
		    int i22= i20--;
		    System.out.println(i21);
		    System.out.println(i22);
		    
		   int i23=15, i24=20;
		   int i25=i23++ * ++i24;
		   System.out.println(i23);
		   System.out.println(i24);
		   System.out.println(i25);
		   
		   int i26=80, i27=5, i28=4;
		     --i26;
		       i27++;
		        i28--;
		           int i29=((i26%i27+i28))-((i28/i26*i27));
		           System.out.println(i29)  ; 
		       
		       int i30=10;
		       ++i30;
		       int i31=++i30;
		       System.out.println(i31);// 12
		       System.out.println(i31++);//12 then 13
		       System.out.println(--i31); //13 decrease by 1 then store in i31 i.e.. 12
		       System.out.println(i31--);// 12 then decrease by 1 i.e.. 11
		       
		       //-------------------BITWISE OPERATOR---(output will be in form of 0s and 1s)------------------------
		       //-------------------LOGICAl OPERATOR------------------------------
		      int i32=11, i33=13;
		      System.out.println(i32&i33);
		      System.out.println(i32|i33);
		      System.out.println(i32^i33);
		         
		      int i34=22, i35=24;
		      System.out.println(i34&i35);
		      System.out.println(i34|i35);
		      System.out.println(i34^i35);
		      
		        int i36=15, i37=17, i38=11;// bitwise AND concept
		        boolean b3=(i37>i36)&(--i36>i38);// it always evalutes second expression
		        System.out.println(b3);
		        System.out.println(i36);
		        
		        int i39=24, i40=27,i41=19; 
		        boolean b4=(i40<i39)&&(--i39>i41);// LOGICAL AND concept, it evaluates second exp only  if first exp returns true otherwise no
		        System.out.println(b4); //FALSE
		        System.out.println(i39);//24
		        
		        int i42=55,i43=59,i44=60;
		        boolean b5=(i42<i43)&&(++i42>i44);
		        System.out.println(b5); // it evaluates second exp cz first expressionn is true in this case...... FALSE
		        System.out.println(i42);// 56
		        
		        int i45=15, i46=16,i47=9;
		        boolean b6=(i46>145)|(++i47<i45);//bitwise OR operator---- it always evaluates second exp cz this op always checks 2nd cond..
		        System.out.println(b6);
		        System.out.println(i47);
		        
		        
		        int i48=99, i49=56, i50=37;
		        boolean b7=(i49>i48)||(--i50<i49);// Logical OR  it evaluaytes second exp only if first will return false otherwise not....
		        System.out.println(b7);
		        System.out.println(i50);
		        
		        
		        int i51=88,i52=87,i88=55;
		        boolean b8=(i52>i88)||(++i88<i51);// it will not evaluate second exp cz frist exp returns true.....
		        System.out.println(b8); // true
		        System.out.println(i88);//55
		        
		         int i53=88,i54=77,i55=77;
		         boolean b9=(i55>i53)^(++i54<i53); // bitwise XOR
		         System.out.println(b9);
		         System.out.println(i54);
		         
		          int i56=9;
		          int i57=i56<<2; // left shift by 2
		          int i58=i56>>3; // right shift by (3) byte code will shifted by 3rd place from right side in thr form of os 1s...
		          System.out.println(i57);
		          System.out.println(i58);
		        
		          int i59=5;
		          int i60=~i59; // compliment operator 
		          System.out.println(i60);
		          
		          int i61=5,i62=4;
		          i61*=i62; // implicitly it is written as i61=i61*i62  i.e... 5*4=20
		          System.out.println(i61);
		          System.out.println(i62);
		          
		        // ----- -----------Conditional Operator-------------
		          
		          int i63=8, i64=7;
		          int i65=i63>i64?i63:i64;
		          System.out.println(i65);
		          
		          int i66=8,i67=17,i68=13;
		         int i71=(i66>i67)&&(i66>i68)?i66:(i67>i68)?i67:i68;
		         System.out.println(i71);
		         
		         
		       //  -----UNARY PLUS & UNARY MINUS OPERATOR---------
		         
		     int i72=5,i73=3;
		     i72=-i73;
		     System.out.println(i72);
		     System.out.println(i73);
		     
		    //Normal Expression VS Uniary plus and uniary minus expression
		     
		     int i74=55,i75=56;
		     i74+=i75; //normal expression it is wriiten as i74=i74+i75
		     System.out.println(i75);
		     System.out.println(i74);
		     
		     int i76=11,i77=12;
		     i76=+i77;
		     System.out.println(i76);
		     System.out.println(i77);
		       
		     // END  
		       		      
		    	   
	}

}


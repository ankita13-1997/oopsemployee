package com.oops;

public class EmployeemethodUc7 {
	static int full=1;
    static int part=2;
    
     int fulltime;
     int parttime;
     //String companyname="";
     //static int totalsalary
    	 
     static int WagePerHour= 20;
     //int fullDayHour=12;
    // int partDayHour=8;
    static int time =0;
     int days=0;
     static int  totalsalary;
     static int d;
     static void calsal() 
     {
    	 for( d=0 ; d<=20 ; d++)
         {
      	while(time<=100)
      	{
      		 int check = (int) (Math.floor(Math.random()*10)%3);
      	    	System.out.println(check);
      	    	 if(check==full)
      	         {   
      	         	System.out.println("employee is present in full time");
      	         	time=time+12;
      	         	System.out.println(time);
      	         	
      	         	
      	         }
      	         
      	         else if(check==part)
      	         {
      	         	System.out.println("employee present is part time");
      	         	time=time+8;
      	         	System.out.println(time);
      	         }
      	         
      	         else
      	         {
      	         	System.out.println("employyee is absent");
      	         	time=time+0;
      	         	System.out.println(time);
      	         }
      		
      	}
      	
         }
    	 totalsalary=time*WagePerHour;
         System.out.println("employee total salary is " +totalsalary);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calsal() ;
	}

}

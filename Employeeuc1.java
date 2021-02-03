package com.oops;

public class Employeeuc1 extends EmployeeAttendenceuc2 {
	int WagePerHour= 20;
	int fullDayHour=12;
	static int check = (int) (Math.floor(Math.random()*10)%3);
	int full=1;
   static  int part=2;
    
      static int totalwokingdays=20;
     // int partDayHour=8;
     
      int days=0;
      static int time; 
	void attend()
	{
		   
		             
        		 
		             System.out.println(check);
        	    	 if(check==full)
        	         {   
        	         	System.out.println("employee is present in full time");
        	         	time=time+12;
        	         }
        	         
        	         else if(check==part)
        	         {
        	         	System.out.println("employee present is part time");
        	         	time=time+8;
       	             }
        	         
        	         else
        	         {
        	         	System.out.println("employyee is absent");
        	         	time=time+0;
        	         }
        	    	  
        	    	 
        	    	 
        	    	 
        		
        	
	}

}

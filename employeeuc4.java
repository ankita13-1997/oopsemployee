package com.oops;

 class employeeuc5  extends employeeuc2
 {
	 static int totalwokingdays=20;
	 int totalwage;
	 int dailywage;
	  void total() {
		  for(int i=1 ; i<=20 ; i++) {
			 int check = (int) (Math.floor(Math.random()*10)%3);
		     System.out.println(check); 
	    	 if(check==full)
	         {   
	         	System.out.println("employee is present in full time");
	         	time=time+12;
	         	dailywage=time*WagePerHour;
	         }
	         
	         else if(check==part)
	         {
	         	System.out.println("employee present is part time");
	         	time=time+8;
	         	dailywage=time*WagePerHour;
             }
	         
	         else
	         {
	         	System.out.println("employyee is absent");
	         	time=time+0;
	         	dailywage=time*WagePerHour;
	         }
	         }
	// TODO Auto-generated constructor stub
	
	 
	 int totalwage=totalwokingdays*dailywage;
	 
	 System.out.println("your monthly salary is : "+totalwage);
	  
 }

}

package com.oops;

public class EmployemethodUc8 {
	 int full=1;
     int part=2;
    
     int fulltime;
     int parttime;
     StringBuilder companyname=new StringBuilder();
     //static int totalsalary
    	 
     int WagePerHour;
     //int fullDayHour=12;
    // int partDayHour=8;
     int time;
     int days;
     int  totalsalary;
     
     public void Calcmethod(String companyname,int fulltime, int parttime,int WagePerHour)
     {
    	/**StringBuilder st= this.companyname;
    	 int f=this.fulltime;
    	 int p=this.parttime;
    	 int w=this.WagePerHour;
    	 **/
    	 for(int d=0 ; d<=20 ; d++)
         {
      	while(time<=100)
      	{
      		 int check = (int) (Math.floor(Math.random()*10)%3);
      	    	System.out.println(check);
      	    	 if(check==full)
      	         {   
      	         	System.out.println("employee is present in full time");
      	         	time=time+fulltime;
      	         	System.out.println(time);
      	         	
      	         	
      	         }
      	         
      	         else if(check==part)
      	         {
      	         	System.out.println("employee present is part time");
      	         	time=time+parttime;
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
		EmployemethodUc8 toggle= new EmployemethodUc8();
		toggle.Calcmethod("dxc", 12, 6,40);
		toggle.Calcmethod("digt", 20, 10,90);

	}

}

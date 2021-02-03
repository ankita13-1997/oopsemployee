package com.oops;

public class sitchcase extends EmployeeAttendenceuc2 {
	int check = (int) (Math.floor(Math.random()*10)%3);
	 void switch1() {
		    System.out.println("solved using switch case");
	        switch(check)
	            {
	                case 1:
	                	System.out.println("employee is present in full time");
	                	break;
	                	
	                case 2 :
	                	System.out.println("employee is present half time");
	                	break;
	                	
	                	
	                	default :
	                		System.out.println("employee is absent");
                }
	   
	 }
}

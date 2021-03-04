import java.util.Scanner;

public class EmployeeDetail {

	public static void main(String[] args) {
		
		 String employeid;
	      String empname;
	      int basicsalary, HRA, DA, netsalary, PF;
	      
	     
	      
	        Scanner scan= new Scanner(System.in);
	        
	        System.out.println("Enter the employee id");
	        employeid=scan.next();
	        System.out.println("Enter the employee name");
	        empname=scan.next();
	        System.out.println("Enter the basic salary of an employee");
	        basicsalary=scan.nextInt();
	      
	        HRA=(10/100)*basicsalary;
	        PF=(10/100)*basicsalary;
	        DA=(73/100)*basicsalary;
	        netsalary=(basicsalary+ HRA+ DA)- PF;
	      
	     
	
	    
	      {
	        System.out.println("Employeeid  :  "+employeid+"n"+"Employename  :  "+empname+"n"+"Employee basic salary :  "+basicsalary+"n"+"HRA  :  "+HRA+"n"+"DA  :  "+DA+"n"+"GS  :  "+GS+"n"+"Incometax  :  "+incometax+"n"+"netsalary  :  "+netsalary);
	      }
	     
	 
	}

	
}
	




package java_exception;

import java.util.Scanner;

public class Try_Catch {
	
/*When program throw some exception, you can handle it by using try catch block. Try block contain code which throw exception and catch block contains
  exception to handle that exception. You can use multiple catch block with one try block.
 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); // By using scanner class we can take input from the user. 
		
		
		   System.out.println("Enter a number : ");
		    
		    int num=sc.nextInt(); // we taking 1 integer number. 
		    
		    try {  // The statement which throws exception those statements we put in try block. 
		    	
		    System.out.println(100/num); //which ever number user is providing we divided it by 100. 
		    
		    }
		    catch(ArithmeticException e) {  // In catch block we have to provide exception type with 1 variable. 
		    
		    System.out.println("Invalid Data");  // Here in catch we can provide Exception error message. 
		    	
		    }
		    System.out.println("Program is completed ");
		    System.out.println("Program is exited "); 
			
// When program throws exception then catch block is execute and rest of the program will continue and we avoid program termination. 
	}

}

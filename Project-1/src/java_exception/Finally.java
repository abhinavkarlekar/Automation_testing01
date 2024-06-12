package java_exception;

public class Finally {

/* This block is executed irrespective of exception or not.
This block executes if program run successfully, even if program doesn't run due to exception.
If script caught fail in middle due to an exception, it comes down check for finally block and executes all statement present in finally block.
This finally block write after try and catch.
*/

	public static void main(String[] args) {
		
	System.out.println("Program is started ");

	String s=null;    
	try {
	System.out.println(s.length()); // This statement will thrown Exception. 
	}
	
	catch (NumberFormatException e) {  
		
		System.out.println("handled Exception ");	
		System.out.println(e.getMessage()); 
			
	}
	finally {  // Finally block is always executed even exception is occurred even finally block is executed. 
		
	System.out.println("You entered into finally block "); 
	
	}
	
	System.out.println("Program is finish ");
	
	}

}

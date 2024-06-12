package java_exception;
import java.lang.Exception;

public class Multiple_catch_block {
	
/* If one statement throw one particular exception and you handle it by using catch block with specific exception. But that statement throw new 
  exception which not match your exception then program terminate abnormally.So you can use multiple catch block to handle multiple exception. 
Try block checks one by one catch and when it gets respective exception in catch block that catch block will executed. 
*/

public static void main(String[] args) {
		
System.out.println("Program is started ");

String s=null;    
try {
System.out.println(s.length()); // This statement will thrown Exception. 
}
catch(ArithmeticException e) {  // If we don't know which type of exception is thrown then we use multiple catch block. 
	
System.out.println(e.getMessage()); // this is predefined method using get-message method we can print exception message. 
}
catch (NullPointerException e) {
	
}
catch (NumberFormatException e) {  
	
}
catch (Exception e) {  // We can directly handle all types of exception by single catch block using (Exception class). no need to write multiple catch blocks.
	
}
System.out.println("Program is finish ");

	}

}

package java_exception;
import java.util.Scanner;

/* Exception is an event which will cause program termination. 
 * Exception- It is caused by our program. Exceptions are recoverable. If some exception comes then you can handle it by using the throws keyword,
   try and catch block and customized exception.
 * Error- Errors are not recoverable. Errors occur due to a lack of system resources. Most of the time errors are not caused by our program. 
 Errors comes at runtime. Ex- Out of Memory error, Virtual Machine error
 
* Types of exceptions. 
* 1) Checked exception 
The exception which identified by the java compiler. 
Ex : interrupted exception , File not found , io exception etc. 

* 2) Un-checked Exceptions. 
The exceptions which is not identified by java compiler. 
Ex : Arithmetic exception , null pointer exception , Array index out of bounds exceptions etc. 


 
 */
public class Exception {

	public static void main(String[] args) {
	
	System.out.println("Program is started ");
	
	Scanner sc=new Scanner(System.in); // By using scanner class we can take input from the user. 
	
// Example 1 Arithmetic Exception. 
	
   /* System.out.println("Enter a number : ");
    
    int num=sc.nextInt(); // we taking 1 integer number. 
    
    System.out.println(100/num); //which ever number user is providing we divided it by 100. 
    
    System.out.println("Program is completed ");
    System.out.println("Program is exited "); */
	
// If user is provide valid input then program is fully executed. if user is provide invalid input (0) then it throws ArithmeticException. and rest of 
// the statements are not execute. 
    
    
// Example 2 ArrayIndexOutOfBoundsException. 
// We ask user to provide 2 values. 1 is for location/position and 1 is which value want to store. 
    
    int a[]=new int [5]; // Here we can store 5 values. 0 is starting index and 4 is last index. 
    
    System.out.println("Enter position (0-4) : ");
    int pos=sc.nextInt(); //Here we taking position value in variable. by using scanner class object. 
    
    System.out.println("Enter a value : ");
    int value=sc.nextInt(); //Here we taking value in variable. by using scanner class object. 
    
    a[pos]=value;  // This statement whatever value user is provide that store in array  position that user is provided.
    
    System.out.println(a[pos]); // We print the value; 
    
    System.out.println("Program is completed ");
    System.out.println("Program is exited "); 
    
/*If user is provide valid input then program is fully executed. if user is provide invalid input 
(we only have 4 position as per index if user enter 5th position then program throws ArrayIndexOutOfBoundsException.) and rest of the statements are not execute.*/
    
    
    
	}

}

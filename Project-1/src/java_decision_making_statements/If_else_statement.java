package java_decision_making_statements;

public class If_else_statement {

// 2) if else statement 
// We use if else statement to specify if condition is false then what should return. 
	
	public static void main(String[] args) {
		
// Condition : Check the person is eligible for vote or not. if persons age is greater than or equal to 18 is eligible for vote. 
		
		int person_age = 12; 
				
		if (person_age>=18) {        // We use relational operator (>=) to check whether persons age is greater than or equal to 18. 
					                 //we specify condition in if condition statement. 
				
		System.out.println("Eligible for vote.");       // This statement execute only if this condition is return true. 
				                                       // if this condition return false then else block statement will executed. 
		}
				
		else {                             
		                                                         
			System.out.println("Not eligible for vote.");  // If condition is false then else block will execute. 
				
		}
		
	}

}

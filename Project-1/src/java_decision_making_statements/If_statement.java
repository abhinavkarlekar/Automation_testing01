package java_decision_making_statements;

public class If_statement {
	
/* Conditional statements decides which statement execute base upon certain condition. 
   the result of this statements is boolean value. 
   There are 4 types of conditional statements. 
	1) if 
	2) if else
	3) nested if else 
	4) switch case 
		
*/

	public static void main(String[] args) {
		
	// 1) if statement
		  
	// Condition : Check the person is eligible for vote or not. if persons age is greater than or equal to 18 is eligible for vote. 
			
			int person_age = 12; 
			
			if (person_age>=18) {        // We use relational operator (>=) to check whether persons age is greater than or equal to 18. 
				                        //we specify condition in if condition statement. 
			
			System.out.println("Eligible for vote.");       // This statement execute only if this condition is return true. 
			                                               // if this condition return false this statement will not be executed. 
			}
			
	}

}

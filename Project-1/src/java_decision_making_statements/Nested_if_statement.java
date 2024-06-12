package java_decision_making_statements;

public class Nested_if_statement {

	public static void main(String[] args) {
	
// 3) Nested if else statement. 
// it consists of another if statement inside first if statement. 
// if first if condition is true then it enter in another if condition. if first condition is false then it execute else condition. 
			
			long l = 5000;
			
			if (l<2000) {           // if first if condition is true then it enter in another if condition. if first condition is false then it execute else condition.
				
			System.out.println("Number is equal to 5000");
			
			if (l<6000)           
				
			System.out.println("Number is less than 6000");
			}
			else {
				
			System.out.println("Condition 1 is false");  // if all conditions return false then it execute else condition. 
				
		}
	}

}

package java_decision_making_statements;

public class If_else_ladder_statement {

	public static void main(String[] args) {
		
/* 3) if else ladder statements 
	  it is useful when we want to test multiple conditions. 
	  
	  Condition : check if number is positive , negative or zero. 
	  if number > 0 is positive number. 
      if number < 0 is negative number. 
	  if number = 0 is zero. 
*/
		
			int num =-10;    
			
		if (num>12) {                          // if this condition is false then it check condition 2.  

			System.out.println("Positive number");
		}
		else if (num<0) {                    // if this condition is false then it execute else condition. 
			
			System.out.println("Negative number");
		}	
		else {                              // if all if conditions false then it execute else block. 
			
			System.out.println("Zero");
		}
		
	}

}

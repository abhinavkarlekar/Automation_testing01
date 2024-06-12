package java_jumping_statements;

public class Break_statement {
	
// we use break jumping statement along with condition statements and looping statements. 

	public static void main(String[] args) {
	
	// Example 1 : Print 1 to 10 numbers. 
		
		for (int i=1; i<=10; i++) {
			
			if (i==5) {               // as soon as i value becomes 5 
				
				break;               // The break command exit the loop. it is jumping out from the loop. 
				                     // rest of the numbers will not be executed. 
			}
		
			System.out.println(i);
		}
	}

}

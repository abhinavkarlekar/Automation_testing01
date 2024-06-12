package java_Loop_statements;

public class Do_while_loop {

// if you want to execute the loop at least once, the do while loop is appropriate. 
	
	public static void main(String[] args) {
	
// in do while loop one statement execute without checking condition. and then onwards it will check the condition. 
// in do while loop 1st the statement will be executed and then verify the condition. 
	
	int i = 1;                         // start with initialization of variable. 
	
	do                                // in do while loop we start with the do keyword. 
	{
		System.out.println(i);
		i++;                          // Then put increment. 
	}
                                         // After closing the brackets we write the while. 
	while (i<=10);                        // and end with the while along with condition. and we have to put semicolon after condition. 
	}                                    // The ; represent the end of the statement. 

}

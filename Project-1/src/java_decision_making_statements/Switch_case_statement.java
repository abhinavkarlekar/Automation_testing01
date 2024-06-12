package java_decision_making_statements;

public class Switch_case_statement {

	public static void main(String[] args) {
	
// 4) Switch case statement
// We use switch case statement to reduce the code. 
		
// condition : Display week name based on week number. 
		
	int weekno = 8; 
	
    switch (weekno)              // here we don't specify the condition we specify the variable name. 
    {
    case 1 : System.out.println("Sunday");   break;       // break; is use to jump out from switch case after execution of case. 
    case 2 : System.out.println("Monday");   break;      // (Case 1) Case is a keyword. and we specify value of variable along with case.  
    case 3 : System.out.println("Tuesday");  break;     // if variable value is equal to case value then it print the statement.
    case 4 : System.out.println("Wenesday"); break;    // if variable value is not matching with case value then it check another case value.
    case 5 : System.out.println("thursday"); break;
    case 6 : System.out.println("Friyday");  break;
    case 7 : System.out.println("Saturday"); break;
   default : System.out.println("invalid week No.");   // if all cases not matching then default statement execute. it works similar to else condition.
                                                      // Here break is not required. 
}

	}

}

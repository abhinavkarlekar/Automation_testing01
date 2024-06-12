package java_jumping_statements;

public class Continue_statement {

	public static void main(String[] args) {
		
       for (int i=1; i<=10; i++) {
			
			if (i==3 || i==5 || i==9) {   // whenever i value becomes 3,5,9 continue statement skip the value and continue to print next value.      
				
				continue;           // with the help of continue statement we can skip the condition value. 
				                     
			}
		
			System.out.println(i);
		}
	}

}

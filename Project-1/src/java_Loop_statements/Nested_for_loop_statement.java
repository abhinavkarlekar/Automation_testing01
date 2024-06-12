package java_Loop_statements;

public class Nested_for_loop_statement {

	public static void main(String[] args) {

// Nested for loop consists of an outer loop and one or more inner loop. 
		
	// Example 1 : Half pyramid. 
		
	for (int i=1; i<=5; i++)                 // in for loop we put initialization , condition , increment/decrement inside for loop.  
	{                                      // 1st it check the outer loop condition if condition is true then it goes to the inner loop. 
		for (int x=1; x<=i; x++) {           // in nested for loop we put another for condition in for loop. 
		
		System.out.print(" * ");   // in print statement we concatenate i and x variable. now its print i and x value. 
	}
System.out.println(); 
	
	}
	// Example 2 : Half pyramid with no. 
	
	for (int a=1; a<=5; a++)                  
	{                                      
		for (int b=1; b<=a; b++) {           
		
		System.out.print(b+" ");   
	}	
System.out.println(); 
	}
	
	System.out.println(); 
	
	// Example 3 : Inverted half pyramid with no. 
	
	for (int c=5; c>=1; c--)                
	{                                       
		for (int d=1; d<=c; d++) {           
		
		System.out.print(d+" ");  
	}
System.out.println(); 
	} 
	
	// Example 4 : Inverted half pyramid with star. 
	
	for (int e=5; e>=1; e--)                
	{                                       
		for (int f=1; f<=e; f++) {           
		
		System.out.print(" * ");  
	}
System.out.println(); 
	} 
System.out.println();

	// Example 5 : Solid rectangle. 
	
	for (int g=1; g<=4; g++)                
	{                                       
		for (int h=1; h<=5; h++) {           
		
		System.out.print("*"+ " ");  
	}
System.out.println(); 
	} 

	System.out.println();
	
	// Example 6 : Floyd's rectangle. 
	
	int count = 0; 
	for (int k=1; k<=5; k++)                
	{                                       
		for (int l=1; l<=k; l++) {           
		count=count+1;
		System.out.print(count+" ");  
	}
System.out.println(); 
	} 
	
	System.out.println();
	
	// Example 7 : 0 - 1 Triangle. 
	
	for (int m=1; m<=5; m++)                
	{                                       
		for (int n=1; n<=m; n++) {           
		int sum = m+n;
		if (sum % 2==0) {
		System.out.print(" 1 ");
		}
		else {
		System.out.print(" 0 ");
		}
		
	}
System.out.println(); 
	} 
	
	System.out.println();
	
	// Example 8 : Inverted half pyramid rotate 180. 
	
	for (int o=1; o<=4; o++)                
	{                                       
		for (int p=1; p<=4; p++) {           
		System.out.print(" ");
		}
		for (int q=1; q<=o; q++) {
		System.out.print("*");
		}
		System.out.println();
		}
		


}
}
package java_operators;

public class Comparision_operators {

/*Comparison operators use to compare two values of variables.
  Comparison/relational operators works between two variables. ex. (a>b),(a<b),(a<=b),(a>=b),(a==b),(a!=b)
  the return value of comparison is true or false.
  it is also known as boolean value. 
 (==) Double equal to 
 (>) Greater than 
 (<) Less than
 (>=) Greater than equal to  
 (<=) Less than equal to
 (!=) Not equal to
 */
	
	public static void main(String[] args) {
	
		int a=50, b=100; 
		
		// Greater than 
		System.out.println(a>b); // False
		System.out.println(b>a); // True
		
		// Less than
		System.out.println(a<b); // True
		System.out.println(b<a); // False
		
		// Greater than equal to 
		System.out.println(a>=b); // False
		System.out.println(b>=a); // False
		
		// Less than equal to 
		System.out.println(a<=b); // True
		System.out.println(b<=a); // False
		
		// Not equal to 
		System.out.println(a!=b); // True
		System.out.println(b!=a); // True
		
		// Equal to 
		System.out.println(a==b); // False
		System.out.println(b==a); // False
	}

}

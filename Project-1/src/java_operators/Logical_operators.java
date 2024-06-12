package java_operators;

public class Logical_operators {
	
/*Logical operators used to determine logic between variables. 
  Logical operators return boolean values. True/False
  Logical operators works between 2 boolean variables. 
  Logical operators are : && , || , ! 
  
	&& : it returns true if both condition is true. even one of them is false then it returns false.
	|| : it returns true if one condition is true. if both conditions are false then it return false. 
	!  : Negation / opposite. if condition is true it returns false and if condition is false it returns true.  
*/

	public static void main(String[] args) {
		
		// Logical && operator. 
		
		int a = 25 , b = 65;
		
		System.out.println(a<20 && b>70); //  in this both condition is false then it returns false. 
		
		System.out.println(a<30 && b>60); //  in this both conditions is true then it returns true. 
		
		System.out.println(a>15 && b<20); //  in this one condition is true and one is false then it returns false. 
		
		
		// Logical || operator. 
		
		int c = 250, d = 350; 
		
		System.out.println(c<300 || d>500);  // in this one condition is true then it returns true. 
		
		System.out.println(d<250 || c<100);  // in this both conditions are false then it returns false. 
		
		
		// Logical ! operator 
		
		int e = 963, f = 852; 
		
		System.out.println(!(e>800 && f<1000));  //  in this both conditions are true but we use (!) not operator the not operator returns the opposite.
	}

}

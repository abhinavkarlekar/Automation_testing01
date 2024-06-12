package java_super_keyword;
/* Super keyword will be used to invoke the immediate parent class variable.
 * Super keyword will be used to invoke the immediate parent class method.
 * Super keyword will be used to invoke the immediate parent class constructor.
 * Instated of latest variable value in child class it will invoke the parent class variable value.
 * even we create a object of child class still we can access the parent class methods and variable by child class object. that is possible by using super keyword. 
 
*/

public class Super_kayword {  // we create a parent class with string value. 
	
	String color = "White"; 
	
	void print () {
	System.out.println("print123...");
	}
}
	class animal extends Super_kayword { // we create a child class which is extended to parent class. 
		
		String color = "Black"; 
		
		void display1 () {                 // we create a method to print the value of variable. 
		System.out.println(super.color);  // we use super keyword to get parent class variable value. 
		}                                // If we print the only color variable it will print the latest value from child class. 
		
		
		void print () {   // we create same method as parent class in child class by method overriding. 
		System.out.println("print..."); 
		super.print();      // we use super keyword in child class method to invoke the parent class method. 
			
			}
	}
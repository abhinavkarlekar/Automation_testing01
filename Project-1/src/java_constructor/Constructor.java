package java_constructor;

public class Constructor {

/* It execute block of code whenever an object is created.
 * Constructor name must be same as class name. 
 * It has no return type. 
 * It can not abstract, static, final and synchronized keyword. 
 * We can use access modifiers while declaring constructor. 
 
 * Types of constructor 
 * 1) Default constructor : Every time an object is created using new keyword at least one constructor is called is known as default constructor. 
 * 2) User defined constructor : It is defined by user. it execute when object is created. 
 * 3) Parameterized constructor : It consists specific no of parameter. 
 */
	
	// User defined constructor. 
	
	public Constructor () {          // Constructor name should be same as class name. 
	System.out.println("User defined constructor");
		
	}
	
	// Parameterized constructor. 
	
	public Constructor (int i) {      // We have to specify data type and variable as a parameter in parameterized constructor. 
	System.out.println("Parameterized constructor");
	
	}
	public static void main(String[] args) {
		
	Constructor c11 = new Constructor ();     // We have to create object to call the constructor. 
	Constructor c22 = new Constructor (1);    // We have to specify parameterized value in object to call parameterized constructor.  
	}

}

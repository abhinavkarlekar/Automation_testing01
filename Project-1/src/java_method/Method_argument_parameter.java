package java_method;


public class Method_argument_parameter {

	int a;                                      // Primitive data type , instance variable declared in a class without value as a argument.  

	public void parameter (int b) {            // Create instance method to assign value to the argument variable. 
		a=b;                                   // Assign value to instance variable. 
		System.out.println(a);

	};

	static String c;                           // Non primitive data type , static variable declared in a class without value as a argument. 

	public static void argument (String d) {  // Create static method to assign value to the argument variable. 
		c=d;                                 // Assign value to static variable. 
		System.out.println(c);
	};
			
		
	public static void main(String[] args) {
		
		Method_argument_parameter d = new Method_argument_parameter();    // instance variable access by creating a object.  
		
		d.parameter(500);           // Assign value to instance variable , argument/parameter variable by crating a object. 
		
		
	argument("Wellcome");          // Assign value to static variable , argument/parameter variable by method name. 

	
		

	}

}

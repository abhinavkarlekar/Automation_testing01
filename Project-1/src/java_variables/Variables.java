package java_variables;

//There are 3 types of variables 1) Instance variable. 2) Static variables. 3) Local variables. 

public class Variables {
	
	// 1) Instance variable. 
	
		int a = 100;       // Instance variable are declare inside the class but out side the method.
		float c = 10.10f; 
		
	public void Instance_method () {         // We can directly access instance variable in instance method. 
		System.out.println(a);
		System.out.println(e);              // We can access static variable in instance method and static method. 
		
	};

	// 2) Static variable. 
		
		static int  d=1000;         // Static variable are declare inside the class using static keyword.
		static String e= "hello"; 
	    static double f = 100.2023;  
	    
	    public static void Static_method () {      // We can directly access static variable in static method. 
	    	System.out.println(d);
	    	//System.out.println(c);                // We can not access instance variable in static method. 
	    	             
	    };
	    
	
	public static void main(String[] args) {
		
	// 3) Local variables.                
		
		long h = 1022000;                // We can declare local variable inside method or main method.  
		System.out.println(h);           // We can directly call the local variable bcoz we declared it inside the main method. 
				
	// Instance variable.
				
		Variables b = new Variables ();  // We have to create object for instance variable. 
				
		System.out.println(b.a);        // we have to call instance variable inside the print statement by (reference variable name . declare variable name) after creating a object. 
		System.out.println(b.c);
				
	// We can call static variable in 3 way 1) By static variable. 2) By class name. 3) By creating a object. 
				
		System.out.println(d);         // We can directly call static variable in print statement by (declare static variable name) without creating a object. 
				
		System.out.println(Variables.e);  // We can call static variable in print statement by (class name . select declared static variable). 
				
		Variables g = new Variables ();  // We can call static variable in print statement by creating a object. 
		System.out.println(g.f); 
		
	}

}

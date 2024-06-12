package java_method_signature;

public class Method_signature {

/* It is a method name followed by parameter type.
 * 
 * Method return types :
 * 1) void - we use void when method returns nothing. 
 * 2) Primitive type - we can use all primitive data types. integer,byte,double.... 
 * 3) Class type - integer , number. 
 */
	
// 1) Without return type and no parameter. 
	public void get () {
	System.out.println("Get method");
	}

// 2) Without return type and parameter. 
	public void get_1 (long l) {
	System.out.println("Get 1 method");
	}
	
// 3) With return statement and no parameter. 
	public void get_2 () {
	System.out.println("Get 2 method");
	return ;
	
	}
// 4) With return type and parameter. 
	public int get_3 (int i) {
	System.out.println("get 3 method");
	return 1;     // In return we can use parameter type variable or data type value. 
	
	}
	
	public static String get_4 (String name) {
	System.out.println("Your name is - "+ name);
	return name; 
		
		
	}
	public static void main(String[] args) {
	
	Method_signature g = new Method_signature();       // we can call instance method by creating object. 
	g.get();
	
	get_4 ("Abhinav");     // we can call static method by method name and input value. 
	}

}

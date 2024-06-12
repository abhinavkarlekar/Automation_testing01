package java_exception;

public class User_defined_customized_exception {

// We need to create object of exception class. 
	
public void number () {  // here we create instance method. 
	int i = 30;
	int r= i/0;   // This statement throws ArithmaticException. 
	System.out.println(r);
	
	throw new ArithmeticException ("Number cant divide by 0 ");  // Here we create customized exception by using throw keyword. 
}
	public static void main(String[] args) {
	
		User_defined_customized_exception c=new User_defined_customized_exception(); // We create a object of instance method. 
		c.number(); 

	}

}

package java_interface;
/* Interface is a blueprint of a class.
 * Interface contains final and static variables.
 * Interface contains abstract method. (also allowed default method and static method from java8 onwards).
 * Abstract method is a method contains signature but not body (un-implemented method).
 * Methods in interface are public.
 * interface support the functionality of multiple inheritance. 
 * We can define interface with a interface keyword. 
 * A class extends another class , an interface extends another interface but a class implements an interface. 
 * We can create object reference for interface but we cannot instantiate interface. 
 */

// Parent class. 
interface shape {      // This is interface class. 

	int length = 100;    // By default the variable is final or static in interface. 
	int width = 50; 
	
// We can create abstract , default & static methods in interface. 
	
// Abstract Method. 
	
	void circle ();     // Abstract method without implementation. we can not implement abstract method in interface we can implement abstract method in class (child class). 
	
// Default Method. 
	
	default void square() {   // Any method with default keyword is a default method. We create default method in interface with implementation. 
		
	System.out.println("This is square");
		
	}
	
	static void rectangle () {  // Any method with static keyword is a static method. We create static method in interface with implementation.
		
	System.out.println("This is rectangle");
	
	}
}



// Child class. 
public class Interface_demo implements shape   // we use implement keyword to implement the interface with a class. now this class contains all interface final, abstract and static variables & methods. 
{
	public void circle() {       // we implement abstract method of interface in class. whenever we implement abstract method from interface in class we have to use public keyword.  
		
	System.out.println("This is circle");
	
	} 

	
public static void main(String[] args) {
	
	Interface_demo idobj = new Interface_demo ();  // we create a object of child class to access a methods of interface class. 
	idobj.circle();              // we can access abstract method which we implement in child class from reference variable of object. 
	idobj.square();             // we can access default method which is in a parent class by child class object. 
	
// Rectangle is a static method present in a interface class. we can directly access static method by method name without creating object but in 
//interface we have to call static method by interface name . method name. 
	
	shape.rectangle();      
}	

}

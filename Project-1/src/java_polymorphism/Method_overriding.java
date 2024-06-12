package java_polymorphism;

/* Method overriding happens between classes (Super/parent class & sub/child class) and method overloading happens within class. 
 * In this whatever the method in parent class we rewrite the same method in child class just by changing the implementation part. 
 which is called method overriding. 
 */
// Parent class.
class bank {
	double roi () {
	return 0;
	}
}

// Child class.
class sbi extends bank {   // child class extends to parent class / hierarchical inheritance. 
	double roi () {        // We overriding parent class method to child class. 
	return 10.5;
	}
}

//Child class.
class icici extends bank {  // child class extends to parent class / hierarchical inheritance.
	double roi () {
	return 11.5;
	}
}




public class Method_overriding {

	public static void main(String[] args) {
		
// if we create a object of parent class / super class we can access parent class method. 
		
	bank bobj = new bank();
	System.out.println(bobj.roi());  // we have to store return keyword value into a variable.  
	
// if we create a object of child class / sub class we can access parents class and child class methods. 
// Which ever overriding method we want to access we can access by creating object. 
	
	sbi sobj = new sbi();
	System.out.println(sobj.roi());
    
	icici iobj = new icici();
	System.out.println(iobj.roi());
	}

}

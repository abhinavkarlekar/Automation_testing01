package java_inheritance;

/*Multi-level inheritance :- 
it contains two or more than tow classes available in single chain class. two classes or more than tow classes is 
inheriting one super class. if we created object for sub class 2 then we can access properties of sub class 1 and super class.
*/ 

class X {       // Parent class        
	int a = 100; 
	void display () {         // instance method 
	System.out.println(a);	
		
	}
	
}

//we use extends keyword to access variable and methods from parents class to child class. 

class Y extends X {   // y is a child class of x and x is a parent class of y. 
	int b = 200;
	void show () {     // instance method 
	System.out.println(b);
	
	}
}

class Z extends Y {    // Z is child class of Y and Y is a parent class of Z. 
	int c = 300; 
	void print () {    // instance method 
	System.out.println(c);
	
	}
}








public class Multi_level_inheritance {

	public static void main(String[] args) {
// we create object of child class z now we can access variables and methods of class x & y.
		
	Z cobj = new Z ();
	System.out.println(cobj.a);  // we can access parent class variable by child class object. 
	System.out.println(cobj.b); // we can access parent class variable by child class object. 
	System.out.println(cobj.c); // we can access parent class variable by child class object. 
	
	cobj.display();  // we can access parent class method in child class object.
	cobj.show();
	cobj.print();
	}

}

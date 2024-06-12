package java_inheritance;
// in one java package there will be only one class has a public access modifier. other classes should be normal class. 

// Single inheritance. 

// Parent class

class A {              
	int a = 100; 
	void display () {         // instance method 
	System.out.println(a);	
		
	}
	
}

// child class

class B extends A {   // we use extends keyword to access variable and methods from parents class to child class. 
	int b = 200;
	void show () {     // instance method 
	System.out.println(b);
	
	}
}



public class Singel_inheritance {

	public static void main(String[] args) {
// we create object of child class now we can access variables and methods of parent class as well as child class. 
// but if we create a object of parent class we can access only parent class variables and methods. 
		
		B bobj = new B ();
		System.out.println(bobj.a); // we can access parent class variable by child class object. 
		System.out.println(bobj.b); // we can access child class variable in child class object. 
		
	bobj.display();   // we can access parent class method in child class object. 
	bobj.show();     // we can access child class method in child class object. 
	}

}

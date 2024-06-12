package java_inheritance;

//Hierarchical inheritance means One parents have multiple child's its a tree structure one superclass has multiple sub classes.

class Parent {           // parent class
	void display (int a) {
	System.out.println(a);	
	}
}

class child1 extends Parent {              // child class1 contains 2 methods and 2 variable 1 its own and another one from parent class. 
	void show (int b) {
	System.out.println(b);	
	}
}

class child2 extends Parent {              // child class2 contains 2 methods and 2 variable 1 its own and another one from parent class. 
	void print (int c) {
	System.out.println(c);	
	}
}




public class Hierarchical_inheritance {
	
	public static void main(String[] args) {
	
	child1 c1 = new child1();   // by creating child1 class object we can access child1 class & parent class methods and variables. 
	
	c1.show(100);    // when we call method we have to pass the value to the variable.
	c1.display(200);
	
	child2 c2 = new child2();  // by creating child2 class object we can access child2 class & parent class methods and variables.
	
	c2.display(500);   // when we call method we have to pass the value to the variable.
	c2.print(300);
	}

}

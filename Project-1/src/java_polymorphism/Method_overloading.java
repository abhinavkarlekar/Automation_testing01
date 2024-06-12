package java_polymorphism;

/* Polymorphism mens one thing can have many forms. poly means many and morphism means forms. 
 * we can achieve polymorphism by using method overloading.
 * overloading is nothing but we can create multiple methods with the same name. but we have to change data type of parameter.
 4 Rules are applicable. 
 1) Method name should be same. 
 2) Number of parameter should be different.
 3) Data types of parameter should be different. 
 4) Order of parameters should be different. 
 */ 

public class Method_overloading {
 
// 1st Method. 
	
	int a=100; int b=200;
	
	void sum () {       // This method is not taking any parameter. 
		
	System.out.println(a+b); // those variable is already declared outside the method. 
	
	}

// 2nd Method.
	
	void sum (int x, int y) {      // same method name with taking 2 parameter. 
		
	System.out.println(x+y);
	
	}
	
// 3rd Method. 
	
		void sum (int x, double y) {            // Same method name with 2 parameter but different data types. 
		
		System.out.println(x+y);
		
		}
		
// 4th Method. 
		
		void sum (double x, int y) {            // Same method name with same data types but the order of data type is change. 
			
			System.out.println(x+y);
			
		}
		
	public static void main(String[] args) {

Method_overloading mobj = new Method_overloading();  // we create object of class to access methods. 

mobj.sum();         // 1st Method. 
mobj.sum(10, 20);  // 2nd Method
mobj.sum(88, 1.2); // 3rd Method.
mobj.sum(2.2, 55); // 4th Method. 

	}

}

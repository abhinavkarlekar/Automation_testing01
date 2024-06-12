package java_method;


public class Methods {

		
		// The methods will be created inside the class.
		
		// 1) instance method.
		
		public void studentid(){                           // studentid is a instance method name. 
			int id=001; 
			System.out.println(id);
		};   
		public void studentname() {                        
			String name="Abhinav"; 
			System.out.println(name); 
			
		};
		
		
	// 2) Static method. 
		
	 // We have to add static keyword to create static method. 
	// we have to add static keyword after access modifier and before void return type. 	
		
		
		public static void productid() {    // Productid is a static method name.            
		int pid = 001; 	                                             
		System.out.println(pid);
		};
		
		public static void productname() {
		String pname ="milk"; 
		System.out.println(pname);
			
		};
		
		public void price () {
		int price = 500; 
		System.out.println(price);
			
		};
		
		public static void main(String[] args) {
		
	// we have to call the instance method by creating object.
	// syntax : class name reference variable(we can give any name to reference variable) = new keyword class name ();.	
	// reference variable . method name ();	
			
			Methods id = new Methods ();                 
			id.studentid();                             
			                                           
			Methods name = new Methods (); 
			name.studentname();  

		// We can directly call static method without creating a object.
	   // We can call static method in 3 ways 1) By method name. 2) By class name. 3) By creating object.  
			
			
			productid();                       // Method name syntax : method name + ctrl space. 
			
			Methods.productname();             // Class name syntax : class name . select method name. 
			
			Methods price = new Methods ();     // By creating object. 
			price.price(); 
	}

}

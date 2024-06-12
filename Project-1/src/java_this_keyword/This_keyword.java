package java_this_keyword;

/*This keyword we use to differentiate between instance variables and local variables.
 * There are 2 variables in java 1) Class variable / instance variable & Local variable. 
 * This keyword is always representing the class and object. 
 * 
 */
public class This_keyword {

	int x , y;   // Instance variables. To assign data to those variables we can create constructor or method. 
	
// 1) Constructor (constructor is use to initialize the data to variable.)
	
	/*This_keyword (int x ,int y){     //we take 2 parameter. x and y are local variables and variable names are same as instance variables.  
		
		this.x=x;        // We use this keyword to differentiate between class variable and local variable. 
		this.y=y; 
	}*/
	
// 2) Method 
	
	void setdata (int x , int y) {
		
	this.x=x;       //  We use this keyword to differentiate between class variable and local variable. 
	this.y=y;
	
	}
	void display () {     // We create normal method to printing the value of x and y. 
		
	System.out.println(x);
	System.out.println(y); 
	}
	public static void main(String[] args) {
	
	// To access this we have to create object. 
	
		//This_keyword tk = new This_keyword(100, 200);   // we have to pass 2 parameter in constructor object. 
		//tk.display(); 
		
	// We have to create normal object without parameter for method. 
		
		This_keyword th = new This_keyword (); 
		th.setdata(200, 400);     // before display method we have to call set data method / we have to pass data . 
		th.display();
	}

}

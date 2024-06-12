package java_data_types;

public class Data_Types {

	public static void main(String[] args) {
		
		//Primitive data types.
	   //Primitive data types starts with lower case letter. 
			
		  //Numeric data types. Without having decimal numbers. 
		
			int a=10, b=20;
			System.out.println("The value of a is :"+a);   // (+) is use for concatenation
	        System.out.println("the value of b is :"+b);

	        byte c=125;          // the range of byte data type is -128 to 127.  
	        System.out.println("The value of c is :"+c);
	        
	        short d=32765;        // the range of short data type is -32,768 to 32,767.
	        System.out.println("the vale of d is :"+d);
	        
	        long e=500000000000L;      //in long data type we have to use literal in the end of the value.it is lower case l or upper case L.
	        System.out.println("The value of e is :"+e);
	        
	        
	        //Data types with having decimal numbers.
	        
	        float f=10.20f;          // in float data type we have to use literal in end of the value. it is lower case f or upper case F.
	        System.out.println("The vale of f is :"+f);
	        
	        double g=20.202020202022;    
	        System.out.println("The value of g is :"+g);
	        
	        //Data type to represent single character 
	        
	        char h='A';                // single character always in a single quotation mark ('').
	        System.out.println("The value of h is :"+h);
	        
	        //Data type to represent true or false value.
	        
	        boolean i=true; 
	        boolean j=false;
	        System.out.println("The value of i is :"+i);
	        System.out.println("The value of j is :"+j);
	        
	        
	        //Non primitive data types.
	        
	        String s = "wellcome";          // Non primitive data types start with upper case letter. 
	        System.out.println(s);         // String value always in a double quotation mark.  
	        
	}

}

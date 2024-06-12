package java_type_casting;

public class Type_casting {

/* Type casting is when you assign a value of one primitive data type to another type.
 
 * In Java, there are two types of casting:
 
1)  Widening Casting - converting a smaller type to a larger type size.
 * Small to large = byte -> short -> char -> int -> long -> float -> double 
 
2) Narrowing Casting - Converting a larger type to a smaller size type.
 * Large to small = double -> float -> long -> int -> char -> short -> byte 
 
 */
	

	public static void main(String[] args) {
		
// 1) Widening Casting is done automatically when passing a smaller size type to a larger size type. 

		int i = 900;  
		long l = i;   // Here we pass a smaller size type (int) to a larger size type (long). 
		
		System.out.println(l); // Output- 900
		System.out.println(i); // Output-900
		
		int y= 400;    // Here we pass a smaller size type (int) to a larger size type (double). 
		double u =y;
		
		System.out.println(u); // Output-400.0
		System.out.println(y); // Output- 400    
		
		
// 2) Narrowing Casting must be done manually by placing the type in parentheses in front of the value. 
			
			long l1 = 2000;
			int x = (int) l1;  // Here we manually placing smaller data type (int) in parenthesis.
			
			System.out.println(l1); // Output- 2000
			System.out.println(x); // Output- 2000
			
			float f = 34.677f;
			long k = (long) f;  // Here we manually placing smaller data type (long) in parenthesis.
			
			System.out.println(k); // Output- 34
	}

}

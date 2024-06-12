package java_scanner_class;

import java.util.Scanner;

public class Scanner_Class {
/* Java Scanner class allows the user to take input from the console. It belongs to java.util package. It is used to read the input of primitive types
   like Int, double, long, short, float, and byte. It is the easiest way to read input in Java program.
   Scanner sc = new Scanner(System.in);
   The above statement creates Scanner class object having (System.in) as an argument. It means it is going to read from the standard input stream 
   from user. The java.util package should be import while using Scanner class.
   
 * Methods of Scanner Class. 
Java Scanner class provides the following methods to read different primitives types. Multiple methods present in scanner class, 
We can use them as per your requirement. Some few are as follow.

1.int nextInt(): It is used to take the next input as an integer.
2.float nextFloat(): It is used to take the next input as a float.
3.double nextDouble(): It is used to take the next input as a double.
4.byte nextByte(): It is used to take the next input as a byte.
5.String nextLine(): It is used to take the next input as a String.
6.boolean nextBoolean(): It is used to take the next input into a boolean value.
7.long nextLong(): It is used to take the next input as a long.
8.short nextShort(): It is used to take the next input as a Short.
9.BigInteger nextBigInteger(): It is used to take the next input as a BigInteger.
10.BigDecimal nextBigDecimal(): It is used to take the next input as a BigDecimal.

* Steps : 
1.Create object for Scanner Class having argument as (System.in).
2.Print Some statement as per user input. Take reference variable of scanner class use method according to user input.
3. You can take many inputs from user and perform operations as per user requirement.

 */
	public static void main(String[] args) {

// Print two integer input from user. 
		
		int a = 30;
		int b = 60;
		
		// Scanner Class object
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		
		int input_1 = SC.nextInt();
		System.out.println("Enter 2nd Number");
		
		int input_2 = SC.nextInt();
		int total_input = input_1 * input_2;
		
		System.out.println("Multiplication of given two Number is " + total_input);
		
		
	}

}

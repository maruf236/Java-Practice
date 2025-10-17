package Learning;

public class Day4operator {
	public static void main(String [] args)
	{
		               // content setting                
		
		float pi =3.1416f;
		//this value of pie can change any time cause i didn't make it constant .
		//to make constant need to use "final" before float.
		System.out.println("pi ="+pi);
		pi=494;
		
		final float PI =3.1416f;// conventional of java coder -> Capital letter for constant setting. 
		System.out.println("After change the value of pi= "+ pi +"\n"+"Constent : "+PI);
		//PI=934; wrong variable cause we save PI as a constant .
		System.out.println(PI);//the value not changeable .
		                   
		                     // operator 
                         // Arithmetic Operator(+,-,*,/,%)
		
		        int a = 10, b = 3;

		        // Basic operations
		        System.out.println("a + b = " + (a + b));  // Addition
		        System.out.println("a - b = " + (a - b));  // Subtraction
		        System.out.println("a * b = " + (a * b));  // Multiplication
		        System.out.println("a / b = " + (a / b));  // Division (integer division)
		        System.out.println("a % b = " + (a % b));  // Modulus (remainder)

		        // Increment and Decrement
		        int x = 5;
		        System.out.println("x = " + x);
		        System.out.println("x++ = " + (x++)); // Post-increment (use then increase)
		        System.out.println("After x++ -> x = " + x);
		        System.out.println("++x = " + (++x)); // Pre-increment (increase then use)
		        System.out.println("x-- = " + (x--)); // Post-decrement
		        System.out.println("After x-- -> x = " + x);
		        System.out.println("--x = " + (--x)); // Pre-decrement
		    
		

		
		
		
	}

}

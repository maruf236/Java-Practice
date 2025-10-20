package Learning;
import java.util.Scanner;
public class Day9loop {
	public static void main(String [] args)
	{
		/* 3 type of loop 
		 * 1. For loop
		 * 2.While loop
		 * 3. do while loop
		 *     (For loop)
		 */
		System.out.println("Enter number for Upward counting: ");

		Scanner f = new Scanner(System.in);
		int ucount = f.nextInt();
		//Upward
		for(int i=1;i<=ucount ; i++)
		{
			System.out.println("The number is "+i);
		}
		System.out.println("Enter number for downward counting : ");

		//Downward
		int dcount = f.nextInt();
		
		for(int i=dcount;i>0;i--)
		{
			System.out.println("The current number is: "+i);
		}
		       // While
		System.out.println("Enter number for while loop: ");

		int num=f.nextInt();
		int i=1;
		while(i<num)
		{
			System.out.println("The number is: "+i);
			i++;
		}
		        // Do while
		System.out.println("Enter integer for do while loop : ");

		int dnum=f.nextInt();
		int k=0;
		do {
			System.out.println("The integer is : "+k);
			k++;
		}
		while(dnum>=k);
		int integ;
		do {
			System.out.print("Enter a number :");
			 integ =f.nextInt();
			System.out.println("The inputed number is :"+integ);
		} while(integ >0);//Enter 0 to verify the error of do while loop.
		
		//The exception of do while loop
		int number;
		do {
			System.out.println("Enter number : ");
			number =f.nextInt();
			System.out.println("number is :"+number);
		}while(number>=0);
	System.out.println("THE END");
	
//	// N:B: THough in do while loop it's checking the condition after run the block of code at least one time so it run till not get the false
//	in the while Condition . But generate output at least 1 time; 
	
		f.close();
	}
}

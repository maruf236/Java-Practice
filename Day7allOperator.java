package Learning;
import java.util.Scanner; 
public class Day7allOperator {
	public static void main(String[] args)
	{
		// Logical and operator &&
		int a =54;
		int b=53;
		if(a>50 && b>50)
		{
			System.out.println("Both of them are above 50");
		}
		else
		{
			System.out.println("Both of them are less than 50");
		}
		// Logical OR ||
		if (a<50 || b>50)
		{
			System.out.println("One of the comparison or both Comparison are right");
		}
		else
		{
			System.out.println("None of them are right");
		}
		// Logical not ! (negation)
		boolean isAdult=true;
		if(isAdult==true) {// if(isAdult) also represent the same logical statement
			System.out.println("\nIS adult");
		}
		else if(!isAdult)//not adult mean false
		{
			System.out.println("\nNot adult");
		}
		
		         //user input conditional statement 
		System.out.println("Enter the cash you have: ");

		Scanner sc = new Scanner (System.in);
		int cash = sc.nextInt();
		

		//int pen=10; int notebook=40;
		if(cash<10)
		{
			System.out.println("Cannot get any item");
		}
		else if(cash>10 && cash<50)
		{
			System.out.println("Can get only 1 item");
		}
		else
		{
			System.out.println("Can get both item");

		}
		      // SWitch case
		System.out.println("Enter the number for day: ");

		Scanner d = new Scanner (System.in);
		int day= sc.nextInt();
		switch(day){
			case 1: 
			{
				System.out.println("Subday");
				break;
			}
			case 2:{
				System.out.println("Monday");
				break;
			}
			case 3:{
				System.out.println("Tuesday");
				break;
			}
			case 4:
			{
				System.out.println("Wednessday to Satrday");
				break;
			}
		}
		sc.close();
		d.close();
		
	}

}

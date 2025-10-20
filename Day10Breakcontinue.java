package Learning;

public class Day10Breakcontinue {
	public static void main(String [] args)
	{
		int i=0;
		while(true)
		{
			System.out.println(i);
			i++;
			if(i>5)
				break;             //The working system of break statement;
		}
		System.out.println("The END due to break statement.");
		int k=0;
		while(true)
		{
			k++;
			if(k%2==0 && k<10)
				continue;   
			else if (k==5)
				continue; //The working system of continue statement;
			else if(k>=10)
				break;
			else
				System.out.println(k);
		}
		System.out.println("Some of number skiped due to continue statement.");
	}
}

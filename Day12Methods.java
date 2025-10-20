package Learning;
import java.util.Scanner;
public class Day12Methods {
	public static void printhello()
	{
		System.out.println("Hello java"+" Hellllo");

	}
	public static void printName(String name) {
		System.out.println("MY name is "+name);
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int Sub(int a, int b) {
		return a-b;
	}
	public static int multi(int c,int d) {
		return c*d;
	}
	public static  float div(int a,int b) {
		return a/b;
	}
	public static int remin(int a,int b) {
		return a%b;
	}
	public static void Sout(int n) {
		System.out.println(n);
	}
	public static void Sout(float n) { //method overloading *compile time Polymorphism
		System.out.println(n);
	}
	public static void main (String [] args) {
//		try{
//			printhello(4);
//		}catch(Exception exception) {
//			// do something after catching;
//		}
		Scanner sc = new Scanner(System.in);
		printhello();
		printhello();
		printhello();
		printName("MAruf");
		printName("Ahsan");
		System.out.println("Enter two number for Addtion :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Sout(add(a,b));		
		System.out.println("Enter two number for Subtraction :");
		int c=sc.nextInt();
		int d=sc.nextInt();

		Sout(Sub(c,d));		
		System.out.println("Enter two number for Multiplication :");
		int e=sc.nextInt();
		int f=sc.nextInt();

		Sout(multi(e,f));
		System.out.println("Enter two number for divion :");
		int g=sc.nextInt();
		int h=sc.nextInt();
		Sout(div(g,h));
		System.out.println("Enter two number to get reminder :");
		int i=sc.nextInt();
		int j=sc.nextInt();
		Sout(remin(i,j));
	}

}

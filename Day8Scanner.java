package Learning;
import java.util.Scanner;

public class Day8Scanner {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); // Create scanner object

	        System.out.print("Enter your name: ");
	        String name = sc.nextLine(); // reads entire line

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt(); // reads integer

	        System.out.print("Enter your salary: ");
	        double salary = sc.nextDouble(); // reads decimal

	        System.out.println("Hello " + name + "! Age: " + age + ", Salary: " + salary);

	        sc.close(); // Always close scanner to free resources
	    }
	}

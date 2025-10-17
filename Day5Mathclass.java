package Learning;

public class Day5Mathclass {
public static void main (String [] args)
{
	 int a = -25, b = 4;
     
     System.out.println("Absolute: " + Math.abs(a));//absolute value 
     System.out.println("Max: " + Math.max(a, b));//Maximum value
     System.out.println("Min: " + Math.min(a, b));//Minimum value
     System.out.println("Square root of 16: " + Math.sqrt(16));//square root
     System.out.println("2^3: " + Math.pow(2, 3));// Power
     System.out.println("Floor(3.7): " + Math.floor(3.7));// lower whole number
     System.out.println("Ceil(3.2): " + Math.ceil(3.2));//Upper whole number
     System.out.println("Round for (3.3): " + Math.round(3.3));//round to lower
     System.out.println("Round for (3.5): " + Math.round(3.5));//round to upper
     System.out.println("Round for (3.6): " + Math.round(3.6));//round to upper


     System.out.println("Sin(90°): " + Math.sin(Math.toRadians(90)));// the value of angle is in radians mood.
     System.out.println("Random [1-100]: " + (int)(Math.random() * 100 + 1));// get random value.9any in integer.
}

}

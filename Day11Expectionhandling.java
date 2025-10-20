package Learning;

public class Day11Expectionhandling {
	public static void main(String [] args) {
		int [] marks= {43,65,78,98};
//		System.out.println("MArks="+marks[5]);
//		System.out.println("is the exception working ?");
		/* java.lang.ArrayIndexOutOfBoundsException:
		 *  Index 5 out of bounds for length 4
		 */
// use try and catch for exception. like
		try {
			System.out.println("The marks: "+marks[5]);
		} catch(Exception exception) {
			//do something after catching . 
		}
		System.out.println("Now the exception is working ");
		/* though there is error in 13 no line 
		 * then also it next line printing and the erro hanldle perfectly.
		 */
		
		System.out.println("Important note :\nCompile-time error cannot solve by Exception ,just the Run-time error possible.");

	}
}

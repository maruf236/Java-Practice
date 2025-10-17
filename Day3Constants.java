package Learning;

public class Day3Constants {
	public static void main( String [] args) {
		float pi=3.1416f;
		//this value of pi could be change any time .
		final float PI = 3.1416f;
		pi=34;
		//PI=34; error cause in the same variable we cannot change the value.
		System.out.println(pi + "\n"+ PI);
		
	}

}

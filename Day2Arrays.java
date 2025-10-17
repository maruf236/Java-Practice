package Learning; 
import java.util.Arrays;

public class Day2Arrays {
	public static void main(String[] args) {
		int [] marks=new int [4];
		marks[0]=65;
		marks[1]=75;
		marks[2]=58;
		//marks[3]=56;
		System.out.println(marks[3]);

		System.out.println(marks[1]);
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		 
		System.out.println(marks.length);
		System.out.println(marks[0]);
		Arrays.sort(marks);
		System.out.println(marks[0]);

		
		
		
	}
}

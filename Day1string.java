package Learning;

public class Day1string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		   System.out.println("OMG this java print function is really crazy !");
		   String name="Sumud";
		   String boat="flotila";
		   int date = 2025;
		   float pi=3.1416F;
		   long phone =1540160073L;
		   String nickname = name;  
		   System.out.println(phone+"\n"+pi+" "+ name +" or "+ nickname +boat+" reached at the red zone of gaza at"+date);
		   String myname= new String ("Ahsan");
		   System.out.println(myname.length());
		   myname= myname.replace('a', 'b');
		   String myname2= myname.replace('a', 'b');
		   System.out.println(myname2+" "+myname);
		   String realname= "Ali Ahsan Maruf";
		   System.out.println(realname.substring(0,realname.length()));

	}

}


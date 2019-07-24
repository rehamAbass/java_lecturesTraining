
package reham1;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
			int x, y;
			boolean a;
			Scanner s = new Scanner (System.in);
			System.out.println("enter first int:");
			x = readInt(s);
			System.out.println("second int:");
			y = readInt(s);
			System.out.println("enter first boolean");
			a = readbol(s);
	}

	public static boolean readbol(Scanner s) {
		boolean t;
		while(!s.hasNextBoolean()) { s.next();}
		System.out.println("got it.");
		t = s.nextBoolean();
		return t;
	}
	
	public static int readInt(Scanner s) {
		int x;
		while(!s.hasNextInt()) {
			s.next(); // pop it
		}
		System.out.println("got it.");
		x= s.nextInt();
		return x;
	}
}

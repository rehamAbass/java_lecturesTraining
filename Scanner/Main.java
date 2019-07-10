import java.util.Scanner;

public class Main {

 public static void main(String args[]) {
	 
	 Scanner scanner1 = new Scanner(System.in);
	 System.out.println("Enter int :");
	 int x= scanner1.nextInt();
	 System.out.println("int = "+x);
	 
	 System.out.println("Enter string :");
	 String s = scanner1.next();
	 System.out.println("string = "+s);
	 String s2 = scanner1.next();
	 System.out.println("string = "+s2);
	 
	 System.out.println("Enter double :");
	 double  d = scanner1.nextDouble();
	 System.out.println("double = "+d);
	 /////////////////////////////////////////////////////////////////

	 Scanner scanner2 = new Scanner(" we love reham \n we love america");
	 while(scanner2.hasNext()) {
		 System.out.print(scanner2.next() +",");
	 }
	 System.out.println();
	 ////////////////////////////////////////////////////////////////////
	 Scanner scanner3 = new Scanner(" 1 23 100 430");
	 while(scanner3.hasNextInt()) {
		 System.out.print(scanner3.nextInt() +",");
	 }
	 System.out.println();
	 
	 ///////////////////////////////////////////////////////////////////
	 Scanner scanner4 = new Scanner("9.9 90 80");
	 while(scanner4.hasNextDouble()) {
		 System.out.print(scanner4.nextDouble()+",");
	 }
	 System.out.println();
	 System.out.println("now u have infinite loop on scanning strings:");
	 scanner4 = new Scanner(System.in);
	 while(scanner4.hasNext()) {
		 System.out.println("str = "+scanner4.next());
	 }
	 
 }

}

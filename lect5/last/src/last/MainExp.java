package last;

public class MainExp {

	public static void main(String[] args) {

        Exp e = new Exp();
        e.addExp(new Emp("Peter Pan", 1000));
        e.addExp(new Emp("Tinkerbell", 2000));
        e.addExp(new Invoice("Pirates.com", 1000, 3));
 
        System.out.println("Total is " + e.getTotal());
        // Total is 6000
        System.out.println(
                "Most Expensive was " + e.getmostExp().amount());
        // Most Expensive was Pirates.com : 1000 at 3 each
   
		

	}

}

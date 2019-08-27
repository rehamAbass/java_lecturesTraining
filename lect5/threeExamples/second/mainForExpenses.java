
package second;

public class mainForExpenses {

	
	
	public static void main(String []args) {
		
		Expenses a =new Expenses();
		a.addExpense(new Employee("a", 1000));
		a.addExpense(new Employee("b", 2000));
		a.addExpense(new Employee("c", 3000));
		a.addExpense(new Invoice("pat", 1000,4));
		
		System.out.printf("Total is %,d \n" , a.getTotal()); //answer =10,000
		System.out.println("Most Expensive is "+ a.mostExpensive());
	}
}

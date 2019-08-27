package second;

public class Expenses {
	
	private int total =0;
	private Payable most =null;
	
	public void addExpense(Payable a) {
		total = total + a.amount();
		if(most == null) {
			most =a;
		}else if(a.amount() > most.amount()){
			most =a;
		}
	} // add
	
	/////
	public int getTotal() {
		return this.total;
	}
	////
	public Payable mostExpensive() {
		return most;
	}
	/////

}

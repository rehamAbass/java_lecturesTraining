package last;

public class Exp{ //?? implements pay

	private int total =0 ;
	private pay mostExp =null; // refrence to interface
	

	public void addExp(pay NmostExp) {
		total+= NmostExp.amount();
		if( mostExp == null  || NmostExp.amount() < mostExp.amount())
				mostExp =NmostExp;
				
	}
	public int getTotal() {return total;}
	
	public pay getmostExp() {
		return mostExp;
	}
}

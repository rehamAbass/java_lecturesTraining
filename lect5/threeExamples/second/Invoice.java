package second;

public class Invoice implements Payable{

	private String company;
	private int quantity;
	private int price;
	
	public Invoice(String company , int quantity , int price) {
	
		this.company = company;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public int amount() {
		return this.price * this.quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s  %d * %d ",company,price,quantity);
	}
}

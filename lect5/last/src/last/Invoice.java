package last;

public class Invoice implements pay{

	private String company;
	private int quantity;
	private int price;
	 
	public Invoice(String c , int q , int p) {
		company =c;
		quantity =q;
		price =p;
	}
	 
	public void setCompany(String c) {company =c;}
	public void setQuantity(int q) {quantity =q;}
	public void setPrice(int p) {price =p;}
	
	public String getCompany() {return company;}
	public int getQuantity() {return quantity;}
	public int getPrice() { return price;}
	
	@Override
	public int amount() {
		return quantity *price;
	}
	@Override
	public String toString() {
		return "\n company name : "+company+String.format(" ,quantity=%d , price = %d",quantity ,price );
	}
	
}

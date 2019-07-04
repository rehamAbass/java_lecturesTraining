package last;

public class Emp implements pay {

	private String name;
	private int salary;
	
	public Emp(String name ,int s) {
		this.name =name;
		this.salary =s;
	}
	public int getSalary() {return this.salary;}
	public String getName() {return this.name;}
	public void setName(String name) { this.name =name ;}
	public void setSalary(int s) {this.salary =s;}
	@Override 
	public int amount() { return salary;}
	@Override
	public String toString() { return "\n name of employee : "+name;}
	
}

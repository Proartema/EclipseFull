package ejercicios.esp.ejercicio3;

public class Invoice implements Comparable<Invoice>{
	private int id;
	public Customer Customer;
	private double amount;
	public Invoice() {

	}
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.Customer = customer;
		this.amount = amount;
	}
	
	
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setCustomer(Customer customer) {
		this.Customer = customer;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerId() {
		
		return Customer.getId();
	}
	public String getCustomerName() {
		
		return Customer.getName();
	}
	public int getCustomerDiscount() {
		
		return Customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		
		return this.amount=this.amount-(this.amount*(Customer.getDiscount()/100));
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + getCustomerName() + "(" + getCustomerId() + ")("
				+ getCustomerDiscount() + "%), amount=" + getAmountAfterDiscount() + "]";
	}
	@Override
	public int compareTo(Invoice o) {
		
		return this.getCustomer().compareTo(o.getCustomer());
	}
	
}

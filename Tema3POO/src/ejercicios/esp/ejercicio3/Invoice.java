package ejercicios.esp.ejercicio3;

public class Invoice extends Customer implements Comparable<Customer>{
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
	
	public Invoice(int id, String name, int discount) {
		super(id, name, discount);
		
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
		
		return this.amount=this.amount-(this.amount*(getDiscount()/100));
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + getCustomerName() + "(" + getCustomerId() + ")("
				+ getCustomerDiscount() + "%), amount=" + getAmountAfterDiscount() + "]";
	}
	@Override
	public int compareTo(ejercicios.esp.ejercicio3.Customer o) {
		
		return (this.getAmount()>o.g;
	}
	
}

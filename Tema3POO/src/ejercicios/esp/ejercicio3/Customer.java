package ejercicios.esp.ejercicio3;

public class Customer implements Comparable<Customer>{
	protected int id;
	protected String name;
	protected int discount;
	public Customer() {
		
	}
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return name + "(" + id + ")(" + discount + "%)";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}

	
	
	
}

package ejercicios.esp.ejercicio3;

public class Account {

	private String id;
	private String name;
	private int balance =0;
	private EnumCuenta type;
	public Account() {
		
	}

	public Account(String id, String name, int balance) {
		
		this.id = id;
		this.type= type;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	public EnumCuenta getType() {
		return type;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void EnumCuenta setType() {
		return type;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public int credit(int amount) {
		this.balance=balance+amount;
		return this.balance;
	}
	public int debit(int amount) {
		if (amount<=this.balance) {
			this.balance=balance-amount;}
		else {
			System.out.print("You can't do that, the amount exceeds the total.");}
		return this.balance;
	}
	
	public int transfer(int amount, Account account) {
		if (amount<=this.balance) {
			this.balance=balance-amount;
			account.balance= balance+amount;
			}
		else {
			System.out.print("You can't do that, the amount exceeds the total.");}
		return this.balance;
	}
	
}

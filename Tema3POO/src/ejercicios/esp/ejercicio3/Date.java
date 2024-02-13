package ejercicios.esp.ejercicio3;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}

	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		if (day >=1 && day<=31 ) {
		this.day = day;}
		else {
			throw new IllegalArgumentException("Number out of range");
		}
	}

	public void setMonth(int month) {
		if (month >=1 && month<=12 ) {
		this.month = month;}
		else {
			throw new IllegalArgumentException("Number out of range");
		}
	}

	public void setYear(int year) {
		if (year >=1900 && year<=9999 ) {
		this.year = year;}
		else {
			throw new IllegalArgumentException("Number out of range");
		}
	}
	
	public void setDate(int day, int month, int year) {
		if (day >=1 && day<=31 && month >=1 && month<=12 && year>=1900 && year<=9999 ) {
			this.day = day;
			this.month=month;
			this.year=year;}
			else {
				throw new IllegalArgumentException("Number out of range");
			}
	}
	
	@Override
	public String toString() {
		return day + " / " + month + " / " + year;
	}

	
	
	
	
	
}

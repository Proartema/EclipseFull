package ejercicios.esp.ejercicio3;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
	}

	public Time(int hour, int minute, int second) {
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		if (hour >=0 && hour<=23 ) {
			this.hour = hour;}
			else {
				throw new IllegalArgumentException("Number out of range");
			}
		}

	public void setMinute(int minute) {
		if (minute >=0 && minute<=59 ) {
			this.minute = minute;}
			else {
				throw new IllegalArgumentException("Number out of range");
			}
		}

	public void setSecond(int second) {
		if (second >=0 && second<=59 ) {
			this.second = second;}
			else {
				t;
			}
		}
	public void setTime(int hour, int minute, int second) {
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time nextSecond() {
		this.hour=hour;
		this.minute=minute;
		this.setSecond(second++);
		
		return  this;
	}
	public Time previousSecond() {
		this.hour=hour;
		this.minute=minute;
		this.setSecond(second--);
		
		return  this;
	}
	@Override
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}
	
	
}

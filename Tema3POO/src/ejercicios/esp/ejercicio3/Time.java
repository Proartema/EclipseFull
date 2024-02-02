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
		if (second==0)
			second=59;
			if (minute==0)
				minute=59;
				if (hour==0)
					hour=23;
		return  this;
	}
	@Override
	public String toString() {
		return zeroToTheLeft(hour) + " : " + zeroToTheLeft(minute) + " : " + zeroToTheLeft(second);
	}
	public Time previousSecondNew() {

	       Time time = new Time(this.hour, this.minute, this.second);
	       substractASecond(time);
	       return time;

	}
	
	private String zeroToTheLeft(int num) {
		
		String result="";
		
		result= String.valueOf(num);
		
		if (num<10)
			result = "0" + result;
		
		return result;
	}
	
	// Esto es un patron cascade
	
	
	private void substractASecond(Time time) {
		if (time.getSecond()==0) {
			time.setSecond(59);
			if (time.getMinute()==0) {
				time.setMinute(59);
				if (time.getHour()==0) {
					time.setHour(23);
				} else {
					time.setHour(getHour()-1);
				}
			} else {
				time.setMinute(time.getMinute()-1);
			}
		}else {
			time.setSecond(time.getSecond()-1);
		}
	}
	
	
}

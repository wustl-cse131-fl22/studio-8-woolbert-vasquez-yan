package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean twelveHour;
	
	/**
	 * 
	 * @param hour: The hour at a certain time
	 * @param minute: The minute at a certain time
	 * @param twelveHour: If the time should be displayed in a twelve hour format
	 */
	
	public Time(int hour, int minute, boolean twelveHour) {
		this.hour = hour;
		this.minute = minute;
		this.twelveHour = twelveHour;
	}
	
	public String toString() {
		if (twelveHour) {
			if (hour >= 12) {
				return hour%12 + ":" + minute + " pm";
			} else {
				return hour%12 + ":" + minute + " am";
			}
			
		} else {
			return hour + ":" + minute;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
  
    }

}
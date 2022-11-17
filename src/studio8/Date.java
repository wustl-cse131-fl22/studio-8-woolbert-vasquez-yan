package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * 
	 * @param month: The month on that date
	 * @param day: The day of that date
	 * @param year: The year of that date
	 * @param holiday: If the date is a holiday or not
	 */
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	public String toString() {
		if (holiday) {
			return month + "/" + day + "/" + year + ": Is a holiday!";
		} else {
			return month + "/" + day + "/" + year;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	public static void main(String[] args) {
		   Date date1 = new Date(1, 1, 2000, true);
		   Date date2 = new Date(1, 1, 2001, false);
		   Date date3 = new Date(1, 1, 2002, true);
		   Date date4 = new Date(1, 1, 2003, false);
		   Date date5 = new Date(1, 1, 2004, true);
		   Date date6 = new Date(1, 1, 2005, false);
		   
		   LinkedList<Date> list = new LinkedList<Date>();
		   HashSet<Date> set = new HashSet<Date>();
		   
		   list.add(date1);
		   list.add(date1);
		   set.add(date1);
		   set.add(date1);
		   
		   System.out.println(set);
    }

}

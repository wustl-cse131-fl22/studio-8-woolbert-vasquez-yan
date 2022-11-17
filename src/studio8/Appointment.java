package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public static void main(String[] args) {
		 Date date1 = new Date(1, 1, 2000, true);
		 Date date2 = new Date(1, 1, 2001, false);
		 Date date3 = new Date(1, 1, 2002, true);
		 
		 Time time1 = new Time(16,20,true);
		 Time time2 = new Time(17,20,true);
		 Time time3 = new Time(18,20,true);
		 
		 Appointment appointment1 = new Appointment(date1, time1);
		 Appointment appointment2 = new Appointment(date2, time2);
		 Appointment appointment3 = new Appointment(date3, time3);
		 
		 LinkedList<Appointment> calender = new LinkedList<Appointment>();
		 
		 calender.add(appointment1);
		 calender.add(appointment2);
		 calender.add(appointment3);
		 
		 System.out.println(calender);
		 
    }
	
}

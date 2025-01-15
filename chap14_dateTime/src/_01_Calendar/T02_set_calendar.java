package _01_Calendar;

import java.util.Calendar;

public class T02_set_calendar {
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2025, 2, 15);
		System.out.println("월 : " + (date1.get(Calendar.MONTH)+1));
		
		System.out.println("이달의 몇번째 주 : " + date1.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올해의 몇번째 주 : " + date1.get(Calendar.WEEK_OF_YEAR));
		
		date1.set(2025, 3, 20, 11, 15, 55);
		System.out.println(date1.get(Calendar.HOUR) + "시");
		
		
	}

}

package _03_enum;

import java.util.Calendar;

public class T03_enumWeek {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);  // day == 3
		
		Week today = null;

		
		
		switch(week) {
		case 1:
			today = Week.MONDAY;
			break;
		case 2:
			today = Week.TUESDAY;
			break;
		case 3:
			today = Week.WENDESDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		}
		
		// 오늘이 일요일
		if(calendar.DATE == 1) {
			System.out.println("일요일엔 짜파게티 먹는날");
		} else {
			System.out.println("아주 열심히 자바 공부하는날");
		}
	
	}
}

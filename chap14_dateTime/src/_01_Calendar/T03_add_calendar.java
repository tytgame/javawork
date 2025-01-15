package _01_Calendar;

import java.util.Calendar;

public class T03_add_calendar {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		date1.add(Calendar.DATE, 100); // 100일 후
		
		System.out.println("오늘 부터 100일 후 : " + (date1.get(Calendar.MONTH)+1) + "월 " 
												+ date1.get(Calendar.DATE) + "일");
		
		Calendar date2 = Calendar.getInstance();
		date2.add(Calendar.DATE, -100); // 100일 전
		
		System.out.println("오늘 부터 100일 전 : "+ date2.get(Calendar.YEAR) + "년 " + (date2.get(Calendar.MONTH)+1) + "월 " 
												+date2.get(Calendar.DATE) + "일");
		
		Calendar date3 = Calendar.getInstance();
		date3.add(Calendar.MONTH, 5); // 5개월 후
		System.out.println(date3.get(Calendar.YEAR) + "년 " + (date3.get(Calendar.MONTH)+1) + "월 " 
												+ date3.get(Calendar.DATE) + "일");
		
		
	}

}

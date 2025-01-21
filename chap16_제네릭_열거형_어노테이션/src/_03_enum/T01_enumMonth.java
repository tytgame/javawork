package _03_enum;

import java.util.Calendar;

public class T01_enumMonth {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();	// 오늘 날짜 얻어오기
		
		int mon = calendar.get(Calendar.MONTH);	// 0 ~ 11
				
		Month month = null;
				
		switch(mon) {
		case 0:
			month = Month.JANUARY;
			break;
		case 1:
			month = Month.FEBURARY;
			break;
		case 2:
			month = Month.MARCH;
			break;
		case 3:
			month = Month.APRIL;
			break;
		case 4:
			month = Month.MAY;
			break;
		case 5:
			month = Month.JUNE;
			break;
		case 6:
			month = Month.JULY;
			break;
		case 7:
			month = Month.AUGUST;
			break;
		case 8:
			month = Month.SEPTEMBER;
			break;
		case 9:
			month = Month.OCTOBER;
			break;
		case 10:
			month = Month.NOVEMBER;
			break;
		case 11:
			month = Month.DECEMBER;
			break;
		}
		
	}

}

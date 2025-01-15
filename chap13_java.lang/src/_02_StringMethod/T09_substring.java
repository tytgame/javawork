package _02_StringMethod;

// substring(fromIndex) : index번호 부터 ~ 끝까지 가져오기
// substring(fromIndex, endIndex) : fromIndex번호 부터 ~ endIndex번호까지 가져오기

public class T09_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		
		String result = str.substring(7);
		System.out.println(result);
		
//		String result2 = str.substring(7,10);
		System.out.println(str.substring(7,10));
		
		String sn = "520523-3245678";
		String gender = sn.substring(7,8);

		if(gender.equals("1")||gender.equals("3")) 
			System.out.println("남자");
		else
			System.out.println("여자");
		
		switch(gender) {
		case "1": case "3":
			System.out.println("남자");
			break;
		default:
			System.out.println("여자");
		}
		
		String birthday_month = sn.substring(2,4);
		String birthday_day = sn.substring(4,6);
		
		System.out.println(birthday_month + "월 " + birthday_day + "일생 입니다");
		
		int age_year = Integer.parseInt(sn.substring(0,2));
		int age_num = (26-age_year);
		System.out.println("나이는 " + age_num + "세 입니다");
		
		int ageSub = Integer.parseInt(sn.substring(0,2));
		
		int ageSub2 = 0;
		if(ageSub <= 25) {
			ageSub2 = ageSub + 2000;
			System.out.println(ageSub2);
		} else {
			ageSub2 = ageSub + 1900;
			System.out.println(ageSub2);
		}
		
		int age2 = 2025 - ageSub2;
		System.out.println("나이는 " + age2 + "세 입니다.");
		//		int gender = Integer.parseInt(sn.substring(7,8));
		/*
		if(gender==1 || gender==3) 
			System.out.println("남자");
		else
			System.out.println("여자");
		
		*/
		
		
		
	}
}

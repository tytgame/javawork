package _05_map;

import java.util.*;

public class T02_HashMap {

	public static void main(String[] args) {
		// 키=id, 값=pw	(3개를 hashMap 넣기)
		Map<String, String> map = new HashMap<>();
		
		map.put("myId", "pw123");
		map.put("myId2", "pw1234");
		map.put("myId3", "pw12345");
		
		// 사용자로부터 id와 pw를 받아서
		// id가 map에 있나 확인. 없으면 '존재하지 않는 id입니다'
		// id가 있으면
		// pw를 보고
		// pw일치하면 로그인 되었습니다
		// pw일치하지 않으면 '비밀번호가 일치하지 않습니다'
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요 : ");
		String id = sc.next();
		String pw = sc.next();
		
		Set<String> keySet = map.keySet();		// 객체 하나씩 출력하기 위한 구문
		Iterator<String> keyInter = keySet.iterator();
		
		/*String key = null;
		String value = null;
		
		while(keyInter.hasNext()) {
			key = keyInter.next();
			value = map.get(key);		// 이렇게 하면 key 랑 value가 마지막값으로만 저장됨. 1개만
			System.out.println(key + " : " + value);
		}*/
		
		/*
		String key = keyInter.next();
		String value = map.get(key);
		*/
		
		
		if(map.containsKey(id)) { // 아이디가 있음 -> true
			if (map.get(id).equals(pw)) {
				System.out.println("로그인 되었습니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {	// 아이디가 없음 -> false
			System.out.println("존재하지 않는 id입니다");
			}
		

	}

}

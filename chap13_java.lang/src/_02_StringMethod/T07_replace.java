package _02_StringMethod;

// replace(기존문자,바꿀문자) : 기존문자를 바꿀문자로 바꾸기
// replaceAll(기존문자,바꿀문자) : 기존문자를 바꿀문자로 바꾸기 (정규표현식 떄)
// replaceFirst(기존문자,바꿀문자) : 맨처음 나오는 문자열만 바꿀문자로 바꾸기

public class T07_replace {

	public static void main(String[] args) {
		String str = "javaprogramming java awsjava dajava";
		
		String reStr = str.replace("m", "abc");
		System.out.println(reStr);
		
		String str2 = "javapro jeava awsjava dajva";
		System.out.println(str2.replace("java", "자바"));
		System.out.println(str2.replaceAll("java", "자바"));
		
		System.out.println("---------------------------------");
		String str3 = "aaabbbccccabcddddabcdeeee";
		  
		String result1 = str3.replace("abc", "왕");
		String result2 = str3.replaceAll("[abc]", "왕");
		  
		System.out.println("replace result->"+ result1);
		System.out.println("replaceAll result->"+ result2);
		
		System.out.println("----------------------------------");
		System.out.println(str2.replaceFirst("java", "자바"));
	}

}

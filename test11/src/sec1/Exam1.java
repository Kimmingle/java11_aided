package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		System.out.println(" a == b : "+(a==b));	//단순 변수의 정수의 값 비교 (참고로 jsp 에서는 오류남. 이렇게 쓰지 말것)
		String s1 = "김기태";
		String s2 = "김기태";
		System.out.println("s1==s2 : "+(s1 == s2));		//문자열의 값 비교
		
		Integer c = new Integer(1004);		//참조형
		Integer d = new Integer(1004);		//참조형
		System.out.println("a==c : "+(a == c));	//기본형과 참조형의 비교는 값 비교
		System.out.println("c==d : "+(c == d));	//참조형과 참조형의 비교는 주소 비교
		
		System.out.println("c equals d : "+( c .equals(d) )); //참조형끼리의 비교는 equals를 써야함
		System.out.println("s1 equals s2 : "+( s1 .equals(s2) ));  //문자열 비교는 이렇게 쓰기
																	// String 연산을 해야 하므로 (s2가 obj로 들어간거임)
		
	}

}

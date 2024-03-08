package sec3;

public class CodeInspectorExam {
//PMD : 코드 인스펙션 -> 소스코드 검증하여 성능 개선, 코드 작성 규칙에 맞게 준수했는지, 에러 발생 가능성을 최소화하기 위해 쓴다.
	
	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2, "http://www.naver.com", "네이버 사이트", 1);
		
		r1.def = "시작 페이지";
//		System.out.println(r2.toString());
//		System.out.println(r2.def);
	}

}

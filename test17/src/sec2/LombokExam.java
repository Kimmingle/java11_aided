package sec2;

public class LombokExam {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("ss");
		mem1.setPoint(11);
		mem1.setPw("12");
		
//		mem1.toString();
		
		Board b1 = new Board();
		b1.setBno(11);
		b1.setTitle("제목");
		b1.setContent("내용"); 
		b1.setViewCnt(22);
		
//		b1.toString();
		
		//적용이 안되서 에러남 웹이 있어야 작동할듯
	}

}

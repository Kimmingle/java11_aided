package sec1;



import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		
		
		
		@SuppressWarnings("depresation")
		Date date2 = new Date(1981, 11, 25, 07,24,37);  //년, 월(-1해주기), 일, 시간
		
		@SuppressWarnings("depresation")
		Date date3 = new Date("Mon, 02 Apr 2001 07:24:37 +0900");   //0900 : RFC 822규격
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("-----------LocalDate----------");
		
		LocalDate n1 = LocalDate.now();    //static이라 .now()쓴다
		System.out.println(n1);		//날짜 데이터
		String now2 = n1.toString();   //날짜 데이터 -> 문자열 데이터로 바꾸기
		LocalDate n3 = LocalDate.parse(now2);   //문자열 데이터 ->날짜 데이터
	}

}

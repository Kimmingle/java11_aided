package sec1;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		System.out.println("현재 년도 : "+year);
		
		int month = today.get(Calendar.MONTH)+1; //0~11 이므로 +1
		System.out.println("현재 월 : "+month);
		
		int day = today.get(Calendar.DATE);
		System.out.println("현재 일 : "+day);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("현재 년도 ; "+year);
		System.out.println("현재 년도 ; "+month);
		System.out.println("현재 년도 ; "+day);
		
		System.out.println("오늘은 현재 년도의  "+doy+"일 째");
		System.out.println("오늘은 현재 월의 "+dom+"번째 날");
		System.out.println("오늘은 이번주의  "+dow+"번째 날");
		
		String[] wk = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println("오늘은  "+wk[dow]+"입니다.");
		
		
		
	}

}

package sec1;



import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		
		
		
		@SuppressWarnings("depresation")
		Date date2 = new Date(1981, 11, 25, 07,24,37);  //��, ��(-1���ֱ�), ��, �ð�
		
		@SuppressWarnings("depresation")
		Date date3 = new Date("Mon, 02 Apr 2001 07:24:37 +0900");   //0900 : RFC 822�԰�
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("-----------LocalDate----------");
		
		LocalDate n1 = LocalDate.now();    //static�̶� .now()����
		System.out.println(n1);		//��¥ ������
		String now2 = n1.toString();   //��¥ ������ -> ���ڿ� �����ͷ� �ٲٱ�
		LocalDate n3 = LocalDate.parse(now2);   //���ڿ� ������ ->��¥ ������
	}

}

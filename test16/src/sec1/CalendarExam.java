package sec1;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		System.out.println("���� �⵵ : "+year);
		
		int month = today.get(Calendar.MONTH)+1; //0~11 �̹Ƿ� +1
		System.out.println("���� �� : "+month);
		
		int day = today.get(Calendar.DATE);
		System.out.println("���� �� : "+day);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("���� �⵵ ; "+year);
		System.out.println("���� �⵵ ; "+month);
		System.out.println("���� �⵵ ; "+day);
		
		System.out.println("������ ���� �⵵��  "+doy+"�� °");
		System.out.println("������ ���� ���� "+dom+"��° ��");
		System.out.println("������ �̹�����  "+dow+"��° ��");
		
		String[] wk = {"", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		System.out.println("������  "+wk[dow]+"�Դϴ�.");
		
		
		
	}

}

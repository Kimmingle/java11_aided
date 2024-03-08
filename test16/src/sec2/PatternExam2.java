package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		String[] email = {"kktn", "kim1004@", "t55@naver.com", "kim@naver.com", "single@naver.com"};

		
		Pattern p = Pattern.compile("[0-9a-z]+@[a-z0-9]+\\.[a-z]+$"); 	//�̸��� ����
		for (int i=0; i<email.length; i++) {			
			Matcher m = p.matcher(email[i]);
			if(m.matches()) {
				System.out.println("�̸����� �½��ϴ�. "+email[i]);
			}
		
		}
		
		String[] phone = {"02-15", "1234", "010-4016-5328", "032-8457-4658", "010-4625-5132", "010-956-7894"};

		System.out.println();
		
		Pattern p1 = Pattern.compile("010-\\d{3,4}-\\d{4}"); 	//010���� �����ϰ� -�ڿ� 10���� 3�ڸ�, 4�ڸ� -�ڿ� 10���� 4�ڸ��� ������
		for (int i=0; i<phone.length; i++) {			
			Matcher m = p1.matcher(phone[i]);
			if(m.matches()) {		//���ڷ� ����ǥ������ �ް�, ���ڿ��� ������ ��ġ�ϴ����� ����
				System.out.println("�� ��ȣ ������ �½��ϴ�. "+phone[i]);
			}
		
		}
		
		String[] rnum = {"060846-498516", "01084-4985316", "1234", "010612-4956285", "990516-4861584", "020805-4819532", "760324-7629485"};

		System.out.println();
		
		Pattern p2 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}"); 	//10���� 6�ڸ� -�ڿ�1~4�� ����, 10���� 6�ڸ��� ������
		for (int i=0; i<rnum.length; i++) {			
			Matcher m = p2.matcher(rnum[i]);
			if(m.matches()) {		//���ڷ� ����ǥ������ �ް�, ���ڿ��� ������ ��ġ�ϴ����� ����
				System.out.println("�ֹι�ȣ ������ �½��ϴ�. "+rnum[i]);
			}
		}
		
		String[] pw = {"abcd123", "A12-26", "A1231!", "K5328", "015555", "Kmina01!"};

		System.out.println();
		
		Pattern p3 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.[0-9])(?=.!@#$%^&*?_]).{4,10}$"); 	//
		for (int i=0; i<pw.length; i++) {			
			Matcher m = p3.matcher(pw[i]);
			if(m.matches()) {		//���ڷ� ����ǥ������ �ް�, ���ڿ��� ������ ��ġ�ϴ����� ����
				System.out.println("��й�ȣ ������ �½��ϴ�. "+pw[i]);
			}
		}
	}
}

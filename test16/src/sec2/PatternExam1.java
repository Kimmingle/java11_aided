package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam1 {
//Pattern : Ư�� �����Ͱ�  ������ �´��� ���Ϸ��� �� ��� Ư�� ������ ������ �����ϴ� Ŭ����
//Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ����
//���Խ� :  
	public static void main(String[] args) {
		String[] dt = {"bag", "kim1004", "9to6", "8to5", "single", "Mom", "ABC", " ��ξ�", "^_^"};
//		Pattern p = Pattern.compile("[a-z]*");    //���� �ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("[0-9a-z]*");  	//���ڿ� ���� �ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("[0-9a-z]*");   //���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("s[A-Za-z]*");   //s�� �����ϸ鼭 ���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������
//		Pattern p = Pattern.compile("[��-�R]*");   	 //�ѱ۷θ� ������ ������
//		Pattern p = Pattern.compile("e$*");   	 //Ư�����ڷ� ������ ������
//		Pattern p = Pattern.compile("^b");   	 //Ư�����ڷ� �����ϴ� ������
		Pattern p = Pattern.compile("[0-9]*");   		 //��� ���� ������ ������   //���� �ȳ����°� �����̶�µ� �� �ȳ����µ�
		
		for (int i=0; i<dt.length; i++) {			
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("���� ��ġ : "+dt[i]);
			}
		}
	}

}

package sec2;

import java.io.IOException;

public class SystemInExam {

	public static void main(String[] args) throws IOException{
		System.out.println("�����͸� �Է��ϰ�, [enter]�� ��������");
		int i ;
		try {
			i = System.in.read();  //�ƽ�Ű �ڵ� �ѱ��� �Է� ��� -> ����Ʈ ���� �Է�
			System.out.println(i);
			System.out.println("�Էµ� ���� : "+((char)i));
			
		}catch (IOException e ){
			e.printStackTrace();
		}
	}

}

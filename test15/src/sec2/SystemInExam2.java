package sec2;

import java.io.IOException;

public class SystemInExam2 {
//Ű���� �������� �Է��Ͽ� ���������� �Է��Ͽ� ���
	public static void main(String[] args) throws IOException{
		System.out.println("���� �ܾ� �Ǵ� ������ �Է��ϰ�, [enter]�� ��������");
		int i ;
		String data ="";
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println((char)i);
				data += (char)1;  // 
			}
		}catch (IOException e ){
			e.printStackTrace();
		}
		System.out.println("�Էµ� �ܾ� �Ǵ� ���� : " +data);
	}

}

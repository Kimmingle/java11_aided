package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExam {

	public static void main(String[] args) {
		FileInputStream fis = null; //�Է°����� ���� �ϳ��� ���� 
		
		try {
			fis = new FileInputStream("a.txt"); //���� ���� ���
		} catch(FileNotFoundException e) { 
			System.out.println(e);
		} finally {
			if (fis != null) {  //null�� �ƴ϶�� close
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�����̵� ���е� �׻� ����");
		}
		System.out.println("����ó���� ���� ����");
	}

}

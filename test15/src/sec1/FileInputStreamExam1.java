package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//����Ʈ ��Ʈ�� ������ ������ ������ �������� �Ҷ�
//����Ʈ ������ ������ char�� ��ȯ�Ͽ� �о���� ���ڿ��̳� Ư������ ���� �� ����. 
public class FileInputStreamExam1 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
		
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while( (i = fis.read() ) != -1) {
			
			System.out.println((char)i);
		}
		
		
		
		
		
		
//		try {
//			fis.close();
//		} catch (Ex)
	}

}

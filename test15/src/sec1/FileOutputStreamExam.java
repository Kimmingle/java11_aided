package sec1;
//������ ������ ����Ʈ ������ �������� Ŭ����

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExam {

	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
		if (f1.createNewFile()) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("������ �̹� ����");
		}
		
		String data = "Hello Java";  //b.txt���Ͽ� "Hello Java"����
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes()); //getbyte����� ��Ʈ���� ����Ʈ������ �迭�� ������ 
		fos.close();
		
		
	}

}

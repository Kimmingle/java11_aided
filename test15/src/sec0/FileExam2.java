package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		File f1 =  new File ("a.txt");  		//���� ���丮�� ������ �ֵ� ���� ���� ��ü�� ������
		File f2 =  new File ("../sec1/a.txt");		//���� ��Ű���� sec0�ε� ���� ���丮�� sec1�� �̵��Ͽ� a.txt�� 
		File f3 = new File ("d:"+File.separator+"kim" + File.separator+ "java2"+File.separator+"a.txt");
		
		System.out.println(f3);
		
		//���� ������ ����
		String path = "d:\\kim\\java2\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\kim\\java2\\", "a.txt");
		
		
		
		
		
//		if (f1 ==null) {
//			System.out.println("���� ����");
//		}
		
		
	}

}

package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThowsExam {

	public static void main(String[] args) throws  IOException, FileNotFoundException {  //IOException�� ������ ��� FileNotFoundException�� ��������
		
		FileInputStream fis = null;
//		fis = new FileInputStream("a.txt");   //bin�� a.txt�� ��ġ���־���� -��Ҹ�?
		
		String absolutePath = "d:\\kma\\java2\\test15\\a.txt";  //"������"
		String relativePath = "./a.txt";  //����� ->���� ���丮
		String relativePath2 = "../a.txt"; //..�� ���� ���丮 ->
		fis = new FileInputStream(absolutePath);     
		
		if(fis != null) {
			fis.close();
		}
	}
}

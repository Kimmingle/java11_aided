package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//���ϰ� ���丮 ����
public class FileExam3 {

	public static void main(String[] args) throws IOException {
		File f = new File("s");
		
		f.mkdir();  //test15�� ���� ���丮 �̹Ƿ� test15�ȿ� student ���丮 ����
		
		File f2 = new File("manage/teacher/kt");
		f.mkdirs();
		
		//���丮 ���� ��¥�� �ð� �����ϱ�
		f.setLastModified(new Date().getTime());
		
		//���丮 �б��������� ��ȯ
		f.setReadOnly();
		
	
	}

}

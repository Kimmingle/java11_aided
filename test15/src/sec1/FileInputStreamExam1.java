package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//바이트 스트림 단위로 파일의 내용을 읽으려고 할때
//바이트 단위기 때문에 char로 변환하여 읽어오고 문자열이나 특수문자 읽을 수 없다. 
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

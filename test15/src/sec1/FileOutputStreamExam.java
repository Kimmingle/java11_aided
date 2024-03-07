package sec1;
//파일의 내용을 바이트 단위로 쓰기위한 클래스

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExam {

	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
		if (f1.createNewFile()) {
			System.out.println("파일 생성 성공");
		} else {
			System.out.println("파일이 이미 존재");
		}
		
		String data = "Hello Java";  //b.txt파일에 "Hello Java"쓰기
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes()); //getbyte해줘야 스트링을 바이트단위의 배열로 변경함 
		fos.close();
		
		
	}

}

package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThowsExam {

	public static void main(String[] args) throws  IOException, FileNotFoundException {  //IOException가 있으면 사실 FileNotFoundException은 생략가능
		
		FileInputStream fis = null;
//		fis = new FileInputStream("a.txt");   //bin에 a.txt가 위치해있어야함 -몬소리?
		
		String absolutePath = "d:\\kma\\java2\\test15\\a.txt";  //"절대경로"
		String relativePath = "./a.txt";  //상대경로 ->현재 디렉토리
		String relativePath2 = "../a.txt"; //..은 상위 디렉토리 ->
		fis = new FileInputStream(absolutePath);     
		
		if(fis != null) {
			fis.close();
		}
	}
}

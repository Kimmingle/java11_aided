package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExam {

	public static void main(String[] args) {
		FileInputStream fis = null; //입력가능한 파일 하나를 연다 
		
		try {
			fis = new FileInputStream("a.txt"); //파일 내용 출력
		} catch(FileNotFoundException e) { 
			System.out.println(e);
		} finally {
			if (fis != null) {  //null이 아니라면 close
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행");
		}
		System.out.println("예외처리의 다음 문장");
	}

}

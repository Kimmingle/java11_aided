package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//파일과 디렉토리 제어
public class FileExam3 {

	public static void main(String[] args) throws IOException {
		File f = new File("s");
		
		f.mkdir();  //test15가 현재 디렉토리 이므로 test15안에 student 디렉토리 생성
		
		File f2 = new File("manage/teacher/kt");
		f.mkdirs();
		
		//디렉토리 생성 날짜와 시간 변경하기
		f.setLastModified(new Date().getTime());
		
		//디렉토리 읽기전용으로 변환
		f.setReadOnly();
		
	
	}

}

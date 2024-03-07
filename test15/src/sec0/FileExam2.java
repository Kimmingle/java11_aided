package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		File f1 =  new File ("a.txt");  		//현재 디렉토리에 파일이 있든 없든 파일 객체가 생성됨
		File f2 =  new File ("../sec1/a.txt");		//현재 패키지는 sec0인데 상위 디렉토리로 sec1로 이동하여 a.txt를 
		File f3 = new File ("d:"+File.separator+"kim" + File.separator+ "java2"+File.separator+"a.txt");
		
		System.out.println(f3);
		
		//파일 절대경로 지정
		String path = "d:\\kim\\java2\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\kim\\java2\\", "a.txt");
		
		
		
		
		
//		if (f1 ==null) {
//			System.out.println("파일 없음");
//		}
		
		
	}

}

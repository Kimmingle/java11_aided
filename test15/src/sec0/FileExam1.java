package sec0;

import java.io.File;  // 파일 입출력은 다 이 안에 있음
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args) throws IOException {
		String file1 = "d:\\kma\\java2\\a.txt";
		String file2 = "http://192.168.1.104/data/menual/java.txt";		//원격(웹)의 경로url
		
		File f1= new File(file1);
		String fileName = f1.getName();
		System.out.println(fileName);
		
		int pos = fileName.lastIndexOf(".");  //확장자 빼기위해서 .위치 찾음
		System.out.println("확장자와 파일 명의 구분을 나타내는 점의 위치 : "+pos);
		System.out.println("확장자를 제외한 파일의 이름 : "+ fileName.substring(0, pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일의 이름(절대경로) : "+f1.getAbsolutePath());
		System.out.println("경로를 포함한 파일의 이름(상대경로) : "+f1.getPath());  //getPath는 내가 기재한것
		System.out.println("파일이 속해있는 상위 디렉토리 : "+f1.getParent());
		System.out.println("경로 구분자 : "+File.separator);  	//File.Separatorchar와 동일
		
		//시스템 변수 값 가져오기 => System.getProperty("시스템 변수 명")
		System.out.println("현재 사용자 디렉토리(user.dir): "+System.getProperty("user.dir"));
		System.out.println("현재 사용자 디렉토리(sun.boot.class.path): "+System.getProperty("sun.boot.class.path"));
		System.out.println("운영체제(OS) 환경변수 값 : "+System.getenv());
		System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME"));
		
	}
}

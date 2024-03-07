package sec2;

import java.io.IOException;

public class SystemInExam {

	public static void main(String[] args) throws IOException{
		System.out.println("데이터를 입력하고, [enter]를 누르세요");
		int i ;
		try {
			i = System.in.read();  //아스키 코드 한글자 입력 명령 -> 바이트 단위 입력
			System.out.println(i);
			System.out.println("입력된 문자 : "+((char)i));
			
		}catch (IOException e ){
			e.printStackTrace();
		}
	}

}

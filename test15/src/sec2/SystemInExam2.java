package sec2;

import java.io.IOException;

public class SystemInExam2 {
//키보드 여러글자 입력하여 여러단위로 입력하여 출력
	public static void main(String[] args) throws IOException{
		System.out.println("영문 단어 또는 문장을 입력하고, [enter]를 누르세요");
		int i ;
		String data ="";
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println((char)i);
				data += (char)1;  // 
			}
		}catch (IOException e ){
			e.printStackTrace();
		}
		System.out.println("입력된 단어 또는 문장 : " +data);
	}

}

package sec1;

public class classStreamExam {
// 파일-키보드-데이터 입출력 : FileInputStream, BufferedInputStream, FileReader, BufferedReader
// 파일 -모니터- 데이터 입력 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriterer

//Stream으로 끝나지 않는 클래스는 데이터 입출력을 바이트 단위로 : FileInputStream, BufferedInputStream, FileReader, BufferedReader
//Stream으로 끝나지 않는 클래스는 데이터 입출력을 문자 단위로 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriterer
	
	public static void main(String[] args) {
		String fileInputStream = "바이트 단위로 입력하기 위한 스트림";
		String bufferInputStream = "바이트 단위로 입력하기위한 스트림 : 메모리 버퍼 로딩 후";
		String FileReader = "문자단위로 입력하기 위한 스트림";
		String BufferedReader = "문자단위로 입력하기위한 스트림 : 메모리 버퍼 로딩 후";
		String FileOutputStream = "바이트 단위로 출력하기위한 스트림";
		String BufferedOutputStream = "바이트 단위로 출력하기위한 스트림 : 메모리 버퍼 로딩 후";
		String FileWriter = "문자단위로 출력하기위한 스트림";
		String BufferedWriterer = "문자 단위로 출력하기위한 스트림 : 메모리 버퍼 로딩 후 ";
//		String bufferInputStream = "";
//		String bufferInputStream = "";
		
		System.out.println(fileInputStream);
		System.out.println(bufferInputStream);
		System.out.println(FileReader);
		System.out.println(BufferedReader);
		System.out.println(FileOutputStream);
		System.out.println(BufferedOutputStream);
		System.out.println(FileWriter);
		System.out.println(BufferedWriterer);
		
		
		
		
		
		
	}

}

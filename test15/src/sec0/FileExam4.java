package sec0;

import java.io.File;
import java.io.IOException;
//a.txt, b.txt 없으면 새로 만들기
public class FileExam4 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("a.txt");
		File file2 = new File("b.txt");
		
		if(file1.createNewFile()) {  //이미 있는거라 파일 있다고 뜸
			System.out.println("File1 Create Success");
		} else {
			System.out.println("File1 already exists");
		}
		if(file2.createNewFile()) {  //파일 새로 만들었다고 뜸
			System.out.println("File2 Create Success");
		} else {
			System.out.println("File2 already exists");  
		}
	}

}

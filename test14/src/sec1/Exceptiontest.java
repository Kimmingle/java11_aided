package sec1;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptiontest {

	public static void main(String[] args) throws IOException {
		String name = null;
		
		try {
			FileInputStream fis = new FileInputStream("f.txt");
		}catch (IOException e) {
			System.out.println("IOException ���� �߻�");
		}finally {
			System.out.println("���ܹ߻�");
		}
		
		
	}

}

package sec2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class AutoResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("���ҽ� �ڵ� close");

	}
}

public class WithResorceExam {

	public static void main(String[] args) throws Exception {
		
		try (AutoResource obj = new AutoResource()){
			throw new Exception();
		} catch  (IOException e){
			System.out.println("���ܺκ�");
		}
				
	}

}

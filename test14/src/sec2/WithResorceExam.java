package sec2;

import java.io.FileInputStream;
import java.io.IOException;

class AutoResorce implements AutoClose{

	@Override
	public int close() throws Exception {
		System.out.println("리소스 자동 close");


}

public class WithResorceExam {

	public static void main(String[] args) throws Exceprion {
		
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");
		if (fis != null) {
			try  (AutoResource obj = new AutoResource()){
				throw new Exception();
			} catch  (IOException e){
				e.printStackTrace();
			}
				
			
			
		}
		
	}

}

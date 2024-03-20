package sec3;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;

public class IOService {

	
	
	public static void main(String[] args) {
		output1();
		
		
		
	}
	
	public static void output1() {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			String str = "안녕하세요! hi";
			
			
			
			for (int i=0; i<str.length(); i++) {
//				toString(str.charAt(i));
//				fos.write();
				
				
				
			}
			System.out.println(String.valueOf(fos));
			
//			String dec_data = URLDecoder.decode(str, "UTF-8");
//			System.out.println("디코딩 : "+dec_data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

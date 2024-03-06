package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String names = "김민아, 김민석, 이희훈, 이예링, 이연정";	//구분기호(delim)
		String anis = "개의새끼 \f 소의새끼 \n 말의새끼 \t 꿩의새끼 \r 쥐의새끼";
		System.out.println(anis);
		StringTokenizer st = new StringTokenizer(anis);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
	}

}

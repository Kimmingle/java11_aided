package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name = "김민아";
		String name2 = new String ("김민아");
		Integer su1 = 1004;			//int 로하면 밑에서 에러남 (둘 다 참조형이 아니라서)
		String su2 = "1004";
//		String su3 = new String(su1);
		String su3 = String.valueOf(su1);
		System.out.println(su1.equals(su2));
		System.out.println(su2.equals(su3));
		
		
		
		
		
		String str = "김민아/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
		names = str.split("/");		//문자열 쪼개기               
		for (String s : names) {
			System.out.println(s);
		}
		String str2 = String.join(",", names);  //합친 문자열  str2에 합치기
		System.out.println(str2);          
		
		String data = "ivE\'s beaUty grOup\nnewJeans is girlGroup Top";
		
		
		char ten = data.charAt(9);					//10번째 문자(인덱스가 9인 문자)
		System.out.println("10번째 문자 (인덱스가 9인 문자) : "+ten);
		String trimData = data.trim();   				//앞뒤의 공백을 제거하여 trimData에 저장
		System.out.println("앞뒤의 공백을 제거 : "+trimData.length()+"글자, "+trimData);
		int size = data.trim().length();					//글자수를 size에 저장
		System.out.println("앞뒤의 공백을 제거한 글자 수 : "+size);
		int n = data.indexOf("n");						//첫번째 n의 글자 위치를 n에 저장
		System.out.println("n의 글자 위치를 n에 저장 : "+n);
		int n2 = data.lastIndexOf("n");						//마지막 n의 글자 위치를 n에 저장
		System.out.println("n의 글자 위치를 n에 저장 : "+n2);
		String up = data.toUpperCase();					//모두 대문자로 변환하여 up에 저장
		System.out.println("모두 대문자로 변환하여 up에 저장 : "+up);
		String down = data.toLowerCase();  				 //모두 소문자로 변환하여 down에 저장
		System.out.println("모두 소문자로 변환하여 down에 저장 : "+down);
		String sub1 = data.substring(20, 28);  				//공백을 제거하고 20번째 글자부터 27번째만 추출하여 sub1에 저장
		System.out.println("공백을 제거하고 20번째 글자부터 27번째만 추출하여 sub1에 저장 : "+sub1);
		String sub2 = data.replace("newjeans", "Kepler");	 				 //newjeans의 단어를 Kepler로 변경하여 sub2에 저장
		System.out.println("newjeans의 단어를 Kepler로 변경하여 sub2에 저장 : "+sub2);
		byte[] girl = data.trim().getBytes();  				//문자열을 girl 문자배열(byte)로 변환하여 저장
		System.out.println("글자 수 : "+girl.length);
		for (byte b : girl) {
			char k = (char)b;
			System.out.println(k);
		}
		String girlgroup = data.substring(data.lastIndexOf('g'), data.lastIndexOf('g')+9);		//girl의 g의 마지막 위치부터 9 문자를 추출하여 
		girlgroup = girlgroup + " " +sub1;
		System.out.println(girlgroup);
		
		//문자 배열(byte)을 문자열(String)으로 변환하여 출력
		String str4 = new String(girl);
		System.out.println(str4);
		
		
	}

}

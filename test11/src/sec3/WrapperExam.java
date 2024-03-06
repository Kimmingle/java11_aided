package sec3;

public class WrapperExam {

	public static void main(String[] args) {
		int a = 10;		//기본타입 선언
		Integer b = a;		//참조형 타입 선언(참조형에 기본형 데이터 넣음 'wrapping'이라고 한다. )
		int c = b;		//기본형에 참조형 데이터를 넣음 'unwrap', 'unboxing'
		
		
		
		System.out.println(a);
		
	}

}

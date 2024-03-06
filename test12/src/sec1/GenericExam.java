package sec1;

public class GenericExam {

	public static void main(String[] args) {
		Generic1 <Student> s = new Generic1<>();
		Student a = new Student("장원영", 21);
		s.setField1(null);
		
		Generic1 <Student> t = new Generic1<>();
		Student b = new Student("장원영", 21);
		t.setField1(null);
		
//		Generic1 <int> s = new Generic1<>();  참고로 기본 자료형으로는 만들 수 없음
		Generic1 <Integer> i = new Generic1<>();
		i.setField1(1004);
		
		Generic1 <String> str = new Generic1<>();
		str.setField1("김민아");
		
		
	
	}

}

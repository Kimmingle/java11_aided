package sec2;


//람다 :  함수 및 메소드를 더 간소화 한 식

//자바의 기본적인 람다 정의 방법 : 함수적 인터페이스
//함수적 인터페이스는 @FunctionalInterface 로 정의하고, 메소드는 오로지 하나만  가져야 한다. 
//@는 자바에서 어노테이션을 의미
//Annotation : 개발자가 컴파일러에게 특정한 것임을 알려주는것으로 만약 기술하지 않으면 컴파일러가 정체를 알수 없는 오류를 발생 시킨다. 

@FunctionalInterface 
interface Lamda1 {   //매개변수 x, 반환 x
	void method();
}
@FunctionalInterface 
interface Lamda2 {   //매개변수 o, 반환 x
	void method2(int x, int y);
}
@FunctionalInterface 
interface  Lamda3 {   //매개변수 x, 반환 o
	int method3();
}
@FunctionalInterface 
interface Lamda4 {   //매개변수 o, 반환 o
	int method4(int x, int y);
}

public class LambdaExam {
	public static void main(String[] args) {
		
//		Lamda1 f1 = new Lamda1() {
//
//			@Override
//			public void method() {
//				int x=100, int y = 200;
//				System.out.println(x+y);
//			}
//		};
		System.out.println("람다식1 - 매개변수x, 반환x");  //인터페이스 하나당 메소드 하나
		Lamda1 f1 = ()-> {
			int x = 100;
			int y = 200;
			System.out.println(x+y);
		};
		
		System.out.println("람다식2 - 매개변수x, 반환o");
		Lamda2 f2 = (int x, int y)-> {
			System.out.println(x+y);
		};
		
		System.out.println("람다식3 - 매개변수x, 반환o");
		Lamda3 f3 = ()-> {
			int x = 100;
			int y = 200;
			return x+y;
		};
		System.out.println(f3.method3());
		
		System.out.println("람다식4 - 매개변수o, 반환o");
		Lamda4 f4 = (int x, int y)-> {
			return x+y;
		};
		System.out.println(f4.method4(100, 500));
	}

}

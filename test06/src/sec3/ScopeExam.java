package sec3;
// Scope : 특정 변수가 영향을 미지는 범위
public class ScopeExam {
	int a = 10;			//전역변수 - 클래스 전체에서 인지되는 변수이지만 , 특정 메소드(함수)내에서는 인지하지 못함 
	static int b = 100;		//클래스 변수 - 클래스 전역에서 인지되며 Global Scope
	public static void main(String[]args ) {
		
		int a = 20;			//지역변수 : 특정 메소드 내에서 선언되어 활용되는 변수로써 함수 블록을 벗어나면 인지할 수 없음
		System.out.println("지역변수 a="+a);
		run();
		run(30);
	}
	public static void run() {
		int c = 20;		//지역변수
//		System.out.println("a="+a);      //에러남 - 전역변수는 함수안에서 쓸 수 없는듯
		System.out.println("b="+b);		//b는 static이니까 공유데이터 - 에러안남  
	}
	public static void run(int a) {			//매개변수 : 정의시 괄호에 있는 변수로 호출 시 지정된 값을 저장한다. Local Scope 
		System.out.println("a="+a);
	}
	
	
	
	
	
}

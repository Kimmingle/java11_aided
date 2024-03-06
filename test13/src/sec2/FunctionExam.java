package sec2;

//메소드 기술
class Met1 {
	void method1() {  //매개변수x, 반환x
		int x = 100, y = 200;
		System.out.println(x+y);
	}
}

class Met2 {		//매개변수o, 반환x
	void method2(int x, int y) {
		System.out.println(x+y);
	}
}
class Met3 {
	int method3() {
		int x= 100, y = 200;
		return x+y;
	}
}
class Met4 {
	int method4(int x, int y) {
		return x+y;
	}
}

public class FunctionExam {
//메서드 : 특정 클래스에 멤버로 규정되어 객체를 생성하고, 해당 객체.메소드 명
	public static void main(String[] args) {
		
		System.out.println("-----메서드-------");
		Met1 met1 = new Met1();
		met1.method1();
		
		Met2 met2 = new Met2();
		met2.method2(100,200);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(100, 200));
		
		
		System.out.println("-----함수-------");
		fnc1();
		fnc2(100, 200);
		System.out.println(fnc3());
		System.out.println(fnc4(100,200));		//다른클래스에서는 함수를 못쓰니까 함수가 좋다고 할 수도 없음!
	}
	
	
	public static void fnc1() {  //매개변수x, 반환x
		int x =100;
		int y =200;
		System.out.println(x+y);
	}
	public static void fnc2(int x, int y) { //매개변수o, 반환x
		
		System.out.println(x+y);
	}
	
	public static int fnc3() { //매개변수o, 반환x
		
		int x= 100, y = 200;
		return x+y;
	}
	public static int fnc4(int x, int y) {
		return x+y;
	}

}
